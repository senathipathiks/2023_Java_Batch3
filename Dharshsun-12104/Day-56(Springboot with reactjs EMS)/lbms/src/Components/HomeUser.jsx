import React,{useEffect} from 'react'
import Allservices from '../Service/Allservices';
import { useState } from 'react';
import { useNavigate,Link } from "react-router-dom";

export default function HomeUser() {
    let navigate = useNavigate();
    const[user, setUser] = useState([]);
    const [uid, setUid] = useState("");


    useEffect(() => {
        const getAllUser = async () => {
          try {
            const response = await Allservices.Findalluser();
            console.log(response.data)
            setUser(response.data);
          } catch (error) {
            console.error("Error fetching student data:", error);
          }
        };
        getAllUser();
      }, []);
      
      const removeUser= async(e,uid)=>{
        e.preventDefault();
        
        
        if(window.confirm('  Are you sure?'))
        {
            await  Allservices.Deleteuser(uid);
            setUid(uid);
            window.location.reload();
            navigate("/")
            }
            else{
                alert("cancelled");
            }
      
      }


  return (
    <div>
       <div className="container mt-4">
      <h1 className="text-center">User List</h1>
      <div className="d-flex">
      <Link className="btn btn-btn-outline-light me-6" to="/insertus">
          <button class="btn btn-success btn-lg">Add User</button>
        </Link>
        </div> 
      
      <table className="table table-hover table-striped"style={{fontSize: "20px"}}>

        <thead style={{backgroundColor: "black",color:"white", fontWeight:"bold"}} >
          <tr>
            <th className="text-center" style={{width:"30px"}}>ID</th>
            <th className="text-center" style={{width:"50px"}}>Name</th>
            <th className="text-center" style={{width:"30px"}}>Age</th>
            <th className="text-center"  style={{width:"20px"}}>LibID</th>
            <th className="text-center"  style={{width:"40px"}}>BookName</th>
            <th className="text-center"  style={{width:"40px"}}>Action</th>
          </tr>
        </thead>
        <tbody>
          {user.map((item) => (
            <tr key={item.uid}>
              <td>{item.uid}</td>
              <td>{item.uname}</td>
              <td>{item.uage}</td>
              <td>{item.lib ?item.lib.lid :""}</td>
              <td>{item.lib ?item.lib.bname :""}</td>
              <td className="d-flex justify-content-between">           
              <button
                  className="btn btn-danger btn-md"
                  onClick={(e) => removeUser(e, item.uid)}
                >
                  Remove
                </button> &nbsp;
              
             
                 <Link to={`/updates/${item.uid}`}>
                  <button className="btn btn-primary btn-md">Update</button>&nbsp; &nbsp;
                </Link>
             
                {/* <Link to={`/find/${item.sid}`}><button className="btn btn-info btn-md">View</button></Link>
                 */}
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
    </div>
  )
}
