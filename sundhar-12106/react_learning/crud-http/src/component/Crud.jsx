import React from "react";
import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";

const Crud = () => {
  let [user, setUser] = useState([]);
  let [inpValues, setInpValues] = useState({
    id: "",
    name: "",
    email: "",
  });

  let [error, setError] = useState({
    mailError: false,
    nameError: false,
    pincodeError: false,
  });

  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    const response = await axios.get("http://localhost:3003/users");
    console.log(response);
    setUser(response.data);
  };

  let changeHandler = (e) => {
    // let usrmail = e.target.value;
    // console.log(e.target.name, e.target.value);
    setInpValues({ ...inpValues, [e.target.name]: e.target.value });
    // console.log(e.target.name+ " : onBlur : " + usrmail);
  };

  let handleBlur = (e) => {
    let regx = /^\w+([-]?\w+)*@\w+([-]?\w+)*(\.\w{2,3})+$/;
    // let pasRegx = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    // console.log(e.target.name)
    if (e.target.name === "email") {
      if (!regx.test(inpValues.email)) {
        setError({ ...error, mailError: true });
        // alert("Please enter valid email id : " + inpValues.mail);
      } else {
        setError({ ...error, mailError: false });
        // alert("Email is registered successfully");
      }
    } else if (e.target.name === "name") {
      if (e.target.name === "" || !isNaN(e.target.value))
        setError({ ...error, nameError: true });
      else setError({ ...error, nameError: false });
    } else if (e.target.name === "pincode") {
      if (inpValues.pincode === "" && inpValues.pincode.length <= 6) {
        setError({ ...error, pincodeError: true });
      } else setError({ ...error, pincodeError: false });
    }
  };

  //   database CRUD Operations

  const AddUser = (e) => {
    e.preventDefault();
    console.log(e);
    axios.post("http://localhost:3003/users", {
        id: inpValues.id,
        name: inpValues.name,
        email: inpValues.email,
      })
      .then(() => {
        setInpValues({ ...inpValues, id: "", name: "",email: "" });
        console.log("hello" + inpValues.name+" :id")
      })
      .catch((err) => {
        console.log(err);
      });

    setTimeout(() => {
      loadData();
    }, 500);
  };

  //Update User
  const updateUser = () => {
    // console.log(inpValues.id);
    // console.log(id);

    axios
      .put(`http://localhost:3003/users/${inpValues.id}`, {
        id: inpValues.id,
        name: inpValues.name,
        email: inpValues.email,
      })
      .then((response) => {
        console.log(response);
        setInpValues({ ...inpValues, id: "", name: "", email: "" });
        console.log(inpValues.id);
      })
      .catch((error) => {
        console.log(error);
      });
    setTimeout(() => {
      loadData();
    }, 500);
  };

  //Delete user
  const deleteUser = (e) => {
    // console.log(e.target.value);
    console.log(inpValues.id);
    if (inpValues.id !== "") {
      axios.delete(`http://localhost:3003/users/${inpValues.id}`).then(()=>{
        setInpValues({ ...inpValues, id: "", name: "", email: "" });
      })
      .catch((error)=>{
        console.log(error);
      })
      setTimeout(() => {
        loadData();
      }, 500);
    } else {
      alert("Please enter id to delete");
    }
  };

  return (
    <div>
      <div className="container p-5">
        <div className="form-group pt-5 justify-content-center d-flex flex-column align-items-center">
          <h1 className="text-primary mb-4">CRUD</h1>
          <div className="row border justify-content-center p-4 mb-5">
            <div className="col-12 col-md-10 col-xl-8 d-flex flex-column gap-4">
              <div className="row justify-content-center">
                <div className="col-lg-8 col-md-8 col-sm-8 form-floating">
                  <input
                    variant="outlined"
                    label="name"
                    type="text"
                    className="form-control"
                    placeholder="name"
                    id="name"
                    name="name"
                    value={inpValues.name}
                    onChange={changeHandler}
                    onBlur={handleBlur}
                  />
                  <label htmlFor="name" className="ms-3 ms-md-4 ms-sm-2 ">
                    name
                  </label>
                  {error.nameError === true ? (
                    <span className="text-danger">enter valid name</span>
                  ) : null}
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="emp-id"
                    type="text"
                    className="form-control"
                    placeholder="emp-id"
                    id="emp-id"
                    name="id"
                    value={inpValues.id}
                    onChange={changeHandler}
                  />
                  <label htmlFor="emp-id" className="ps-4">
                    emp-id
                  </label>
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-12 col-md-10 col-xl-8 w-100 form-floating">
                  <input
                    variant="outlined"
                    label="email"
                    type="text"
                    className="form-control"
                    placeholder="E-mail"
                    id="email"
                    name="email"
                    value={inpValues.email}
                    onChange={changeHandler}
                    onBlur={handleBlur}
                  />
                  <label htmlFor="email" className="ms-3 ms-md-4 ms-sm-2 ">
                    Email
                  </label>
                  {error.mailError === true ? (
                    <span className="text-danger">enter valid mail-id</span>
                  ) : null}
                </div>
              </div>
              <div className="row justify-content-evenly  ">
                <div className="col-lg-3 col-md-3 col-sm-3 form-floating">
                  <button
                    variant="container"
                    type="submit"
                    className="btn btn-success"
                    onClick={AddUser}
                  >
                    Add
                  </button>
                </div>
                <div className="col-lg-2 col-md-2 col-sm-1">
                  <button className="btn btn-primary " onClick={updateUser}>
                    update
                  </button>
                </div>
                <div className="col-lg-2 col-md-2 col-sm-1">
                  <button className="btn btn-danger " onClick={deleteUser}>
                    delete
                  </button>
                </div>
              </div>
              {/* tabels to the values */}
              <div className="row justify-content-center">
                <div className="col-lg-12 col-md-12 col-sm-8 form-floating border-bottom ">
                  <div className="">
                    <div className="col-lg-12 col-md-12 col-sm-8 d-flex gap-3 m-2">
                      <div className="col-lg-2 col-md-2 col-sm-2">
                        <span className="fw-bold ">ID</span>
                      </div>
                      <div className="col-lg-4 col-md-4 col-sm-4">
                        <span className="fw-bold ">NAME</span>
                      </div>
                      <div className="col-lg-6 col-md-5 col-sm-2">
                        <span className="fw-bold ">EMAIL</span>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              {/* vaslues from data base */}
              <div className="row justify-content-center">
                <div className="col-lg-12 col-md-12 col-sm-8 form-floating">
                  {user.map((e) => (
                    <div className="" key={e.id}>
                      <div className="col-lg-12 col-md-12 col-sm-8 d-flex gap-3 m-2">
                        <div className="col-lg-2 col-md-2 col-sm-2">
                          <input
                            type="text"
                            className="form-control"
                            value={e.id}
                            readOnly
                          />
                        </div>
                        <div className="col-lg-4 col-md-4 col-sm-4">
                          <input
                            type="text"
                            className="form-control"
                            value={e.name}
                            readOnly
                          />
                        </div>
                        <div className="col-lg-6 col-md-5 col-sm-2">
                          <input
                            type="text"
                            className="form-control"
                            value={e.email}
                            readOnly
                          />
                        </div>
                      </div>
                    </div>
                  ))}
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Crud;
