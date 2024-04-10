import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import RestaurantService from './RestaurantService'

const CreateRestaurant = () => {
    const [rid, setrid] = useState("")
    const [rname, setrname] = useState("")
    const [rcity, setrcity] = useState("")
   
    const navigate = useNavigate();
    const saveRestaurant=(e)=>{
        e.preventDefault();   
         
        const departmentDetails={rid,rname,rcity} 
        RestaurantService.createRestaurant(departmentDetails).then((response)=>{
            console.log(response.data);
            alert("Data: "+ response.data);
            navigate('/restaurantHome');
        }).catch((error)=>{
            console.log(error);
            alert("Error");
        })
        
    }
  return (
    <div>
        <div className='container ' style={{marginTop:"40px"}}>
        <center><h1>Create Restaurant</h1></center>
        <div style={{height:'10px',width:'50%',marginLeft:'350px',marginTop:'50px'}}>
        
        <form onSubmit={(e)=>saveRestaurant(e)}>
        
        
        <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Department Id" required name='EmployeeName' value={rid} 
                                 onChange={(e)=> setrid(e.target.value)}/>
                                <label htmlFor="floatingPassword">Restaurant Id</label>
                            </div>
        
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Department Nmae" required name='EmployeeName' value={rname} 
                                onChange={(e)=> setrname(e.target.value)}/>
                                <label htmlFor="floatingPassword">Restaurant Name</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Department Nmae" required name='EmployeeName' value={rcity} 
                                onChange={(e)=> setrcity(e.target.value)}/>
                                <label htmlFor="floatingPassword">Restaurant City</label>
                            </div>

       
        <button className='btn btn-success'>Insert</button>
        <Link to='/restaurantHome'className='btn' style={{backgroundColor:'skyblue',fontWeight:'bold'}} >BACK</Link><br></br><br></br> 
         




        </form>
        </div>
      </div>
    </div>
  )
}

export default CreateRestaurant
