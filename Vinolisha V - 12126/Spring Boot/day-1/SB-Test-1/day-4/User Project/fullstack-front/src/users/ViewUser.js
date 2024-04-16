import React, { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";
import Employee from "../Service/Employee";

export default function ViewUser() {
  const [user, setUser] = useState({
    name: " ",
    username: "",
    email: "",
  });

  const { id } = useParams();

  useEffect(() => {
    loadUser();
  }, []);

  const loadUser = async () => {
    await Employee.fetch(id).then((res) => setUser(res.data));
    // const result = await axios.get(`http://localhost:2244/users/${id}`);
    
  };
  return (
    <div className="container">
      <div className="row">
        <div className="col-md-5 offset-md-3 bg-light  border rounded p-4 mt-5 shadow ">
          <h1 className="text-center m-4">User Details</h1>

          <div className="card">
            <div className="card-body">
              <b> Details of User id: {user.id}</b>
              <ul className="list-group  list-group-flush ">
                <li className="list-group-item">
                  <b>Name:</b>
                  {user.name}
                </li>
                <li className="list-group-item">
                  <b>UserName:</b>
                  {user.username}
                </li>
                <li className="list-group-item">
                  <b>Email:</b>
                  {user.email}
                </li>
              </ul>
            </div>
          </div>
          <Link className="btn btn-success mx-2" to={`/edituser/${user.id}`}>
            Edit
          </Link>
          <Link className="btn btn-dark my-2" to={"/"}>
            Back to Home
          </Link>
        </div>
      </div>
    </div>
  );
}
