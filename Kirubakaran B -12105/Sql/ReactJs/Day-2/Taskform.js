import React, { useState } from "react";
// import "./Taskform.css";
const States = [
  "Alabama",
  "Alaska",
  "Arizona",
  "Arkansas",
  "California",
  "Colorado",
  "Connecticut",
  "Delaware",
  "Florida",
  "Georgia",
];

export default function Taskform() {
  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");
  const [address, setadddress] = useState("");
  const [city, setcity] = useState("");
  const [state, setstate] = useState("");

  const changeemailevent = (e) => {
    setemail(e.target.value);
  };
  const changepasswordevent = (e) => {
    setpassword(e.target.value);
  };
  const changeaddressevent = (e) => {
    setadddress(e.target.value);
  };
  const changecityevent = (e) => {
    setcity(e.target.value);
  };
  const statehandler = (e) => {
    setstate(e.target.value);
  };

  const Submiteven = (e) => {
    e.preventDefault();
    alert(
      `Email:${email}\nPassword : ${password} \nAddress:${address}\nCity:${city},\n State:${
        States[parseInt(state)]
      }`
    );
  };

  return (
    <form onSubmit={Submiteven}>
      <div className="container">
        <div className="form-group border">
          <div className="row justify-content-center">
            <div className="row justify-content-between m-4">
              <div className="col-lg-6 col-md-6 col-sm-6">
                <input
                  type="email"
                  placeholder="Enter your mail Address"
                  value={email}
                  variant="standard"
                  label="Username"
                  onChange={changeemailevent}
                />
                {/* <TextField className="form-group" variant="outlined" label="Email" type="email" placeholder="Enter your mail Address" /> */}
              </div>

              <div className="col-lg-6 col-md-6 col-sm-6">
                <input
                  type="password"
                  placeholder="Password"
                  value={password}
                  onChange={changepasswordevent}
                />
              </div>
            </div>
            <div className="row justify-content-center">
              <div className="col-12">
                <input
                  id="add"
                  type="text"
                  placeholder="Address"
                  value={password}
                  onChange={changeaddressevent}
                />
              </div>
            <div className="row justify-content-center ">
              <div className=" col-4 col-lg-6 col-md-6 col-sm-6">
                <input
                  type="text"
                  placeholder="City"
                  value={city}
                  onChange={changecityevent}
                />
              </div>
              <div className="col-lg-6 col-md-6 col-sm-6">
                <label>State</label>
                <br />
                <select id="state" value={state} onChange={statehandler}>
                  {States.map((item, idx) => (
                    <option key={idx} value={item}>
                      {item}
                    </option>
                  ))}
                </select>
              </div>
            </div>
            <div>
              <button type="submit" className="btn btn-primary">Sign in</button>
            </div>
            </div>
          </div>
        </div>
      </div>
    </form>
  );
}
