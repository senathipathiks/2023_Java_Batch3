import React, { useState, useEffect } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";
import Modal from "react-modal";
import EmployeeService from "../services/EmployeeService";

const ListEmployeeComponent = () => {
  //Modals Page
  const history = useNavigate();
  const [modalIsOpen1, setModalIsOpen1] = useState(false);
  const [modalIsOpen2, setModalIsOpen2] = useState(false);

  const openModal1 = () => {
    history("/");
    setModalIsOpen1(true);
  };

  const closeModal1 = () => {
    history("/");
    setModalIsOpen1(false);
  };

  const openModal2 = () => {
    history("/");
    setModalIsOpen1(true);
  };

  const closeModal2 = () => {
    history("/");
    setModalIsOpen1(false);
  };

  //Add and Update Employee Operation

  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [emailId, setEmailId] = useState("");

  const { id } = useParams();

  const saveOrUpdateEmployee = (e) => {
    e.preventDefault();

    const employee = { firstName, lastName, emailId };

    if (firstName != "" && lastName != "" && emailId != "") {
      if (id) {
        EmployeeService.updateEmployee(id, employee)
          .then((response) => {
            alert("Employee Updated Successfully");
            {
              history("/");
              closeModal1();
            }
          })
          .catch((error) => {
            console.log(error);
          });
      } else {
        EmployeeService.createEmployee(employee)
          .then((response) => {
            console.log(response.data);
            alert("Employee Updated Successfully");
            {
              closeModal1();
            }
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

  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    getAllEmployees();
  }, []);

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

  const deleteEmployee = (employeeId) => {
    EmployeeService.deleteEmployee(employeeId)
      .then((response) => {
        getAllEmployees();
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div className="container-fluid bg-dark">
      <Modal
        isOpen={modalIsOpen1}
        onRequestClose={closeModal1}
        style={{
          overlay: {
            backgroundColor: "rgba(0, 0, 0, 0.75)",
          },
          content: {
            top: "50%",
            left: "50%",
            right: "auto",
            bottom: "auto",
            marginRight: "-50%",
            transform: "translate(-50%, -50%)",
            backgroundColor: "#f2f2f2",
            padding: "20px",
            borderRadius: "5px",
            border: "1px solid #ccc",
          },
        }}
      >
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

          <button
            className="btn btn-success"
            onClick={(e) => saveOrUpdateEmployee(e)}
          >
            Submit{" "}
          </button>
          <button className="btn btn-secondary" onClick={closeModal1}>
            Close
          </button>
        </form>
      </Modal>
      <h2 className="text-center text-light"> List Employees </h2>
      <div className="d-flex justify-content-center">
        <button className="btn btn-primary" onClick={openModal1}>
          Add Employee
        </button>
        <button className="btn btn-primary" onClick={openModal2}>
          Update Employee
        </button>

        <Link to="/find-employee" className="btn btn-primary mb-2 ms-2">
          Find Employee
        </Link>
        <Link to="/update-employee" className="btn btn-primary mb-2 ms-2">
          Update Employee
        </Link>
        <Link to="/My-Component" className="btn btn-primary mb-2 ms-2">
          Update Employee
        </Link>
      </div>
      <table className="table table-striped table-bordered table-dark">
        <thead>
          <tr>
            <th> Employee Id </th>
            <th> Employee First Name </th>
            <th> Employee Last Name </th>
            <th> Employee Email Id </th>
            <th> Action</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td> {employee.id} </td>
              <td> {employee.firstName} </td>
              <td>{employee.lastName}</td>
              <td>{employee.emailId}</td>
              <td>
                <Link
                  className="btn btn-info"
                  to={`/edit-employee/${employee.id}`}
                >
                  Update
                </Link>
                <button
                  className="btn btn-danger"
                  onClick={() => deleteEmployee(employee.id)}
                  style={{ marginLeft: "10px" }}
                >
                  {" "}
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListEmployeeComponent;
