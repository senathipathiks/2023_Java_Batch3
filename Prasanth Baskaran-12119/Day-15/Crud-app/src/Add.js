import axios from "axios";
import React from "react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css"

function Add() {
  const [inputData, setInputData] = useState({
    Name: "",
    Mobile: "",
    City: "",
    Pincode: "",
  });

  const naviget = useNavigate();

  let handleSubmit = (e) => {
    e.preventDefault();
    let result = validateValues(inputData);
    // setSubmitting(true);

    if (result === true) {
      axios
        .post("http://localhost:5000/users", inputData)
        .then((res) => {
          alert("Data added Successfully");
          naviget("/");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
    } else {
      alert("Please Enter the Valid Result!!!");
    }
  };

  // validation Part for add user for student management system
  // const [errors, setErrors] = useState({});
  // const [submitting, setSubmitting] = useState(false);

  const validateValues = (inputData) => {
    if (inputData.Name.length === 0) {
      alert("Please enter Student Name !!! ");
      return false;
    } else if (inputData.Mobile.length < 5) {
      alert("Mobile No should be Max 12 Numbers Only !!!");
      return false;
    } else if (inputData.City.length === 0) {
      alert("Please enter City Name !!!");
      return false;
    } else if (inputData.Pincode.length === 0) {
      alert("Please Enter the Valid Pincode!!!");
      return false;
    } else {
      return true;
    }
  };

  return (
    <div  id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center ">
      <div className="w-50 border bg-light p-5">
        <form onSubmit={handleSubmit}>
          <h1>ADD STUDENTS DATA'S</h1>
          <div>
            <lable htmlFor="name">Name</lable>
            <input
              type="text"
              name="name"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Name: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="Mobile">Mobile :</lable>
            <input
              type="number"
              name="mobile"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Mobile: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="city">City :</lable>
            <input
              type="text"
              name="city"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, City: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="pincode">Pincode :</lable>
            <input
              type="number"
              name="number"
              className="form-control"
              onChange={(e) =>
                setInputData({ ...inputData, Pincode: e.target.value })
              }
            />
          </div>
          <br />

          <button className="btn btn-info ">Submit</button>
        </form>

        {/* {errors.Name ? alert(errors.Name) : null}

        {errors.Mobile ? alert(errors.Mobile) : null}

        {errors.City ? alert(errors.City) : null}
        {errors.Pincode ? alert(errors.Pincode) : null} */}
      </div>
    </div>
  );
}

export default Add;
