import React from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";
import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";

function Update() {
  // const [data, setData] = useState([]);
  const { id } = useParams();
  const [values, setValues] = useState({
    name: "",
    id: "",
    email: "",
    phone: "",
    address: "",
  });
  useEffect(() => {
    axios
      .get(`http://localhost:3000/users/${id}`)
      .then((Response) => setValues(Response.data))
      .catch((err) => console.log(err));
  });
  const navigate = useNavigate();
  const handleUpdate = (e) => {
    e.preventDefault();
    axios
      .put(`http://localhost:3000/users/${id}`, values)
      .then((response) => {
        console.log(response);
        navigate("/");
      })
      .catch((err) => console.log(err));
  };
  return (
    <div className="d-flex flex-column  justify-content-center align-items-center  bg-light  vh-100 ">
      <div className="w-50 border bg-white  shadow px-5 pb-5 rounded ">
        <h1>Update user</h1>
        <form onSubmit={handleUpdate}>
          <div className="mb-2">
            <label htmlFor="name">Name: </label>
            <input
              type="text"
              id="name"
              className="form-control"
              name="name"
              placeholder="Enter name"
              value={values.name}
              onChange={(e) => setValues({ ...values, name: e.target.value })}
            />

            <label htmlFor="id">Id :</label>
            <input
              type="number"
              name="id"
              className="form-control"
              placeholder="Enter id"
              value={values.id}
              onChange={(e) => setValues({ ...values, id: e.target.value })}
            ></input>

            <label htmlFor="email">Email :</label>
            <input
              type="text"
              name="email"
              className="form-control"
              placeholder="Enter email"
              value={values.email}
              onChange={(e) => setValues({ ...values, email: e.target.value })}
            ></input>

            <label htmlFor="phone">Contact</label>
            <input
              type="text"
              name="phone"
              className="form-control"
              placeholder="Enter contact"
              value={values.phone}
              onChange={(e) => setValues({ ...values, phone: e.target.value })}
            ></input>

            <label htmlFor="address">Address</label>
            <input
              type="text"
              name="address"
              className="form-control"
              placeholder="Enter address"
              value={values.address}
              onChange={(e) =>
                setValues({ ...values, address: e.target.value })
              }
            ></input>
          </div>
          <button className="btn btn-success ">Update</button>
          <Link to="/" className="btn btn-primary ms-3">
            Back
          </Link>
        </form>
      </div>
    </div>
  );
}

export default Update;
