import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router';
import CustomerService from './CustomerService';
import { Link } from 'react-router-dom';

const UpdateCustomer = () => {
    const [cname, setCname] = useState("");
    const [caddress,setCaddress]=useState("");
    const [cage,setCage] =useState("");
    const [cdob,setCdob]=useState("");
    const [cphone,setCphone]=useState("");

    const [rid,setRid]=useState("");

    
    const [customer, setCustomer] = useState({
        cname: " ",
        caddress:" ",cage:" ",cdob:" ",cphone:" " 
    })

    const {cid}=useParams();
    const [rids,setRids]=useState([]);
    
    

   const passToUpdate=(e)=>{
    e.preventDefault();

    const CusDeatails={
        cid,cname,caddress,cage,cdob,cphone,
        res:{
            rid
           }
    };   
    
    console.log(CusDeatails);  
    alert("Data Inserted"+cid);     
    CustomerService.updateCusDetails(CusDeatails).then((response)=>{
        console.log(response.data);
        
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

    useEffect(()=>{
        CustomerService.findCustomer(cid).then((response)=>{
            console.log(response.data);
            setCustomer(response.data);
        })
    },[])
    

  return (
    <div>
        <br></br>
      <div className='container ' >
      <center><h1>Update  Customer</h1></center>  
        <div style={{height:'10px',width:'70%',marginLeft:'170px',marginTop:'50px'}}>
        <form onSubmit= {(e)=>passToUpdate(e)}>
               

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
                               />
                                <label htmlFor="floatingPassword">Customer Id</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Name" required name='cname' value={customer.cname} 
                                 onChange={(e) => setCustomer({ ...customer, [e.target.name]: e.target.value })}/>
                                <label htmlFor="floatingPassword">Customer Name</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Address" required name='caddress' value={customer.caddress} 
                                    onChange={(e) => setCustomer({ ...customer, [e.target.name]: e.target.value })}/>
                                <label htmlFor="floatingPassword">Customer Address</label>
                            </div>

                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Age" required name='cage' value={customer.cage} 
                                    onChange={(e) => setCustomer({ ...customer, [e.target.name]: e.target.value })}/>
                                <label htmlFor="floatingPassword">Customer Age</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer DOB" required name='cdob' value={customer.cdob} 
                                    onChange={(e) => setCustomer({ ...customer, [e.target.name]: e.target.value })}/>
                                <label htmlFor="floatingPassword">Customer DOB</label>
                            </div>
                            <div className="form-floating mb-3">
                                <input type="text" className="form-control" id="floatingPassword"  placeholder="Customer Phone" required name='cphone' value={customer.cphone} 
                                    onChange={(e) => setCustomer({ ...customer, [e.target.name]: e.target.value })}/>
                                <label htmlFor="floatingPassword">Customer Phone</label>
                            </div>




         <input type='submit'  class="btn btn-primary" value='Submit' /> 
         <Link to='/'className='btn' style={{backgroundColor:'skyblue',fontWeight:'bold'}} >BACK</Link><br></br><br></br> 
              </form>
              </div>
      </div>
     
    </div>
  )
}
export default UpdateCustomer
