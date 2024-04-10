import React, { useEffect } from 'react'
import { Link, useNavigate,} from 'react-router-dom';
import { useState } from 'react';
import axios from 'axios';

export default function DeleteInvent() {

    let navigate=useNavigate()


    const [invents,setInvents]=useState([])
    const [id, setId] = useState(0);
 

       useEffect((e)=>{  
        loadInvent()
    },[]);

    
       const loadInvent=()=>{
        axios
        .get("http://localhost:8080/inventauto")
       .then((res)=>{
        setInvents(res.data);
        console.log(res.data)
       
       })
       .catch((err)=>console.log(err))
        }

        

   const onSubmit=async(e)=>{
    e.preventDefault();
                 await axios.delete(`http://localhost:8080/invent/${id}`)
                 .then((res)=>{
                    navigate("/home") 
                    alert('Deleted Successfully :)')
                    console.log(res.data)
                })
                .catch((err)=>console.log(err))
            };
                
 return (
    <div className='container '>
    <div className='row'> 
    <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
        <h2 className='text-center m-4'><b>DELETE INVENTORY DETAILS BY ID</b></h2>
        <form onSubmit={onSubmit}>
        <div className='mb-3'>
            <label htmlFor='ItemId' className='form-label '><b>ITEM ID :</b></label>
            <select type={'text'}
             placeholder='Enter Id '
             name="itemId"
             
             onChange={(e)=>setId(e.target.value)}>
                <option selected>Select one</option>
             {invents.map((items)=>(
                   
                 
             <option value={items} key={items}>
                {items}

             </option>
               ))}

             </select>
             </div>
       
             <button type='submit' className='btn btn-info' >Delete</button>
             <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


             </form>
    </div>
    </div>
</div>
  )
}
