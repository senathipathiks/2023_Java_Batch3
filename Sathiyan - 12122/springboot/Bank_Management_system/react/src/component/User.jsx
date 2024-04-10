import React, { useEffect, useState } from "react";
import UserService from "../service/UserService";
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";

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

const User = () => {
  const [user, setUser] = useState([]);
  const [selectedUser, setselectedUser] = useState({});
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findUser, setFindUser] = useState("");
  const [foundUser, setFoundUser] = useState(null);
  const [deleteConfirmationOpen, setDeleteConfirmationOpen] = useState(false);
  const [userToDelete, setUserToDelete] = useState(null);
  const [users, setUsers] = useState([]);

  useEffect(() => {
    getAllUsers();
  }, []);

  const getAllUsers = () => {
    UserService.getAllUser()
      .then((response) => {
        setUsers(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (accountNumber) => {
    setUserToDelete(accountNumber);
    setDeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (userToDelete) {
      UserService.deleteUser(userToDelete)
        .then(() => {
          setUser(user.filter((user) => user.accountNumber != userToDelete));
          setDeleteConfirmationOpen(false);
          alert("Deleted Successfully !!!");
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting... !!!");
        });
    }
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundUser(null);
    setFindUser("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    UserService.createUser(selectedUser)
      .then(() => {
        alert("Created Successfully");
        setModalOpen(false);
        getAllUsers();
        window.location.reload();
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleFindUser = (e) => {
    e.preventDefault();
    UserService.getUserById(findUser)
      .then((response) => {
        setFoundUser(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Not found");
      });
  };

  return (
    <div className="container bg-dark  text-white">
      <br></br>
      <center>
        <h1>User management System</h1>
        <br />
        {/* Buttons */}
        <button
          onClick={() => setModalOpen(true)}
          className="btn btn-primary ms-4 px-2"
        >
          Create User
        </button>
        <button
          onClick={handleFind}
          className="btn btn-warning    px-2 mr-2 ms-4 "
        >
          Find User
        </button>
      </center>
      <br />
      <br />
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
                  placeholder="Enter User Name"
                  name="userName"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedUser({
                      ...selectedUser,
                      userName: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="email"
                  placeholder="Enter Mail Id"
                  name="eMail"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedUser({
                      ...selectedUser,
                      eMail: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="number"
                  placeholder="Enter Contact"
                  name="contact"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedUser({
                      ...selectedUser,
                      contact: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="text"
                  placeholder="Enter Full Address"
                  name="address"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedUser({
                      ...selectedUser,
                      address: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="text"
                  placeholder="Enter Branch"
                  name="branchName"
                  className="form-control mb-4"
                  onChange={(e) =>
                    setselectedUser({
                      ...selectedUser,
                      branchName: e.target.value,
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
            <form onSubmit={handleFindUser}>
              <select
                className="form-control"
                value={findUser || ""}
                onChange={(e) => setFindUser(Number(e.target.value))}
              >
                <option value="">Select User...</option>
                {users.map((option) => (
                  <option key={option} value={option.accountNumber}>
                    {option.accountNumber}
                  </option>
                ))}
              </select>
              <center>
                <br></br>
                <button className="btn btn-success" type="submit">
                  Find User
                </button>
              </center>
            </form>
            <br></br>
            <center>
              <button className="btn btn-secondary" onClick={handleFindClose}>
                Close
              </button>
            </center>

            {foundUser && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>User Name</th>
                      <th>Email id</th>
                      <th>Phone Number</th>
                      <th>Address</th>
                      <th>Branch Name</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundUser.userName}</td>
                      <td>{foundUser.eMail}</td>
                      <td>{foundUser.contact}</td>
                      <td>{foundUser.address}</td>
                      <td>{foundUser.branchName}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>

      <table className="table table-dark table-bordered">
        <thead>
          <tr>
            <th>Account number</th>
            <th>User Name</th>
            <th>Email id</th>
            <th>Phone Number</th>
            <th>Address</th>
            <th>Branch Name</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {users.map((user) => (
            <tr key={user.accountNumber}>
              <td>{user.accountNumber}</td>
              <td>{user.userName}</td>
              <td>{user.eMail}</td>
              <td>{user.contact}</td>
              <td>{user.address}</td>
              <td>{user.branchName}</td>
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleDelete(user.accountNumber)}
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
            <h4>Are you sure you want to delete?</h4>
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

export default User;
