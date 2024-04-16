import axios from "axios";
import React, { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { Link } from "react-router-dom";
import Employee from "../Service/Employee";

export default function EditUser() {
  let navigate = useNavigate();

  const { id } = useParams();

  const [user, setUser] = useState({
    name: " ",
    username: "",
    email: ""
  });

  const { name, username, email } = user;

  const inInputChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  useEffect(() => {
    loadUser();
  }, []);

  const loadUser = async () => {
    await Employee.load(id).then((result) => {
        // const result = await axios.get(`http://localhost:2244/users/${id}`);
    setUser(result.data);
  });
  }
  const onSubmit = async (e) => {
    e.preventDefault();
    await Employee.addnew(user)
    // await axios.put(`http://localhost:2244/updateUser/${id}`, user);  
    navigate("/");
  };

  

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-5 shadow ">
          <h2 className="text-center m-2">UPDATE USER DETAILS</h2>

          <form onSubmit={(e) => onSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="Name" className="form-label float-start">
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
              <label htmlFor="UserName" className="form-label float-start ">
              <b>UserName</b>
              </label>
              <input
                type={"text"}
                required
                id="name"
                className="form-control"
                placeholder="Enter your UserName"
                name="username"
                value={username}
                onChange={(e) => inInputChange(e)}
              />
            </div>
            <div className="mb-3">
              <label htmlFor="Email" className="form-label float-start">
              <b>Email</b>
              </label>
              <input
                type={"text"}
                required
                id="name"
                className="form-control"
                placeholder="Enter your Email"
                name="email"
                value={email}
                onChange={(e) => inInputChange(e)}
              />
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
  )
}
