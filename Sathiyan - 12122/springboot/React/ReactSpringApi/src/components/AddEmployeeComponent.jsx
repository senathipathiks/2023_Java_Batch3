import { motion } from "framer-motion";
import React, { useState, useEffect } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";

const AddEmployeeComponent = () => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [emailId, setEmailId] = useState("");
  const history = useNavigate();
  const { id } = useParams();

  const saveOrUpdateEmployee = (e) => {
    e.preventDefault();

    const employee = { firstName, lastName, emailId };

    if (firstName != "" && lastName != "" && emailId != "") {
      if (id) {
        EmployeeService.updateEmployee(id, employee)
          .then((response) => {
            history("/employees");
          })
          .catch((error) => {
            console.log(error);
          });
      } else {
        EmployeeService.createEmployee(employee)
          .then((response) => {
            console.log(response.data);
            history("/employees");
          })
          .catch((error) => {
            console.log(error);
          });
      }
    } else {
      alert("Please Fill all the fields");
    }
  };

  useEffect(() => {
    EmployeeService.getEmployeeById(id)
      .then((response) => {
        setFirstName(response.data.firstName);
        setLastName(response.data.lastName);
        setEmailId(response.data.emailId);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  const title = () => {
    if (id) {
      return <h2 className="text-center">Update Employee</h2>;
    } else {
      return <h2 className="text-center bg-dark">Add Employee</h2>;
    }
  };

  return (
    <div className="container-fluid bg-light">
      <br />
      <br />
      <div className="container">
        <div className="row">
          <div className="card col-md-6 offset-md-3 offset-md-3">
            <div className="text-center text-light">{title}</div>
            <div className="card-body">
              <form>
                <div className="form-group mb-2">
                  <label className="form-label"> First Name :</label>
                  <input
                    type="text"
                    placeholder="Enter first name"
                    name="firstName"
                    className="form-control"
                    value={firstName}
                    onChange={(e) => setFirstName(e.target.value)}
                  ></input>
                </div>

                <div className="form-group mb-2">
                  <label className="form-label"> Last Name :</label>
                  <input
                    type="text"
                    placeholder="Enter last name"
                    name="lastName"
                    className="form-control"
                    value={lastName}
                    onChange={(e) => setLastName(e.target.value)}
                    required
                  ></input>
                </div>

                <div className="form-group mb-2">
                  <label className="form-label"> Email Id :</label>
                  <input
                    type="email"
                    placeholder="Enter email Id"
                    name="emailId"
                    className="form-control"
                    value={emailId}
                    onChange={(e) => setEmailId(e.target.value)}
                  ></input>
                </div>

                <motion.button
                  className="btn btn-success"
                  onClick={(e) => saveOrUpdateEmployee(e)}
                  whileHover={{ scale: 1.1 }}
                  whileTap={{ scale: 0.9 }}
                >
                  Submit{" "}
                </motion.button>
                <Link to="/employees">
                  <motion.button
                    className="btn btn-danger"
                    whileHover={{ scale: 1.1 }}
                    whileTap={{ scale: 0.9 }}
                  >
                    Cancel{" "}
                  </motion.button>
                </Link>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AddEmployeeComponent;
