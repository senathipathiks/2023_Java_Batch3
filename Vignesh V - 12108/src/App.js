// import "./App.css";
// import { useEffect, useState } from "react";
// import Axios from "axios";

// function App() {
//   const [users, setUsers] = useState([]);
//   const [id, setId] = useState("");
//   const [name, setName] = useState("");
//   const [updated, setUpdated] = useState({ id: "", name: "" });


//   // Hooks
//   useEffect(() => {
//     loadData();
//   }, []);

//   //get user from API

//   const loadData = async () => {
//     const response = await Axios.get("http://localhost:3000/users");
//     console.log(response.data);

//     setUsers(response.data);
//   };

//   // Add user

//   const AddUser = (e) => {
//     e.preventDefault();
//     console.log(id, name);

//     Axios.post("http://localhost:3000/users", {
//       id,
//       name,
//     })
//       .then(() => {
//         setId("");
//         setName("");
//       })
//       .catch((err) => {
//         console.log(err);
//       });

//     setTimeout(() => {
//       loadData();
//     }, 500);
//   };

//   //Delete user
//   const deleteUser = (id) => {
//     console.log(id);

//     Axios.delete(`http://localhost:3000/users/${id}`);

//     setTimeout(() => {
//       loadData();
//     }, 500);
//   };

//   //Update User

//   const updateUser = () => {
//     console.log(updated.id, updated.name);

//     Axios.put(`http://localhost:3000/users/${updated.id}`, {
//       // id: updated.id,
//       name: updated.name,
//     })
//     .then((response) => {
//       console.log(response);
//     })
//     .catch((error)=>{
//       console.log(error);
//     })
//     setTimeout(() => {
//       loadData();
//     }, 500);
//   };

//   return (
//     <div className="App">
//       <h1>JSON CRUD</h1>
//       <div>

//         {/* Add user buttons */}
//         <input type="text"
//           placeholder="Enter Id ...."
//           value={id}
//           onChange={(e) => setId(e.target.value)}
//         />
//         <input type="text"
//           placeholder="Enter name ...."
//           value={name}
//           onChange={(e) => setName(e.target.value)}
//         />

//         <button onClick={AddUser}>Add</button>

//        {/* delete user buttons */}
//         {users.map((e) => (
//           <div key={e.id} className="box">
//             <div className="box-1">
//               name : {e.name} <br />
//               ID : {e.id}
//             </div>
//             <button
//               onClick={() => {
//                 deleteUser(e.id);
//               }}
//             >
//               Delete
//             </button>


//             {/* Update user buttons */}
//             <div>
//               <div className="box-2">
//                 <input
//                   onChange={(e) =>
//                     setUpdated({ ...updated, id: e.target.value })
//                   }
//                 />
//                 <input
//                   onChange={(e) =>
//                     setUpdated({ ...updated, name: e.target.value })
//                   }
//                 />

//                 <button onClick={updateUser}>Update</button>
//               </div>
//             </div>
//           </div>
//         ))}
//       </div>
//     </div>
//   );
// }

// export default App;


import React, { useState, useEffect } from "react";
import axios from "axios";
//import './App.css';
import { Container, Table, Form, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  const [students, setStudents] = useState([]);
  const [newStudent, setNewStudent] = useState({
    id: "",
    name: "",
    Usertype: "",
    LastSignedIn : "",
    Hoursspent :"",
    totalhoursspent:""


  });
  const [editingStudent, setEditingStudent] = useState(null);

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = async () => {
    try {
      const response = await axios.get("http://localhost:4000/students");
      setStudents(response.data);
    } catch (error) {
      console.error("Error fetching students:", error);
    }
  };

  const addStudent = async () => {
    try {
      console.log("hello");
      await axios.post("http://localhost:4000/students", editingStudent);
      fetchStudents();
      setNewStudent({ id: "", name: "",  Usertype: "",LastSignedI : "",Hoursspent :"", totalhoursspent:"" });
    } catch (error) {
      console.error("Error adding student:", error);
    }
  };

  const deleteStudent = async (id) => {
    try {
      await axios.delete(`http://localhost:4000/students/${id}`);
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
        `http://localhost:4000/students/${editingStudent.id}`,
        editingStudent
      );
      fetchStudents();
      setEditingStudent(null);
    } catch (error) {
      console.error("Error updating student:", error);
    }
  };

  return (
    <Container>
      <h1>USER MANAGEMENT SYSTEMS</h1>

      <Form>
        <Form.Group controlId="formid">
          <Form.Label>User Id</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter user id"
            value={editingStudent ? editingStudent.userid : newStudent.userid}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({ ...editingStudent, useridid: e.target.value })
                : setNewStudent({ ...newStudent, userid: e.target.value })
            }
          />
        </Form.Group>
        <Form.Group controlId="formName">
          <Form.Label>UserName</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter user name"
            value={editingStudent ? editingStudent.username : newStudent.username}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({ ...editingStudent, username: e.target.value })
                : setNewStudent({ ...newStudent, username: e.target.value })
            }
          />
        </Form.Group>
        <Form.Group controlId="Usertype">
          <Form.Label>Usertype</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter User type"
            value={editingStudent ? editingStudent.usertype : newStudent.usertype}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({ ...editingStudent, usertype: e.target.value })
                : setNewStudent({ ...newStudent, usertype: e.target.value })
            }
          />
        </Form.Group>
        <Form.Group controlId="LastSignedIn">
          <Form.Label> LastSignedIn</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter LastSignedIn"
            value={editingStudent ? editingStudent. LastSignedIn : newStudent. LastSignedIn}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({
                    ...editingStudent,
                    LastSignedIn: e.target.value,
                  })
                : setNewStudent({ ...newStudent,  LastSignedIn: e.target.value })
            }
          />
        </Form.Group>
        <Form.Group controlId="No.of hours Spent">
          <Form.Label>No.of hours Spent</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter No.of hours Spent"
            value={editingStudent ? editingStudent. hoursspent : newStudent.  hoursspent}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({
                    ...editingStudent,
                    LastSignedIn: e.target.value,
                  })
                : setNewStudent({ ...newStudent, hoursspent: e.target.value })
            }
          />
        </Form.Group>
        <Form.Group controlId="Total Number of hours Spent">
          <Form.Label>Total Number of hours Spent</Form.Label>
          <Form.Control
            type="text"
            placeholder="Total Number of hours Spent"
            value={editingStudent ? editingStudent.totalhoursspent : newStudent.  totalhoursspenthoursspent}
            onChange={(e) =>
              setEditingStudent
                ? setEditingStudent({
                    ...editingStudent,
                    LastSignedIn: e.target.value,
                  })
                : setNewStudent({ ...newStudent, hoursspent: e.target.value })
            }
          />
        </Form.Group>

        <Button variant="primary" onClick={addStudent}>
          Add Users
        </Button>
      </Form>

      <Table striped bordered hover>
        <thead>
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Usertype</th>
            <th> LastSignedIn</th>
            <th>Hours spent </th>
            <th>totalhoursspent</th>
          
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {students.map((student) => (
            <tr key={student.id}>
              <td>{student.Name}</td>
              <td>{student.Usertype}</td>
              <td>{student.LastSignedIn}</td>
              <td>{student.Hoursspent }</td>
              <td>{student.totalhoursspent}</td>
              <td>
                <Button
                  variant="danger"
                  className="ms-3"
                  onClick={() => deleteStudent(student.id)}
                >
                  Delete
                </Button>
                <Button
                  variant="warning"
                  className="ms-3"
                  onClick={() => startEditing(student.id)}
                >
                  Edit
                </Button>

                <Button
                  variant="success"
                  className="ms-3"
                  onClick={updateStudent}
                >
                  Update Student
                </Button>
              </td>
            </tr>
          ))}
        </tbody>
      </Table>
    </Container>
  );
}

export default App;
