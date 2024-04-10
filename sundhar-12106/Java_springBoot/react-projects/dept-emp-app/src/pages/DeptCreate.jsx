import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { saveDept } from "../service/DepartmentService";

const DeptCreate = () => {
  const navigate = useNavigate();
  let [department, setDepartment] = useState({
    deptName: "",
    location: "",
  });

  const handleCancel = () => {
    navigate("/");
  };

  let submitForm = (e) => {
    e.preventDefault();
    console.log("hello");
    if (department.location === "" || department.name === "") {
      alert("Please fill out all fields.");
    } else {
      saveDept(department)
        .then((data) => {
          console.log(data);
          navigate("/");
        })
        .catch((err) => {
          console.error(`Error! ${err}`);
        });
    }
  };

  let handleChange = (e) => {
    setDepartment({ ...department, [e.target.name]: e.target.value });
  };

  return (
    <div className="container d-flex  justify-content-center ">
      <form
        action=""
        onSubmit={submitForm}
        className="form-floating col-6 border rounded pb-3  d-flex gap-3 flex-column mt-3"
      >
        <h4 className="text-center mt-2">Add Employee</h4>
        <div className="container pe-2 ">
          <label htmlFor="name">Name : </label>
          <input
            type="text"
            name="deptName"
            value={department.deptName}
            onChange={(e) => {
              handleChange(e);
            }}
            className="form-control"
          />
        </div>
        <div className="container pe-2 ">
          <label htmlFor="location">location : </label>
          <input
            type="text"
            name="location"
            value={department.location}
            onChange={(e) => {
              handleChange(e);
            }}
            className="form-control"
          />
        </div>
        <div className="container">
          <button type="submit" className="btn btn-info">
            Save
          </button>
          <button onClick={handleCancel} className="btn btn-danger  ms-2">
            Cancel
          </button>
        </div>
      </form>
    </div>
  );
};

export default DeptCreate;
