import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import {FaTrashAlt,FaEye,FaEdit} from "react-icons/fa"
import { useNavigate, useParams } from "react-router-dom";
import Employee from "../Service/Employee";

export default function Home() {
  let navigate = useNavigate();

  const [users, setUsers] = useState([]);

  const { id } = useParams();

  const[search, setSearch] = useState("");

  useEffect(() => {
    loadUsers();
    
  }, []);

  const loadUsers = async () => {
    console.log("hello");
    await  Employee.findall().then((res) => setUsers(res.data));
   
  };

  const deleteUser = async (id) => {
    const confirmDelete = window.confirm("Are you sure you want to delete this Record")
    console.log(confirmDelete)
    if(confirmDelete){
    await Employee.dele(id);
    alert('Deleted Successfully');
    }
  else{
    alert('Cancelled');
  }
    loadUsers();
    
  };

  return (
    <div className="container">
      
    <div className="py-4">
      <div className='col-sm-6 mb-4'>
        <form onSubmit={(e)=> e.preventDefault()}>
            <input
            className='form-control'
            type='search'
            role='searchbox'
            placeholder='Enter the name to search'
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            ></input>
        </form>
     </div>

      <Link className="btn btn-dark m-2" to="/adduser" id="add">Add User<b>+</b></Link>
     
        <table class="table table-darkr table-striped shadow ">
          <thead>
            <tr>
              <th scope="col">Employee Id</th>
              <th scope="col">Employee Name</th>
              <th scope="col">Employee User Name</th>
              <th scope="col">Employee Email</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody className='text-center'>
            {users.filter((st) =>
            st.name.toLowerCase().includes(search)).map((user, index) => (
              <tr>
                <th scope="row" key={index}>
                  {user.id}
                </th>

                <td>{user.name}</td>
                <td>{user.username}</td>
                <td>{user.email}</td>
                <td>
                <Link
                    className="btn btn-outline-dark mx-2"
                    to={`/viewuser/${user.id}`}
                  >
                    <FaEye/> 
                  </Link>

                  <Link
                    className="btn btn-outline-dark mx-2"
                    to={`/edituser/${user.id}`}
                  >
                    <FaEdit/> 
                  </Link>

                  <button
                    className="btn btn-outline-danger mx-2"
                    onClick={() => deleteUser(user.id)}
                  >
                    <FaTrashAlt/>  Delete
                  </button>

                  
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
