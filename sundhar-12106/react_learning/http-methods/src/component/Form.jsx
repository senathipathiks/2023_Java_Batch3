import React, { useEffect, useState } from "react";
import axios from "axios";

function Form() {
  let states = [
    "state",
    "TamilNadu",
    "Andhra Pradesh",
    "telungana",
    "kerala",
    "karnataka",
  ];
  let [inputFields, setInputFields] = useState({
    emp_id: "",
    name: "",
    mail: "",
    password: "",
    address: "",
    city: "",
    state: "",
    pincode: "",
  });

  let [users, setUsers] = useState([]);

  let [error, setError] = useState({
    mailError: false,
    passError: false,
    pincodeError: false,
  });

  let changeHandler = (e) => {
    // let usrmail = e.target.value;
    setInputFields({ ...inputFields, [e.target.name]: e.target.value });
    // console.log(inputFields.mail + " : onBlur : " + usrmail);
  };

  let handleBlur = (e) => {
    let regx = /^\w+([-]?\w+)*@\w+([-]?\w+)*(\.\w{2,3})+$/;
    let pasRegx = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    if (e.target.name === "mail") {
      if (!regx.test(inputFields.mail)) {
        setError({ ...error, mailError: true });
        // alert("Please enter valid email id : " + inputFields.mail);
      } else {
        setError({ ...error, mailError: false });
        // alert("Email is registered successfully");
      }
    } else if (e.target.name === "password") {
      if (!pasRegx.test(inputFields.password))
        setError({ ...error, passError: true });
      else setError({ ...error, passError: false });
    } else if (e.target.name === "pincode") {
      if (inputFields.pincode === "" && inputFields.pincode.length <= 6) {
        setError({ ...error, pincodeError: true });
      } else setError({ ...error, pincodeError: false });
    }
  };

  let sub = (e) => {
    e.preventDefault();
    let details = {
      mail: inputFields.mail,
      password: inputFields.password,
      address: inputFields.address,
      city: inputFields.city,
      state: inputFields.state,
      pincode: inputFields.pincode,
    };
    alert(JSON.stringify(details));
  };

  let getUser = (useEffect = () => {
    axios.get("http://localhost:3003/users").then((response) => {
      console.log(response.data);
      setUsers(response.data);
    });
  });

  return (
    <div>
      <div className="container p-5">
        <div className="form-group border pt-5 justify-content-center d-flex flex-column align-items-center">
          <h1 className="text-primary mb-4">Registration</h1>
          <div className="row justify-content-center p-4 ">
            <div className="col-12 col-md-10 col-xl-8 d-flex flex-column gap-4">
              <div className="row justify-content-center">
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    label="name"
                    type="text"
                    className="form-control"
                    placeholder="name"
                    id="name"
                    name="name"
                    onChange={changeHandler}
                  />
                  <label htmlFor="name" className="ms-3 ms-md-4 ms-sm-2 ">
                    name
                  </label>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    label="emp-id"
                    type="text"
                    className="form-control"
                    placeholder="emp-id"
                    id="emp-id"
                    name="emp-id"
                    onChange={changeHandler}
                  />
                  <label htmlFor="emp-id" className="ms-3 ms-md-4 ms-sm-2 ">
                    emp-id
                  </label>
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    className="form-control"
                    label="mail"
                    placeholder="Email"
                    type="email"
                    id="usr-mail"
                    name="mail"
                    onChange={changeHandler}
                    onBlur={handleBlur}
                  />
                  <label htmlFor="usr-mail" className="ms-3 ms-md-4 ms-sm-2 ">
                    mail
                  </label>
                  {error.mailError === true ? (
                    <span className="text-danger">enter valid mail-id</span>
                  ) : null}
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    className="form-control"
                    label="Password"
                    type="password"
                    name="password"
                    placeholder="Password"
                    id="usr-pass"
                    onChange={changeHandler}
                    onBlur={handleBlur}
                  />
                  <label htmlFor="usr-pass" className="ms-3 ms-md-4 ms-sm-2 ">
                    password
                  </label>
                  {error.passError === true ? (
                    <span className="text-danger">Enter strong password</span>
                  ) : null}
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-12 col-md-10 col-xl-8 w-100 form-floating">
                  <input
                    variant="outlined"
                    label="Address"
                    type="text"
                    className="form-control"
                    placeholder="Address"
                    id="address"
                    name="address"
                    onChange={changeHandler}
                  />
                  <label htmlFor="address" className="ms-3 ms-md-4 ms-sm-2 ">
                    address
                  </label>
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="city"
                    type="text"
                    className="form-control"
                    placeholder="City"
                    id="city"
                    name="city"
                    onChange={changeHandler}
                  />
                  <label htmlFor="city" className="ms-3 ms-md-4 ms-sm-2 ">
                    city
                  </label>
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <select
                    variant="outlined"
                    label="state"
                    type="text"
                    className="form-control dropdown"
                    placeholder="State"
                    id="state"
                    name="state"
                    onChange={changeHandler}
                  >
                    {states.map((item) => (
                      <option key={item} value={item}>
                        {item}
                      </option>
                    ))}
                  </select>
                  <label htmlFor="state" className="ms-3 ms-md-4 ms-sm-2 ">
                    state
                  </label>
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="zip"
                    type="text"
                    className="form-control"
                    placeholder="Zip"
                    id="zip"
                    name="pincode"
                    onChange={changeHandler}
                    onBlur={handleBlur}
                  />
                  <label htmlFor="zip" className="ms-3 ms-md-4 ms-sm-2 ">
                    pincode
                  </label>
                  {error.pincodeError === true ? (
                    <span className="text-danger">enter valid mail-id</span>
                  ) : null}
                </div>
              </div>
              <div className="row">
                <div className="col-lg-3 col-md-3 col-sm-3 form-floating">
                  <button
                    variant="contained"
                    type="submit"
                    className="btn btn-primary"
                    onClick={sub}
                  >
                    Register
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Form;
