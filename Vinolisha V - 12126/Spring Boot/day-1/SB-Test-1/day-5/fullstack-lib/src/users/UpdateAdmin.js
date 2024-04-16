import React from 'react'
import { useEffect } from 'react';
import { useParams,useNavigate,Link } from "react-router-dom";
import { useState } from 'react';
import Service from '../service/Service';

export default function UpdateAdmin() {

    let navigate= useNavigate();

    const {id} = useParams();
    const [Record, setRecord] = useState({
      name:"",
      subject:"",
      question:"",
      time:""
    });

    const{name,subject,question,time}= Record;
  

    const inInputChange= (e) => {
      setRecord({ ...Record, [e.target.name]: e.target.value }); 
    };

    useEffect(() => {
      console.log(id)
      loadDepartment(id);
    }, []);
   
    const UpdateDept = async (e) => {
      e.preventDefault();
      await Service.UpdateAdmin(Record);
        // setRecord(res.data);
        alert('Data Inserted Successfully');
        navigate("/admin");
      }

      const loadDepartment = async(id) => {
        const res=await Service.fetchbyId(id)
          setRecord(res.data);
      }
        
       

    
      
  

  return (
    <div className="container">
    <div className="row">
      <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
        <h2 className="text-center m-2">UPDATE DEPARTMENT DETAILS</h2>

        <form onSubmit={(e)=>UpdateDept(e)}>
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
          </div>
          <div className="mb-3">
            <label className="form-label float-start ">
            <b>Subject</b>
            </label>
            <input
              type={"text"}
              required
              id="subject"
              className="form-control"
              placeholder="Enter your UserName"
              name="subject"
              value={subject}
              onChange={(e) => inInputChange(e)}
            />
          </div>
          <div className="mb-3">
            <label className="form-label float-start ">
            <b>Question</b>
            </label>
            <input
              type={"text"}
              required
              id="question"
              className="form-control"
              placeholder="Enter your UserName"
              name="question"
              value={question}
              onChange={(e) => inInputChange(e)}
            />
          </div>
          <div className="mb-3">
            <label htmlFor="description" className="form-label float-start ">
            <b>Time</b>
            </label>
            <input
              type={"text"}
              required
              id="time"
              className="form-control"
              placeholder="Enter your UserName"
              name="time"
              value={time}
              onChange={(e) => inInputChange(e)}
            />
          </div>
        
          <button type="submit" className="btn btn-success">
            Submit
          </button> 
          <Link className="btn btn-dark mx-2" to="/admin">
            Go-Back
          </Link>
        </form>
      </div>
    </div>
  </div>
)
}


