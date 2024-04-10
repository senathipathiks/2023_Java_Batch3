import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";
import axios from "axios";

const FindEmployeeComponent = () => {
  const [id, setId] = useState("");
  const [employee, setEmployee] = useState([]);
  const [employeeval, setValEmployee] = useState({});
  const navigate = useNavigate();

  useEffect((async) => {
    // Fetch employee IDs and populate the options
    axios
      .get(`http://localhost:2345/api/v1/employees/idList`)
      .then((res) => {
        setEmployee(res.data);
        console.log(employee);
        console.log(res.data);
      })
      .catch(() => {
        console.error("Error");
      });
  }, []);

  const findEmployeeById = (e) => {
    e.preventDefault();
    console.log(id);
    EmployeeService.getEmployeeById(id)
      .then((response) => {
        console.log(response.data);
        setValEmployee(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const goToAddEmployeePage = () => {
    navigate("/add-employee");
  };

  return (
    <div>
      <br />
      <br />
      <div className="container">
        <div className="row">
          <div className="card col-md-6 offset-md-3 offset-md-3">
            <div className="card-body">
              <form>
                <div className="form-group mb-2">
                  <label className="form-label"> Employee ID :</label>
                  <select
                    className="form-control"
                    value={id}
                    onChange={(e) => setId(e.target.value)}
                  >
                    <option value="">Select employee...</option>
                    {employee.map((option) => (
                      <option key={option} value={option}>
                        {option}
                      </option>
                    ))}
                  </select>
                </div>

                <button
                  className="btn btn-success"
                  onClick={(e) => findEmployeeById(e)}
                >
                  Find Employee{" "}
                </button>
                <button
                  className="btn btn-primary"
                  onClick={goToAddEmployeePage}
                >
                  Add Employee
                </button>
              </form>
            </div>
          </div>
        </div>
      </div>
      {employee && (
        <div className="container mt-3">
          <div className="row">
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <div className="card-body">
                <div className="row">
                  <label className="col-sm-2 col-form-label">First Name:</label>
                  <div className="col-sm-10">{employeeval.firstName}</div>
                </div>
                <div className="row">
                  <label className="col-sm-2 col-form-label">Last Name:</label>
                  <div className="col-sm-10">{employeeval.lastName}</div>
                </div>
                <div className="row">
                  <label className="col-sm-2 col-form-label">Email:</label>
                  <div className="col-sm-10">{employeeval.emailId}</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};

export default FindEmployeeComponent;
