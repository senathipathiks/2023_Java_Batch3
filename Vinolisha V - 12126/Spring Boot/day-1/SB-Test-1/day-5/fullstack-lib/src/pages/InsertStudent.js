import React from "react";

import { useNavigate, Link } from "react-router-dom";
import Service from "../service/Service";
import { useEffect } from "react";

export default function InsertStudent() {
  let navigate = useNavigate();
  const [Record, setRecord] = React.useState({
    id: "",
    name: "",
    username: "",
    email: "",
    admin: 
    { id: "", name: "", subject: "", question: "", time: "" },
  });

  const [idList, setidList] = React.useState([]);


  useEffect(() => {
    Service.FindAllId().then((res) => {
      console.log(res.data);
      setidList(res.data);
    });
  }, []);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(Record);
    console.log(Record.admin.id)
    Service.AddStud(Record).then((res) => {
      console.log("saved"+Record + res);
      alert("Data inserted Successfully");
      navigate("/student");
    }).catch(err=>console.log(err))
    
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
          <h4 className="text-center m-2">INSERT STUDENT DETAILS</h4>

          <form onSubmit={(e) => handleSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="Name" className="form-label float-start ">
                <b>Name</b>
              </label>
              <input
                type={"text"}
                id="name"
                className="form-control"
                placeholder="Enter your Name"
                name="name"
                value={Record.name}
                onChange={(e) =>
                  setRecord({ ...Record, [e.target.name]: e.target.value })
                }
              />
            </div>
            <div className="mb-3">
              <label htmlFor="LastName" className="form-label float-start ">
                <b>User Name</b>
              </label>
              <input
                type={"text"}
                id="username"
                className="form-control"
                placeholder="Enter your UserName"
                name="username"
                value={Record.username}
                onChange={(e) =>
                  setRecord({ ...Record, [e.target.name]: e.target.value })
                }
              />
            </div>
            <div className="mb-3">
              <label htmlFor="Email" className="form-label float-start ">
                <b>Email</b>
              </label>
              <input
                type={"text"}
                id="email"
                className="form-control"
                placeholder="Enter your Email"
                name="email"
                value={Record.email}
                onChange={(e) =>{
                    
                   setRecord({ ...Record, [e.target.name]: e.target.value })
                }

                 
                }
              />
            </div>

            <div className="mb-3">
              <label for="colFormLabelLg" className="form-label float-start ">
                <b>Department Id</b>
              </label>
              <select
                type={"text"}
                id="id"
                className="form-control"
                
                name="id"
              
                onChange={(e) =>{
                  console.log(e.target.value +": "+ e.target.name)
                  setRecord({
                    ...Record,admin:{id:e.target.value}              
                  })
                }
                }
                
              >
                <option 
                >Select one</option>
                {idList.map((id) => (
                  <option key={id}>{id}</option>
                ))}
              </select>
            </div>
            <button type="submit" className="btn btn-success">
              Submit
            </button>
            <Link className="btn btn-dark mx-2" to="/Student">
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
