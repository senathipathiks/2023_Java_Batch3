import React, { useState } from "react";
import "./Res.css";
import { Button, TextField } from "@mui/material";

function ResForm() {
  // const[email,setEmail] = useState('');
  // const[password,setPassword] = useState('');
  // const[address,setAddress] = useState('');
  // const[State,setState] = useState('');
  // const[city,setCity] = useState('');
  // const[zip,setZip] = useState('');

  const [inputFields, setinputFields] = useState({
    email: "",
    password: "",
    address: "",
    state: "",
    city: "",
    zip: "",
  });
  const [errors, setErrors] = useState({
    email: "",
    password: "",
    address: "",
    state: "",
    city: "",
    zip: "",
  });
  const [submitting, setSubmitting] = useState(false);
  var passwordRegEx = "^[a-zA-Z0-9!@#$%^&*]{6,16}$";

  const Handle = (e) => {
    // let errors = {};

    if (e.target.name === "email") {
      if (e.target.value < 15) {
        errors.email = "Email should be at least 15 characters";
      }
    } 

    else if (e.target.name ==="password") {
      let re = new RegExp(passwordRegEx);
      if (!re.test(e.target.value)) {
        errors.password = "Invalid Password format.";
      
      // if (!new RegExp(passwordRegEx).test(password)) {

      //   errors.password = "Enter correct format of Password..";
       }
    }
    
    
    else if (e.target.name === "adderss") {
      // if (!e.target.value.includes("Street")) {
        console.log("hello")
      if (e.target.value === "") {
        errors.address = "Please fill address tab...";
      }
    } else if (e.target.name === "state") {
      if (e.target.value === "") {
        errors.state = "Field cannot be empty";
      }
    } else if (e.target.name === "city") {
      if (e.target.value === "") {
        errors.city = "Field cannot be empty";
      }
    } else if (e.target.name === "zip") {
      if (e.target.value === "") {
        errors.zip = "Field cannot be empty";
      }
    }

    return errors;
  };

  console.log(errors);

  const handleChange = (e) => {
    setinputFields({ ...inputFields, [e.target.name]: e.target.value });
  };

  const onblur = (e) => {
    e.preventDefault();
    setErrors(Handle(e));
    setSubmitting(true);
  };

  return (
    <div>
      {/* <div>hello</div> */}
      <form>
        {Object.keys(errors).length === 0 && submitting
          ? alert("Form Submitted Successfully")
          : null}

        <div className="container col-12 col-md-12">
          <div className="form-group">
            <div id="box" className="row justify-content-center">
              <div id="title">
                {" "}
                <h1 className=" text-center">Registration Form</h1>
              </div>
              <div className="col-12 col-md-6 col-lg-8">
                <div className="row justify-content-center">
                  <div className="col-lg-12 col-md-12 col-sm-12 input">
                    <TextField
                      variant="outlined"
                      className="form-group w-100"
                      label="Email"
                      placeholder="Email"
                      type="email"
                      value={inputFields.email}
                      name="email"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>

                  <br />
                  <br />

                  <div className="col-lg-12 col-md-6 col-sm-6 w-100 input ">
                    <TextField
                      variant="outlined"
                      className="form-control"
                      label="Password"
                      type="password"
                      placeholder="Password"
                      value={inputFields.password}
                      name="password"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>
                </div>
                <div className="row justify-content-center input">
                  <div className="col-12 col-md-10 col-xl-8 w-100">
                    <TextField
                      variant="outlined"
                      label="Address"
                      type="text"
                      className="form-control"
                      placeholder="Address"
                      value={inputFields.address}
                      name="address"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>
                </div>
                <div className="row justify-content-center">
                  <div className="col-lg-4 col-md-4 col-sm-4 input">
                    <TextField
                      variant="outlined"
                      label="city"
                      type="text"
                      className="form-control"
                      placeholder="City"
                      value={inputFields.city}
                      name="city"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>
                  <div className="col-lg-4 col-md-4 col-sm-4 input">
                    <TextField
                      variant="outlined"
                      label="state"
                      type="text"
                      className="form-control"
                      placeholder="State"
                      value={inputFields.state}
                      name="state"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>
                  <div className="col-lg-4 col-md-4 col-sm-4 input">
                    <TextField
                      variant="outlined"
                      label="zip"
                      type="text"
                      className="form-control"
                      placeholder="Zip"
                      value={inputFields.zip}
                      name="zip"
                      onBlur={onblur}
                      onChange={handleChange}
                    />
                  </div>
                </div>
                <div id="btn2" className="row justify-content-center input">
                  <div id="btn1" className="col-lg-12 col-md-6 col-sm-6 ">
                    <Button
                      variant="contained"
                      type="submit"
                      className=" btn btn-primary w-100"
                    >
                      create new login
                    </Button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </form>

      {errors.email ? alert(errors.email) : null}
      {errors.password ? alert(errors.password) : null}
      {errors.address ? alert(errors.address) : null}
      {errors.state ? alert(errors.state) : null}
      {errors.city ? alert(errors.city) : null}
      {errors.zip ? alert(errors.zip) : null}
    </div>
  );
}

export default ResForm
