import axios from 'axios';
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';

export default function AddInvent() {

  //to navigate to the home page after clicking submit
  let navigate=useNavigate()
  
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
    
    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onSubmit=async(e)=>{

      console.log(invent)
      
      if (invent.itemName !== "" && invent.price !== "" &&  invent.quant !== "") {
      e.preventDefault();
      await axios.post("http://localhost:8080/invent",invent);
      
      alert('Inventory Details Added Successfully !!')
      navigate("/home");
        
      }else{
        alert("please fill out all the record")
      }
      
    };


    const[errors,setErrors]=useState({})

    
    const handleError=(e)=>{
      e.preventDefault()  
      const ValidationErrors={}
      if(!invent.itemName.trim()){
          ValidationErrors.itemName="ItemName is required"
      }
      else if(!invent.price.trim()){
          ValidationErrors.price="Item price is required"
      }
      
      else if(!invent.quant.trim()){
          ValidationErrors.quant="quantity is required"
      }
      
     setErrors(ValidationErrors)
    
     }
return (
    <div className='container '
    id='Card'>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
            <h2 className='text-center m-4' ><b className='.text-danger'> REGISTER INVENTORY DETAILS</b></h2>
            <form onSubmit={(e)=>onSubmit(e)}
                  >
            <div className='mb-3'>
                <label htmlFor='ItemName' className='form-label '><b>ITEM NAME :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item Name'
                 name="itemName"
                 value={itemName}
                 onBlur={handleError}
                 onChange={(e)=>onInputChange(e)}
                />
                {errors.itemName && <span>{errors.itemName}</span> }
                  </div>
            <div className='mb-3'>
                <label htmlFor='price' className='form-label '><b>ITEM PRICE :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item  Price '
                 name="price"
                 value={price}
                 onBlur={handleError}
                 onChange={(e)=>onInputChange(e)}/>
                {errors.price && <span>{errors.price}</span> }

                 </div>
           <div className='mb-3'>
                <label htmlFor='quantity' className='form-label '><b>ITEM QUANTITY :</b></label>
                <input type={'text'}
                 className='form-label'
                 placeholder='Enter Item Quantity '
                 name="quant"
                 value={quant}
                 onBlur={handleError}
                 onChange={(e)=>onInputChange(e)}/>
                {errors.quant && <span>{errors.quant}</span> }
                </div>
                 <button type='submit' className='btn btn-info' >SUBMIT</button>
                 <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                 </form>
        </div>
        </div>
    </div>
  )
}
