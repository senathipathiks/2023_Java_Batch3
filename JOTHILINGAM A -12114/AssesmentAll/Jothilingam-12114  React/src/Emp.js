import React, { useState, useEffect } from "react";
import axios from "axios";
import EmpUpdate from "./empUpdate";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min";

const Emp = () => {
  const [employees, setEmployees] = useState([]);
  const [newEmployee, setNewEmployee] = useState({
    name: "",
    position: "",
    phone: "",
  });
  const [updatedEmployee, setUpdatedEmployee] = useState(null);

  useEffect(() => {
    fetchEmployees();
  }, []);

  const fetchEmployees = () => {
    axios
      .get("http://localhost:3003/employee")
      .then((response) => setEmployees(response.data))
      .catch((error) => console.error("Error fetching data:", error));
  };

  const addEmployee = () => {
    axios
      .post("http://localhost:3003/employee", newEmployee)
      .then(() => {
        fetchEmployees();
        setNewEmployee({ name: "", position: "", phone: "" });
      })
      .catch((error) => console.error("Error adding employee:", error));
  };

  const updateEmployee = (id, updatedData) => {
    axios
      .put(`http://localhost:3003/employee/${id}`, updatedData)
      .then(() => fetchEmployees())
      .catch((error) => console.error("Error updating employee:", error));
  };

  const deleteEmployee = (id) => {
    axios
      .delete(`http://localhost:3003/employee/${id}`)
      .then(() => fetchEmployees())
      .catch((error) => console.error("Error deleting employee:", error));
  };

  const handleUpdateClick = (employee) => {
    setUpdatedEmployee(employee);
  };

  const handleUpdateSubmit = (updatedEmployee) => {
    updateEmployee(updatedEmployee.id, updatedEmployee);
    setUpdatedEmployee(null);
  };

  return (
    <div className="container mt-4 ">
      <div className="container  ">
        <h2>Employee Management System</h2>

        <div className="mb-3 ">
          <label className="col g-8 ">Name:</label>
          <input
          className="form-control "
            type="text"
            value={newEmployee.name}
            onChange={(e) =>
              setNewEmployee({ ...newEmployee, name: e.target.value })
            }
          />
        </div>

        <div className="mb-3">
          <label>Position:</label>
          <input
          className="form-control "
            type="text"
            value={newEmployee.position}
            onChange={(e) =>
              setNewEmployee({ ...newEmployee, position: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label>Phone:</label>
          <input
          className="form-control "
            type="text"
            value={newEmployee.phone}
            onChange={(e) =>
              setNewEmployee({ ...newEmployee, phone: e.target.value })
            }
          />
        </div>

        <button className="btn btn-primary mr-2" onClick={addEmployee}>
          Add Employee
        </button>
      </div>

      <table className="table table-info mt-4">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Position</th>
            <th>phone</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.name}</td>
              <td>{employee.position}</td>
              <td>{employee.phone}</td>

              <td>
                <button
                  className="btn btn-warning   "
                  onClick={() => handleUpdateClick(employee)}
                >
                  Update
                </button>
                <button
                  className="btn btn-danger ms-3"
                  onClick={() => deleteEmployee(employee.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      {updatedEmployee && (
        <EmpUpdate employee={updatedEmployee} onUpdate={handleUpdateSubmit} />
      )}
    </div>
  );
};

export default Emp;
