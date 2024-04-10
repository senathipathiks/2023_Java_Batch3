import axios from 'axios';
import React, { useEffect,useState } from 'react'
import { Link, useParams } from 'react-router-dom'

export default function ViewInvent() {

    const [invent,setInvent]=useState({
        itemName:"",
        price:"",
        quant:""
})

//since we will be getting specific user for specific id we will be using useparam
const {itemId}=useParams();

useEffect(()=>{
  loadInvent()
},[])

const loadInvent=async()=>{
console.log(itemId);
    const result=await  axios.get(`http://localhost:8080/invent1/${itemId}`).then(res => {

      setInvent(res.data)
      
    }).catch((err)=>{
      console.log("Error")
    })
    // setInvent(result.data)
}


  return (
    <div className='container '>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
            <h2 className='text-center m-4'> INVENTORY DETAILS</h2>
            <div className='card'>
                <div className='card-header '>
                      Details of Item id:{invent.itemId}

                      <ul className='list-group list-group-flush'>
                        <li className='list-group-item'>
                            <b>Item Name:</b>
                            {invent.itemName}
                        </li>
                        <li className='list-group-item'>
                            <b>Item Price:</b>
                            {invent.price}

                        </li>
                        <li className='list-group-item'>
                            <b>Item Quantity:</b>
                            {invent.quant}

                        </li>
                      </ul>

                </div></div>
                <br/>
                <Link className='btn btn-success my-2' to={"/home"}> Back To Home Page</Link>
            </div>
            </div>
            </div>
  )
}
