import React from 'react'
import { useEffect } from 'react';
import { useParams,useNavigate,Link } from "react-router-dom";
import { useState } from 'react';
import Service from '../service/Service';

export default function UpdateStudent() {
  let navigate= useNavigate();

  const {id} = useParams();
  
  const [Record, setRecord] = useState({
    id:"",
    name:"",
    username:"",
    email:"",
    admin:{
      "id":0
     
    }

  });

  const{name,username,email}= Record;


  const inInputChange= (e) => {
    setRecord({ ...Record, [e.target.name]: e.target.value }); 
  };

  useEffect(() => {
    console.log(id)
    loadEmployee(id);
  }, []);
 
  const UpdateEmp = async (e) => {
    e.preventDefault();
    await Service.UpdateStudById(Record)
      // setRecord(res.data);
      alert('Data Inserted Successfully');
      navigate("/student");
    }

    const loadEmployee = async(id) => {
      const res=await Service.FetchStudbyId(id)
        setRecord(res.data);
    }

return (
  <div className="container">
  <div className="row">
    <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
      <h2 className="text-center m-2">UPDATE STUDENT DETAILS</h2>

      <form onSubmit={(e)=>UpdateEmp(e)}>
        <div className="mb-3">
          <label htmlFor="name" className="form-label float-start">
          <b>Name</b>
          </label>
          <input
            type={"text"}
            id="name"
            className="form-control"
            placeholder="Enter your name"
            name="name"
            required="required"
            value={name}
            onChange={(e) => inInputChange(e)}
          />
          

<label htmlFor="name" className="form-label float-start">
          <b>UserName</b>
          </label>
          <input
            type={"text"}
            id="name"
            className="form-control"
            placeholder="Enter your name"
            name="username"
            required="required"
            value={username}
            onChange={(e) => inInputChange(e)}
          />

<label htmlFor="name" className="form-label float-start">
          <b>Email </b>
          </label>
          <input
            type={"text"}
            id="email"
            className="form-control"
            placeholder="Enter your name"
            name="email"
            required="required"
            value={email}
            onChange={(e) => inInputChange(e)}
          />




         <label htmlFor="name" className="form-label float-start">
          <b>Admin Id</b>
          </label>
          <input
            type={"text"}
            id="name"
            className="form-control"
            placeholder="Enter your name"
            name="id"
            required="required"
            value={Record.admin.id}
            onChange={(e) => inInputChange(e)}
          />
          </div>

      
        <button type="submit" className="btn btn-success">
          Submit
        </button> 
        <Link className="btn btn-dark mx-2" to="/student">
          Go-Back
        </Link>
      </form>
    </div>
  </div>
</div>
)
}



