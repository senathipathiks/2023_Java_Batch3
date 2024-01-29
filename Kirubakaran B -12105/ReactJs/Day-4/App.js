import React, { useState, useEffect } from "react";
import axios from "axios";
import { Container, Table, Form, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
function App() {
  const [students, setStudents] = useState([]);
  const [newStudent, setNewStudent] = useState({
    id: "",
    name: "",
    duration: "",
    fee: "",
    coursemode: "",
  });
  const [editingStudent, setEditingStudent] = useState(null);

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = async () => {
    try {
      const response = await axios.get("http://localhost:3003/students");
      setStudents(response.data);
    } catch (error) {
      console.error("Error fetching students:", error);
    }
  };

  const addStudent = async () => {
    try {
      console.log("hello");
      await axios.post("http://localhost:3003/students", editingStudent);
      fetchStudents();
      setNewStudent({
        id: "",
        name: "",
        duration: "",
        fee: "",
        coursemode: "",
      });
    } catch (error) {
      console.error("Error adding student:", error);
    }
  };

  const deleteStudent = async (id) => {
    try {
      await axios.delete(`http://localhost:3003/students/${id}`);
      fetchStudents();
    } catch (error) {
      console.error("Error deleting student:", error);
    }
  };

  const startEditing = (id) => {
    const studentToEdit = students.find((student) => student.id === id);
    setEditingStudent(studentToEdit);
  };

  const updateStudent = async () => {
    try {
      await axios.put(
        `http://localhost:3003/students/${editingStudent.id}`,
        editingStudent
      );
      fetchStudents();
      setEditingStudent(null);
    } catch (error) {
      console.error("Error updating student:", error);
    }
  };

  return (
    <body class="">
      <Container>
        <h1 id="head">Course Management System</h1>

        <Form id="form">
          <Form.Group controlId="formId">
            <Form.Label>Course Id</Form.Label>
            <Form.Control
              type="text"
              placeholder="Enter course id"
              value={editingStudent ? editingStudent.id : newStudent.id}
              onChange={(e) =>
                setEditingStudent
                  ? setEditingStudent({ ...editingStudent, id: e.target.value })
                  : setNewStudent({ ...newStudent, id: e.target.value })
              }
            />
          </Form.Group>
          <Form.Group controlId="formName">
            <Form.Label> Course Name</Form.Label>
            <Form.Control
              type="text"
              placeholder="Enter Course name"
              value={editingStudent ? editingStudent.name : newStudent.name}
              onChange={(e) =>
                setEditingStudent
                  ? setEditingStudent({
                      ...editingStudent,
                      name: e.target.value,
                    })
                  : setNewStudent({ ...newStudent, name: e.target.value })
              }
            />
            <Form.Group controlId="formAge">
              {" "}
              <Form.Label>Duration :</Form.Label>{" "}
              <Form.Check
                type="radio"
                label="3 months"
                name="duration"
                checked={
                  editingStudent
                    ? editingStudent.duration === "3"
                    : newStudent.duration === "3"
                }
                onChange={() =>
                  setEditingStudent
                    ? setEditingStudent({ ...editingStudent, duration: "3" })
                    : setNewStudent({ ...newStudent, duration: "3" })
                }
              />{" "}
              <Form.Check
                type="radio"
                label="6 months"
                name="duration"
                checked={
                  editingStudent
                    ? editingStudent.duration === "6"
                    : newStudent.duration === "6"
                }
                onChange={() =>
                  setEditingStudent
                    ? setEditingStudent({ ...editingStudent, duration: "6" })
                    : setNewStudent({ ...newStudent, duration: "6" })
                }
              />{" "}
            </Form.Group>
            <Form.Group controlId="formGrade">
              <Form.Label>Coursefee</Form.Label>
              <Form.Control
                type="text"
                placeholder="Enter course fee"
                value={editingStudent ? editingStudent.fee : newStudent.fee}
                onChange={(e) =>
                  setEditingStudent
                    ? setEditingStudent({
                        ...editingStudent,
                        fee: e.target.value,
                      })
                    : setNewStudent({ ...newStudent, fee: e.target.value })
                }
              />
            </Form.Group>
            <br />
            <Form.Group controlId="formGrade">
              {" "}
              <Form.Label>CourseMode:</Form.Label>{" "}
              <Form.Check
                type="radio"
                label="Online"
                name="coursemode"
                checked={
                  editingStudent
                    ? editingStudent.coursemode === "online"
                    : newStudent.coursemode === "online"
                }
                onChange={() =>
                  setEditingStudent
                    ? setEditingStudent({
                        ...editingStudent,
                        coursemode: "online",
                      })
                    : setNewStudent({ ...newStudent, coursemode: "online" })
                }
              />{" "}
              <Form.Check
                type="radio"
                label="Offline"
                name="coursemode"
                checked={
                  editingStudent
                    ? editingStudent.coursemode === "offline"
                    : newStudent.coursemode === "offline"
                }
                onChange={() =>
                  setEditingStudent
                    ? setEditingStudent({
                        ...editingStudent,
                        coursemode: "offline",
                      })
                    : setNewStudent({ ...newStudent, coursemode: "offline" })
                }
              />{" "}
            </Form.Group>
            <br />
          </Form.Group>
          <Button variant="primary" onClick={addStudent}>
            Submit
          </Button>
        </Form>
        <br />
        <br />
        <Table striped bordered hover id="table">
          <thead>
            <tr class="bg-danger">
              <th>CourseId</th>
              <th>CourseName</th>
              <th>Duration</th>
              <th>Coursefee</th>
              <th>Coursemode</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {students.map((student) => (
              <tr key={student.id} id="outputrow">
                <td>{student.id}</td>
                <td>{student.name}</td>
                <td>{student.duration}</td>
                <td>{student.fee}</td>
                <td>{student.coursemode}</td>
                <td>
                  <Button
                    id="edit"
                    variant="warning"
                    className="ms-3"
                    onClick={() => startEditing(student.id)}
                  >
                    Edit
                  </Button>

                  <Button
                    id="update"
                    variant="success"
                    className="ms-3"
                    onClick={updateStudent}
                  >
                    Update
                  </Button>

                  <Button
                    id="delete"
                    variant="danger"
                    className="ms-3"
                    onClick={() => deleteStudent(student.id)}
                  >
                    Delete
                  </Button>
                </td>
              </tr>
            ))}
          </tbody>
        </Table>
      </Container>
    </body>
  );
}

export default App;
