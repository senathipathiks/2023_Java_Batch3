import React from "react";
import "./Form.css";
import { useState } from "react";

function Form() {
  var firstnameRegEx = "^[a-zA-Z]{3,5}$";
  var lastnameRegEx = "^[a-zA-Z0-9]{5,10}$";
  var emailRegEx = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
  var passwordRegEx = "^[a-zA-Z0-9!@#$%^&*]{6,16}$";
  var ContactRegEx = "^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$";

  const [inputval, setinputval] = useState({
    firstname: "",
    lastname: "",
    email: "",
    password: "",
    tel: "",
  });
  const [errors, seterrors] = useState({});

  const [submitting, setsubmitting] = useState(false);

  const validate = (ivalues) => {
    let errors = {};
    if (
      ivalues.firstname.length < 3 &&
      ivalues.firstname.length > 5 &&
      !ivalues.firstname.match(firstnameRegEx)
    ) {
      console.log("Username");
      errors.firstname = "Enter Valid firstname";
    } else if (
      ivalues.lastname.length < 5 &&
      ivalues.lastname.length > 10 &&
      !ivalues.lastname.match(lastnameRegEx)
    ) {
      errors.lastname = "Enter valid last name";
    } else if (ivalues.email.length < 5 && ivalues.email.match(emailRegEx)) {
      errors.email = "Enter valid email";
    } else if (
      ivalues.password.length < 5 &&
      ivalues.password.match(passwordRegEx)
    ) {
      errors.password = "Enter valid password";
    } else if (ivalues.tel.length === 10 && ivalues.tel.match(ContactRegEx)) {
      errors.tel = "Enter valid contact";
    }
  };

  const handlechange = (e) => {
    setinputval({ ...inputval, [e.target.name]: e.target.value });
    console.log(e.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    seterrors(validate(inputval));
    setsubmitting(true);
  };
  return (
    <div className="container-fluid col-12 " id="div1">
      {Object.keys(errors).length === 0 && submitting ? (
        <span className="Success">
          <b>Successfully submitted &#10003;</b>
        </span>
      ) : null}
      <h1 id="h1">USER FORM</h1>
      <form id="f1" onSubmit={handleSubmit}>
        <label htmlFor="firstname">
          <b>Firtsname :</b>
        </label>
        <input
          type="firstname"
          name="firstname"
          className="border-dark "
          value={inputval.firstname}
          id="firstname"
          placeholder="Enter first name"
          onChange={handlechange}
        ></input>
        <br />
        <br />
        <label htmlFor="lastname">
          <b>Lastname : </b>
        </label>
        <input
          type="lastname"
          name="lastname"
          className="border-dark"
          value={inputval.lastname}
          id="lastname"
          placeholder="Enter last name"
          onChange={handlechange}
        ></input>
        <br />
        <br />
        <label htmlFor="email">
          <b>Email id :</b>
        </label>
        <input
          type="email"
          name="email"
          className="border-dark "
          value={inputval.email}
          id="email"
          placeholder="Enter email"
          onChange={handlechange}
        ></input>
        <br />
        <br />
        <label htmlFor="password">
          <b>Password :</b>
        </label>
        <input
          type="password"
          name="password"
          className="border-dark "
          value={inputval.password}
          id="password"
          placeholder="Enter password"
          onChange={handlechange}
        ></input>
        <br />
        <br />
        <label htmlFor="tel">
          <b>Contact :</b>
        </label>
        <input
          type="tel"
          name="tel"
          className="border-dark"
          value={inputval.tel}
          id="tel"
          placeholder="Enter Mobile number"
          onChange={handlechange}
        />{" "}
        <br />
        <br />
        <label htmlFor="gender">Gender</label> <br />
        <input type="radio" name="gender" value="" id="male" />
        Male
        <input align="center" type="radio" name="gender" value="" id="female" />
        Female
        <input type="radio" name="gender" value="" id="other" />
        Transgender
        <br />
        <br />
        <button type="submit">Submit</button>
      </form>
      {errors.firstname ? (
        <p className="errors">Firstname should contain atleast 3 letters</p>
      ) : null}
      {errors.lastname ? (
        <p className="errors">Lastname should contain at least 5 letters</p>
      ) : null}
      {errors.email ? (
        <p className="errors">Email should be atleast 15 characters long</p>
      ) : null}
      {errors.password ? (
        <p className="errors">password should be atleast 5 characters long</p>
      ) : null}
      {errors.tel ? (
        <p className="errors">Contact number should have 10 digits</p>
      ) : null}
    </div>
  );
}

export default Form;
