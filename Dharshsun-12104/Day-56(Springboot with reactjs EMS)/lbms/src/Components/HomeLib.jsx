import React,{useEffect} from 'react'
import Allservices from '../Service/Allservices';
import { useState } from 'react';
import { useNavigate,Link } from "react-router-dom";

export default function HomeLib() {
    let navigate = useNavigate();
    const[libr, setLibr] = useState([]);
    const [lid, setLid] = useState("");


    useEffect(() => {
        const getAllUser = async () => {
          try {
            const response = await Allservices.Findalllib();
            console.log(response.data)
            setLibr(response.data);
          } catch (error) {
            console.error("Error fetching student data:", error);
          }
        };
        getAllUser();
      }, []);
      
      const removeUser= async(e,lid)=>{
        e.preventDefault();
        
        
        if(window.confirm('  Are you sure?'))
        {
            await  Allservices.Deletelib(lid);
            setLid(lid);
            window.location.reload();
            navigate("/homelib")
            }
            else{
                alert("cancelled");
            }
      
      }


  return (
    <div>
      <div style={{marginLeft:"10%",marginRight:"20%",marginTop:"3%", height:"400px",width:"1200px",overflow: "auto"}} className="card" >
       <div className="container mt-4">
       <div className='card-header'><h1 className="text-center">Library List</h1>
      
      <Link className="btn btn-btn-outline-light me-6 " to="/insertlib">
          <button class="btn btn-success btn-lg">Add Lib</button>
        </Link>
        </div>
        <div className='card-body'>
      <table className="table table-hover table-striped"style={{fontSize: "25px"}}>

        <thead style={{backgroundColor: "black",color:"white", fontWeight:"bold"}} >
          <tr>
            <th className="text-center" style={{width:"30px",height:"auto",fontSize:"20px"}}>ID</th>
            <th className="text-center" style={{width:"50px"}}>BookName</th>
            <th className="text-center" style={{width:"30px"}}>Price</th>
            <th className="text-center"  style={{width:"40px"}}>Action</th>
          </tr>
        </thead>
        <tbody>
          {libr.map((item) => (
            <tr key={item.lid}>
              <td>{item.lid}</td>
              <td>{item.bname}</td>
              <td>{item.price}</td>
              <td className="d-flex justify-content-between">           
              <button
                  className="btn btn-danger btn-lg"
                  onClick={(e) => removeUser(e, item.lid)}
                >
                  Remove
                </button> &nbsp;
              
             
                 <Link to={`/updatess/${item.lid}`}>
                  <button className="btn btn-primary btn-lg">Update</button>
                </Link>
             
                {/* <Link to={`/find/${item.sid}`}><button className="btn btn-info btn-md">View</button></Link> */}
                
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      </div>
    </div>
    </div>
    </div>
  )
}
