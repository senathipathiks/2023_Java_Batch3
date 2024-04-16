import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
import Employee from "../Service/Employee";

export default function AddUser() {
  let navigate = useNavigate();

  const [user, setUser] = useState({
    id: "",
    name: "",
    username: "",
    email: "",
  });

  const [errors, setErrors] = useState({});

  const { id, name, username, email } = user;

  const onInputChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const onSubmit = async (e) => {
    e.preventDefault();
    console.log(user);

    // const validationError = {}
    // if (!user.name.trim()) {
    //   validationError.name = "Name is required";
    // }
    // if (!user.username.trim()) {
    //   validationError.username = "User Name is required";
    // }

    // if (!user.username.trim()) {
    //   validationError.email = "User Name is required";
    // } else if (!/\S+@\S+\.\S+/.test(user.username)) {
    //   validationError.email = "Email name not valid";
    // }

    // setErrors(validationError);

    // if (Object.keys(validationError).length === 0) {
    //   alert("Form submitted successfully");
    // }
    

    await Employee.addnew(user);

    navigate("/");
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
          <h4 className="text-center m-2">INSERT USER DETAILS</h4>

          <form onSubmit={(e) => onSubmit(e)}>
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
                value={name}
                onChange={(e) => onInputChange(e)}
              />
              {errors.name && <span>{errors.name}</span>}
            </div>
            <div className="mb-3">
              <label htmlFor="UserName" className="form-label float-start ">
                <b>UserName</b>
              </label>
              <input
                type={"text"}
                id="name"
                className="form-control"
                placeholder="Enter your UserName"
                name="username"
                value={username}
                onChange={(e) => onInputChange(e)}
              />
              {errors.username && <span>{errors.username}</span>}
            </div>
            <div className="mb-3">
              <label htmlFor="Email" className="form-label float-start ">
                <b>User Email</b>
              </label>
              <input
                type={"text"}
                id="name"
                className="form-control"
                placeholder="Enter your Email"
                name="email"
                value={email}
                onChange={(e) => onInputChange(e)}
              />
              {errors.email && <span>{errors.email}</span>}
            </div>
            <button type="submit" className="btn btn-success">
              Submit
            </button>
            <Link className="btn btn-dark mx-2" to="/">
              Go-Back
            </Link>
          </form>
        </div>
      </div>
    </div>
  );
}
