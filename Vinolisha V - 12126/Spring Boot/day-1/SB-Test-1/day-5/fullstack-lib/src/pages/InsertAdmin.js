import React from 'react'

import { useNavigate, Link} from "react-router-dom";
import Service from '../service/Service';
import { useEffect } from 'react';

export default function InsertAdmin() {
  let navigate = useNavigate();
  const [Record, setRecord] = React.useState({
    id:"",
    name:"",
    subject:"",
    question:"",
    time:""
});

const {id, name, subject, question, time} = Record;
const onInputChange =(e) => {
    if(e.target.name === 'id'){
    setRecord({...Record,admin:{id:e.target.value}})
}
    else{
        setRecord({...Record,[e.target.name]: e.target.value });
    }
};



        const onSubmit = async(e) => {
            e.preventDefault();
            console.log(Record);
            await Service.AddAdmin(Record);
            alert("Data inserted Successfully");
            navigate("/admin");
        };

    return (
        <div className="container">
          <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
              <h4 className="text-center m-2">INSERT ADMIN DETAILS</h4>
    
              <form onSubmit={(e) => onSubmit(e)}>
                <div className="mb-3">
                  <label htmlFor="Name" className="form-label float-start ">
                    <b>Admin Name</b>
                  </label>
                  <input
                    type={"text"}
                    id="name"
                    className="form-control"
                    placeholder="Enter your Name"
                    name="name"
                    value={name}
                    onChange={(e) => onInputChange(e)}
                  />
                 
                </div>
                <div className="mb-3">
                  <label htmlFor="LastName" className="form-label float-start ">
                    <b>Subject Name</b>
                  </label>
                  <input
                    type={"text"}
                    id="subject"
                    className="form-control"
                    placeholder="Enter your subject"
                    name="subject"
                    value={subject}
                    onChange={(e) => onInputChange(e)}
                  />
                 
                
                </div>
                <div className="mb-3">
                  <label htmlFor="LastName" className="form-label float-start ">
                    <b>Question</b>
                  </label>
                  <input
                    type={"text"}
                    id="question"
                    className="form-control"
                    placeholder="Enter Question"
                    name="question"
                    value={question}
                    onChange={(e) => onInputChange(e)}
                  />
                  <div className="mb-3">
                  <label htmlFor="LastName" className="form-label float-start ">
                    <b>Time</b>
                  </label>
                  <input
                    type={"text"}
                    id="time"
                    className="form-control"
                    placeholder="Enter Time"
                    name="time"
                    value={time}
                    onChange={(e) => onInputChange(e)}
                  />
                 
                
                </div>
                 
                
                </div>
                <button type="submit" className="btn btn-success">
                  Submit
                </button>
                <Link className="btn btn-dark mx-2" to="/admin">
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-counterclockwise" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M8 3a5 5 0 1 1-4.546 2.914.5.5 0 0 0-.908-.417A6 6 0 1 0 8 2z"/>
  <path d="M8 4.466V.534a.25.25 0 0 0-.41-.192L5.23 2.308a.25.25 0 0 0 0 .384l2.36 1.966A.25.25 0 0 0 8 4.466"/>
</svg> Go-Back
                </Link>
              </form>
            </div>
          </div>
        </div>
      );
    }
    





