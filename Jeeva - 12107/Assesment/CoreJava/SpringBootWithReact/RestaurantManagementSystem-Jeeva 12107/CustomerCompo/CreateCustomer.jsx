import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router';
import CustomerService from './CustomerService';

const CreateCustomer = () => {
    const [cid,setCid]=useState("");
    const [cname, setCname] = useState("");
    const [caddress,setCaddress]=useState("");
    const [cage,setCage] =useState("");
    const [cdob,setCdob]=useState("");
    const [cphone,setCphone]=useState("");
    
    const [rid,setRid]=useState("");


    const [rids,setRids]=useState([])
    const navigate=useNavigate();
    

   const sendCusDetails= (e)=>{
    e.preventDefault();

    const CusDeatails={
        cid,cname,caddress,cage,cdob,cphone,
        res:{
            rid
           }
    };
    
    console.log(CusDeatails);  
        
    CustomerService.CustomerInsert(CusDeatails).then((response)=>{
        console.log(response.data);
        alert("Data Inserted"); 
        navigate('/');
    }).catch((error)=>{
        console.log(error);
    })
    }

    useEffect(()=>{
        CustomerService.getAllRestaurantId().then((response)=>{
            console.log(response.data);
            setRids(response.data);
        })
    },[])
    

  return (
    <div>
        <br></br>
      <div className='container ' >
      <center><h1>Create Customer</h1></center>  
        <div style={{height:'10px',width:'70%',marginLeft:'170px',marginTop:'50px'}}>
        <form onSubmit= {(e)=>sendCusDetails(e)}>

        <div className="form-floating mb-3">
                                <select className="form-control" required
                                    onChange={(e) => { setRid(e.target.value) }}>

                                    <option>Restaurant Ids</option>
                                    {rids.map((rids) => {
                                        return (<option key={rids} value={rids}
                                        >{rids}</option>)
                                    })
                                    }
                                </select>

                            </div>
                            

       
        <br></br>
        <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Id" required name='ticketId' value={cid} 
                                onChange={(e)=> setCid(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer Id</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Name" required name='EmployeeName' value={cname} 
                                  onChange={(e)=> setCname(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer Name</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Address" required name='EmployeeSalary' value={caddress} 
                                    onChange={(e)=> setCaddress(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer Address</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Age" required name='EmployeeSalary' value={cage} 
                                    onChange={(e)=> setCage(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer Age</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer DOB" required name='EmployeeSalary' value={cdob} 
                                    onChange={(e)=> setCdob(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer DOB</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Phone" required name='EmployeeSalary' value={cphone} 
                                    onChange={(e)=> setCphone(e.target.value)}/>
                                <label htmlFor="floatingPassword">Customer Phone</label>
                            </div>




         <input type='submit'  class="btn btn-primary" value='Submit' /> 
         {/* <Link to='/'className='btn' style={{backgroundColor:'skyblue',fontWeight:'bold'}} >BACK</Link><br></br><br></br>  */}
              </form>
              </div>
      </div>
     
    </div>
  )
}
export default CreateCustomer
