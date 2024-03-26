import React, { useState, useEffect } from "react";
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";
import DepartmentService from "../services/DepartmentService";

const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  borderRadius: "0.25em",
  bgcolor: "background.paper",
  border: "2px solid gray",
  boxShadow: 24,
  p: 4,
};

const Department = () => {
  const [department, setDepartment] = useState([]);
  const [selectedDepartment, setselectedDepartment] = useState({});
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findDepartment, setFindDepartment] = useState("");
  const [foundDepartment, setFoundDepartment] = useState(null);
  const [deleteConfirmationOpen, setDeleteConfirmationOpen] = useState(false);
  const [departmentToDelete, setDepartmentToDelete] = useState(null);
  const [departments, setDepartments] = useState([]);

  useEffect(() => {
    getAllDepartment();
  }, []);

  const getAllDepartment = () => {
    DepartmentService.getAllDepartment()
      .then((response) => {
        setDepartments(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (did) => {
    setDepartmentToDelete(did);
    setDeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (departmentToDelete) {
      DepartmentService.deleteDepartment(departmentToDelete)
        .then(() => {
          setDepartment(
            department.filter(
              (department) => department.did != departmentToDelete
            )
          );
          setDeleteConfirmationOpen(false);
          alert("Department Deleted Successfully !!!");
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting Department ... !!!");
        });
    }
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundDepartment(null);
    setFindDepartment("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    DepartmentService.createDepartment(selectedDepartment)
      .then(() => {
        alert("Department Created Successfully");
        setModalOpen(false);
        getAllDepartment();
        window.location.reload();
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleFindDepartment = (e) => {
    e.preventDefault();
    DepartmentService.getDepartmentById(findDepartment)
      .then((response) => {
        setFoundDepartment(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Department not found");
      });
  };
  return (
    <div>
      <br></br>
      <h1 className="text-light">Department management System</h1>
      <br />
      {/* Buttons */}
      <button
        onClick={() => setModalOpen(true)}
        className="btn btn-primary ms-4 px-2"
      >
        Insert Department
      </button>
      <button
        onClick={handleFind}
        className="btn btn-warning    px-2 mr-2 ms-4 "
      >
        Find Department
      </button>
      <br />
      <br />
      {/* Insert / Update Modal */}
      <Modal
        open={modalOpen}
        onClose={() => setModalOpen(false)}
        aria-labelledby="transition-modal-title"
        aria-describedby="transition-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={modalOpen}>
          <Box sx={style}>
            <div className="d-flex flex-column justify-content-center align-items-center">
              <form onSubmit={handleSubmit}>
                <TextField
                  type="text"
                  placeholder="Enter Department Name"
                  name="dname"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedDepartment({
                      ...selectedDepartment,
                      dname: e.target.value,
                    })
                  }
                  required
                />
                <center>
                  <button
                    style={{
                      width: "60%",
                      fontFamily: "cursive",
                      fontSize: "20px",
                    }}
                    className="btn btn-primary"
                    type="submit"
                  >
                    Submit
                  </button>
                </center>
              </form>
              <br />
              <button
                style={{
                  width: "30%",
                  fontFamily: "cursive",
                  fontSize: "20px",
                }}
                className="btn btn-secondary "
                onClick={() => setModalOpen(false)}
              >
                Close
              </button>
            </div>
          </Box>
        </Fade>
      </Modal>
      {/* Find Department Model */}
      <Modal
        open={findModalOpen}
        onClose={handleFindClose}
        aria-labelledby="transition-modal-title"
        aria-describedby="transition-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={findModalOpen}>
          <Box sx={style}>
            <form onSubmit={handleFindDepartment}>
              <select
                className="form-control"
                value={findDepartment || ""}
                onChange={(e) => setFindDepartment(Number(e.target.value))}
              >
                <option value="">Select Department...</option>
                {departments.map((option) => (
                  <option key={option} value={option.did}>
                    {option.did}
                  </option>
                ))}
              </select>
              <button className="btn btn-success" type="submit">
                Find Department
              </button>
            </form>
            <button className="btn btn-secondary" onClick={handleFindClose}>
              Close
            </button>
            {foundDepartment && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>Department ID</th>
                      <th>Department Name</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundDepartment.did}</td>
                      <td>{foundDepartment.dname}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>
      <table className="table text-light table-bordered">
        <thead>
          <tr>
            <th>Department Id</th>
            <th>Department Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {departments.map((dept) => (
            <tr key={dept.did}>
              <td>{dept.did}</td>
              <td>{dept.dname}</td>
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleDelete(dept.did)}
                  className="btn btn-danger"
                  style={{ marginLeft: "10px" }}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <Modal
        open={deleteConfirmationOpen}
        onClose={() => setDeleteConfirmationOpen(false)}
        aria-labelledby="delete-confirmation-modal-title"
        aria-describedby="delete-confirmation-modal-description"
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={deleteConfirmationOpen}>
          <Box sx={style}>
            <h4>Are you sure you want to delete this student?</h4>
            <br />
            <div className="d-flex align-items-center justify-content-center">
              <button
                onClick={confirmDelete}
                className="btn btn-danger px-5 ms-2"
              >
                Delete
              </button>
              <button
                onClick={() => setDeleteConfirmationOpen(false)}
                className="btn btn-secondary px-5 ms-2"
              >
                Cancel
              </button>
            </div>
          </Box>
        </Fade>
      </Modal>
    </div>
  );
};

export default Department;
