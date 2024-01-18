import axios from "axios";
import React from "react";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function Create() {
  const [values, setValues] = useState({
    name: "",
    id: "",
    email: "",
    phone: "",
    address: "",
  });
  const navigate = useNavigate();
  // const handleSubmit=async (e)=>{
  //   e.preventDefault()
  //   try{
  //     await Axios.post('http://localhost:5000/employees',
  //     values)
  //     .then(response=>{
  //       console.log("Employee created successfully!");
  //       alert("Employee Created Successfully!")
  //       navigate('/')
  //       })
  //       }catch(error){
  //         console.log(error);
  //         }
  //         }

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios
      .post("http://localhost:3000/users", { values })
      .then((response) => {
        setValues("");
        console.log(response);
        navigate("/");
      })
      .catch((err) => console.log(err));
  };
  return (
    <div className="d-flex flex-column  justify-content-center align-items-center  bg-light  vh-100 ">
      <div className="w-50 border bg-white  shadow px-5 pb-5 rounded ">
        <h1>Add a user</h1>
        <form onSubmit={handleSubmit}>
          <div className="mb-2">
            <label htmlFor="name">Name: </label>
            <input
              type="text"
              id="name"
              className="form-control"
              name="name"
              placeholder="Enter name"
              onChange={(e) => setValues({ ...values, name: e.target.value })}
            />

            <label htmlFor="id">Id :</label>
            <input
              type="number"
              name="id"
              className="form-control"
              placeholder="Enter id"
              onChange={(e) => setValues({ ...values, id: e.target.value })}
            ></input>

            <label htmlFor="email">Email :</label>
            <input
              type="text"
              name="email"
              className="form-control"
              placeholder="Enter email"
              onChange={(e) => setValues({ ...values, email: e.target.value })}
            ></input>

            <label htmlFor="phone">Contact</label>
            <input
              type="text"
              name="phone"
              className="form-control"
              placeholder="Enter contact"
              onChange={(e) => setValues({ ...values, phone: e.target.value })}
            ></input>

            <label htmlFor="address">Address</label>
            <input
              type="text"
              name="address"
              className="form-control"
              placeholder="Enter address"
              onChange={(e) =>
                setValues({ ...values, address: e.target.value })
              }
            ></input>
          </div>
          <button className="btn btn-success ">Submit</button>
          <Link to="/" className="btn btn-primary ms-3">
            Back
          </Link>
        </form>
      </div>
    </div>
  );
}

export default Create;
