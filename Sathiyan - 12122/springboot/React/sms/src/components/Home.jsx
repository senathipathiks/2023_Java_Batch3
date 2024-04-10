import React, { useState, useEffect } from "react";
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";
import StudentService from "../services/StudentService";
import DepartmentService from "../services/DepartmentService";

const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  borderRadius: "0.25em",
  bgcolor: "black",
  border: "2px solid gray",
  boxShadow: 24,
  p: 4,
};

const Home = () => {
  const [students, setStudents] = useState([]);
  const [selectedStudent, setSelectedStudent] = useState({
    sname: "",
    age: "",
    gender: "",
    location: "",
    department: {
      did: 0,
    },
  });
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findStudent, setFindStudent] = useState("");
  const [foundStudent, setFoundStudent] = useState(null);
  const [deleteConfirmationOpen, setdeleteConfirmationOpen] = useState(false);
  const [studentToDelete, setStudentToDelete] = useState(null);
  const [departments, setDepartments] = useState([]);

  useEffect(() => {
    fetchDepartments();
  }, []);

  const fetchDepartments = () => {
    DepartmentService.getAllDepartment()
      .then((response) => {
        setDepartments(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    getAllStudents();
  }, []);

  const getAllStudents = () => {
    StudentService.getAllStudent()
      .then((response) => {
        setStudents(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (sid) => {
    setStudentToDelete(sid);
    setdeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (studentToDelete) {
      StudentService.deleteStudent(studentToDelete)
        .then(() => {
          setStudents(
            students.filter((student) => student.sid != studentToDelete)
          );
          setdeleteConfirmationOpen(false);
          alert("Student Deleted Successfully !!!");
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting Student ... !!!");
        });
    }
  };

  const handleUpdateOpen = (student) => {
    setSelectedStudent(student);
    setModalOpen(true);
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundStudent(null);
    setFindStudent("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (selectedStudent.sid) {
      // Update student
      StudentService.updateStudent(selectedStudent.sid, selectedStudent)
        .then(() => {
          alert("Student Updated Successfully");
          setModalOpen(false);
          getAllStudents();
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      // Create student
      StudentService.createStudent(selectedStudent)
        .then(() => {
          alert("Student Created Successfully");
          setModalOpen(false);
          getAllStudents();
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
        });
    }
  };

  const handleFindStudent = (e) => {
    e.preventDefault();
    StudentService.getStudentById(findStudent)
      .then((response) => {
        setFoundStudent(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Student not found");
      });
  };

  return (
    <div>
      <div style={{ height: "100vh", position: "relative" }}>
        <br></br>
        <h1 className="text-light">Student management System</h1>
        <br />
        {/* Buttons */}
        <button
          onClick={() => setModalOpen(true)}
          className="btn btn-primary ms-4 px-2"
        >
          Insert Student
        </button>

        <button
          onClick={handleFind}
          className="btn btn-warning    px-2 mr-2 ms-4 "
        >
          Find Student
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
                    placeholder="Enter Student Name"
                    name="sname"
                    className="form-control mb-4"
                    value={selectedStudent?.sname || ""}
                    onChange={(e) =>
                      setSelectedStudent({
                        ...selectedStudent,
                        sname: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="number"
                    placeholder="Enter Age"
                    name="age"
                    className="form-control mb-4"
                    value={selectedStudent?.age || ""}
                    onChange={(e) =>
                      setSelectedStudent({
                        ...selectedStudent,
                        age: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="text"
                    placeholder="Enter Gender"
                    name="gender"
                    className="form-control mb-4"
                    value={selectedStudent?.gender || ""}
                    onChange={(e) =>
                      setSelectedStudent({
                        ...selectedStudent,
                        gender: e.target.value,
                      })
                    }
                    required
                  />
                  <TextField
                    type="text"
                    placeholder="Enter Location"
                    name="location"
                    className="form-control mb-4"
                    value={selectedStudent?.location || ""}
                    onChange={(e) =>
                      setSelectedStudent({
                        ...selectedStudent,
                        location: e.target.value,
                      })
                    }
                    required
                  />
                  <select
                    className="form-control mb-4"
                    value={selectedStudent.department.did || ""}
                    onChange={(e) =>
                      setSelectedStudent({
                        ...selectedStudent,
                        department: {
                          ...selectedStudent.department,
                          did: e.target.value,
                        },
                      })
                    }
                  >
                    <option value="">Select Department...</option>
                    {departments.map((dept) => (
                      <option key={dept.did} value={dept.did}>
                        {dept.did}
                      </option>
                    ))}
                  </select>
                  {/* Other text fields */}
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

        {/* Find Student Modal */}
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
              <form onSubmit={handleFindStudent}>
                <select
                  className="form-control"
                  value={findStudent || ""}
                  onChange={(e) => setFindStudent(Number(e.target.value))}
                >
                  <option value="">Select Student...</option>
                  {students.map((option) => (
                    <option key={option} value={option.sid}>
                      {option.sid}
                    </option>
                  ))}
                </select>
                <button className="btn btn-success" type="submit">
                  Find Student
                </button>
              </form>
              <button className="btn btn-secondary" onClick={handleFindClose}>
                Close
              </button>
              {foundStudent && (
                <div>
                  <table className="table text-light table-bordered bg-dark">
                    <thead>
                      <tr>
                        <th>Student Name</th>
                        <th>Student Age</th>
                        <th>Student Gender</th>
                        <th>Student Location</th>
                        <th>Student Dept ID</th>
                        <th>Student Dept Name</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>{foundStudent.sname}</td>
                        <td>{foundStudent.age}</td>
                        <td>{foundStudent.gender}</td>
                        <td>{foundStudent.location}</td>
                        <td>{foundStudent.department.did}</td>
                        <td>{foundStudent.department.dname}</td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              )}
            </Box>
          </Fade>
        </Modal>

        {/* Student List */}
        <table className="table text-light table-bordered">
          <thead>
            <tr>
              <th>Student Id</th>
              <th>Student Name</th>
              <th>Student Age</th>
              <th>Student Gender</th>
              <th>Student Location</th>
              <th>Student Department ID</th>
              <th>Student Department Name</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {students.map((student) => (
              <tr key={student.sid}>
                <td>{student.sid}</td>
                <td>{student.sname}</td>
                <td>{student.age}</td>
                <td>{student.gender}</td>
                <td>{student.location}</td>
                <td>{student.department.did}</td>
                <td>{student.department.dname}</td>
                {/* Other table data */}
                <td>
                  <button
                    onClick={() => handleUpdateOpen(student)}
                    className="btn btn-primary"
                  >
                    Update
                  </button>
                  <button
                    onClick={() => handleDelete(student.sid)}
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
          onClose={() => setdeleteConfirmationOpen(false)}
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
                  onClick={() => setdeleteConfirmationOpen(false)}
                  className="btn btn-secondary px-5 ms-2"
                >
                  Cancel
                </button>
              </div>
            </Box>
          </Fade>
        </Modal>
      </div>
    </div>
  );
};

export default Home;
