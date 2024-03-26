import React, { useEffect, useState } from 'react'
import CreateRestaurant from './CreateRestaurant'
import { Link } from 'react-router-dom'
import RestaurantService from './RestaurantService'

const RestaurantHome = () => {
    const[allDeatils,setAllDeatils]=useState([])

    useEffect(()=>{
        RestaurantService.getAllRestaurant().then((res)=>{
         console.log(res.data);
             setAllDeatils(res.data);
        }).catch((err)=>{
         console.log(err);
        })
 },[]);



 const  deleteRes =(rid)=>{

    
    RestaurantService.deleteRestaurant(rid).then((res)=>{
     console.log(res.data);
         alert("Restaurent Record Deleted");
         window.location.reload();
    }).catch((err)=>{
     console.log(err);
     alert("Error");
    })
 

 }

  return (
    <div>
    <div>
  <div className='container mt-5 ' >
   <div>
<Link to={'/createRestaurant'} className='btn' style={{backgroundColor:'#5df542',fontWeight:'bold'}}element={<CreateRestaurant/>}>CREATE</Link>
</div>
<table className="table">
<thead style={{fontStyle:'oblique'}} >
<tr>
 <th scope="col" style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}  >Restaurant ID</th>
 <th scope="col" style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}  >Restaurant Name</th>
 <th scope="col" style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}  >Restaurant City</th>
 <th scope="col" style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}} >Actions</th>
</tr>
</thead>
<tbody  style={{ fontSize: '1.1rem' }}>
{allDeatils.map((rest) => (
<tr key={rest.rid}>
 <td style={{ fontSize: '1.1rem', padding: '10px' }} >{rest.rid}</td> 
 <td >{rest.rname}</td>  
 <td >{rest.rcity}</td> 
   

 <Link to={`/updateRestaurant/${rest.rid}`} className='btn' style={{backgroundColor:'blue',color:'black',fontWeight:'bold'}} >UPDATE</Link>   
 <button className='btn btn-danger' style={{backgroundColor:'red',color:'black',fontWeight:'bold'}}onClick={()=>deleteRes(rest.rid)} >DELETE</button>
                  
   </tr>
))}

</tbody>
</table>

</div>


</div>
 
</div>
)
}


export default RestaurantHome
