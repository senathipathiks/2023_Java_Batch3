import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';

export default function EditInvent() {

  //to navigate to the home page after clicking submit
  let navigate=useNavigate();


  const {itemId}=useParams()
    const [invent,setInvent]=useState({
             itemName:"",
             price:"",
             quant:""
    })
    //destruturing
    const {itemName,price,quant}=invent

        //.. for keep on adding new data or objects

    const onInputChange=(e)=>{
     setInvent({...invent,[e.target.name]:e.target.value});
    };

    useEffect(()=>{
        loadInvent()
    },[]);


    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onSubmit=async(e)=>{
    if (invent.itemName !== "" && invent.price !== "" &&  invent.quant !== "") {

      e.preventDefault();
      await axios.put(`http://localhost:8080/invent/${itemId}`,invent)
      alert('Inventory Details Added Succesfully !!')
      navigate('/home');
    }
    else{
      alert("please fill out all the record")
    }
  }

  

    const loadInvent=async()=>{
        const result=await axios.get(`http://localhost:8080/invent1/${itemId}`)
        setInvent(result.data)
    };
    
  return (
    <div className='container '>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
            <h2 className='text-center m-4'><b>UPDATE INVENvTORY DETAILS</b></h2>
            <form onSubmit={(e)=>onSubmit(e)}>
            <div className='mb-3'>
                <label htmlFor='ItemName' className='form-label '><b>ITEM NAME :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item Name'
                 name="itemName"
                 value={itemName}
                 onChange={(e)=>onInputChange(e)}/></div>
            <div className='mb-3'>
                <label htmlFor='price' className='form-label '><b>ITEM PRICE :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item  Price '
                 name="price"
                 value={price}

                 onChange={(e)=>onInputChange(e)}/>
                 </div>
           <div className='mb-3'>
                <label htmlFor='quantity' className='form-label '><b>ITEM QUANTITY :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item Quantity '
                 name="quant"
                 value={quant}
                 
                 onChange={(e)=>onInputChange(e)}/>
                 </div>
                 <button type='submit' className='btn btn-info'>SUBMIT</button>
                 <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                 </form>
        </div>
        </div>
    </div>
  )
}
