import React, { useEffect, useState } from 'react'
import CustomerService from './CustomerService';
import { Link } from 'react-router-dom';
import CreateCustomer from './CreateCustomer';

const CustomerHome = () => {
  const[allDeatils,setAllDeatils]=useState([]);

    useEffect(()=>{
           CustomerService.findALLCusDetails().then((res)=>{
            console.log(res.data);
                setAllDeatils(res.data);
           }).catch((err)=>{
            console.log(err);
           })
    },[]);

    const  deleteCustomer =(cid)=>{


      CustomerService.deleteCustomer(cid).then((res)=>{
       
       console.log(cid);
           alert("Customer Record Deleted");
           window.location.reload();
      }).catch((err)=>{
       console.log(err);
      })
   

   }
   
  return (
    <div>
    <div className='container mt-5 ' >
     <div>
           <Link to='/createCustomer'className='btn' style={{backgroundColor:'#5df542',fontWeight:'bold'}} element={<CreateCustomer />}>CRETAE</Link><br></br><br></br>
         
 </div>
 <table className="table">
 <thead style={{fontStyle:'oblique'}}>
 <tr >
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}} >Customer ID</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Customer Name</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Customer Address</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Customer Age</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Customer DOB</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Customer Phone</th>
   <th scope="col"style={{ fontSize: '1.2rem', padding: '10px',backgroundColor:'#464f44',color:'white'}}>Actions</th>
 </tr>
 </thead>
  <tbody style={{ fontSize: '1.1rem' }}>
  {allDeatils.map((cus) => (
 <tr key={cus.cid}>
   <td style={{ fontSize: '1.1rem', padding: '10px' }}>{cus.cid}</td>  
   <td>{cus.cname}</td>
   <td>{cus.caddress}</td>  
   <td>{cus.cage}</td>
   <td>{cus.cdob}</td>
   <td>{cus.cphone}</td>
   
  
   <Link to={`/updateCustomer/${cus.cid}`} className='btn' style={{backgroundColor:'blue',color:'black',fontWeight:'bold'}}>UPDATE</Link>   
     <button className='btn' style={{backgroundColor:'red',color:'black',fontWeight:'bold'}}onClick={()=>deleteCustomer(cus.cid)} >DELETE</button>
              
     </tr>
))}
</tbody>
</table>

 </div>


 </div>
)
}



export default CustomerHome
