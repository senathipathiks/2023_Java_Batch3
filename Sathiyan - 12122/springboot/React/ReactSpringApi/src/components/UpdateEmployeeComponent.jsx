import React, { Link, useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import EmployeeService from "../services/EmployeeService";
import axios from "axios";

const UpdateEmployeeComponent = () => {
  const [employees, setEmployees] = useState([]);
  const [selectedEmployeeId, setSelectedEmployeeId] = useState("");
  const navigate = useNavigate();

  const getAllEmployees = () => {
    EmployeeService.getAllEmployees()
      .then((response) => {
        setEmployees(response.data);
        console.log(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    getAllEmployees();
  }, []);

  const handleUpdateClick = (id) => {
    navigate(`/edit-employee/${id}`);
  };

  return (
    <>
      <div className="container align-center">
        <br />
        <br />
        <br />
        <div>
          <br />
          <br />
          <div className="container">
            <div className="row">
              <div className="card col-md-6 offset-md-3 offset-md-3">
                <div className="card-body">
                  <select
                    className="form-control"
                    value={selectedEmployeeId}
                    onChange={(e) => setSelectedEmployeeId(e.target.value)}
                  >
                    <option value="">Select an employee</option>
                    {employees.map((employee) => (
                      <option key={employee.id} value={employee.id}>
                        {employee.id}
                      </option>
                    ))}
                  </select>
                  <br />
                  <button
                    className="btn btn-info"
                    onClick={() => handleUpdateClick(selectedEmployeeId)}
                    disabled={selectedEmployeeId === ""}
                  >
                    Update
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
    </>
  );
};

export default UpdateEmployeeComponent;
