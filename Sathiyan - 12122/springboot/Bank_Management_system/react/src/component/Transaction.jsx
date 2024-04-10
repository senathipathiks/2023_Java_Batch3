import React, { useEffect, useState } from "react";
import UserService from "../service/UserService";
import { TextField, Modal, Backdrop, Fade, Box } from "@mui/material";
import TransactionService from "../service/TransactionService";

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

const Transaction = () => {
  const [transactions, setTransactions] = useState([]);
  const [selectedtransaction, setSelectedTransaction] = useState({
    modeOfTransaction: "",
    transactionLocation: "",
    user: {
      accountNumber: 0,
    },
  });
  const [modalOpen, setModalOpen] = useState(false);
  const [findModalOpen, setFindModalOpen] = useState(false);
  const [findTransaction, setFindTransaction] = useState("");
  const [foundTransaction, setFoundTransaction] = useState(null);
  const [deleteConfirmationOpen, setdeleteConfirmationOpen] = useState(false);
  const [transactionToDelete, setTransactionToDelete] = useState(null);
  const [Users, setUsers] = useState([]);

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = () => {
    UserService.getAllUser()
      .then((response) => {
        setUsers(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    getAllTransaction();
  }, []);

  const getAllTransaction = () => {
    TransactionService.getAllTransaction()
      .then((response) => {
        setTransactions(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  const handleDelete = (transactionId) => {
    setTransactionToDelete(transactionId);
    setdeleteConfirmationOpen(true);
  };

  const confirmDelete = () => {
    if (transactionToDelete) {
      TransactionService.deleteTransaction(transactionToDelete)
        .then(() => {
          setTransactions(
            transactions.filter(
              (transaction) => transaction.transactionId != transactionToDelete
            )
          );
          setdeleteConfirmationOpen(false);
          alert("Deleted Successfully !!!");
        })
        .catch((error) => {
          console.log(error);
          alert("Error Deleting... !!!");
        });
    }
  };

  const handleUpdateOpen = (transaction) => {
    setSelectedTransaction(transaction);
    setModalOpen(true);
  };

  const handleFind = () => {
    setFindModalOpen(true);
  };

  const handleFindClose = () => {
    setFindModalOpen(false);
    setFoundTransaction(null);
    setFindTransaction("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (selectedtransaction.transactionId) {
      // Update student
      TransactionService.updateTransaction(
        selectedtransaction.transactionId,
        selectedtransaction
      )
        .then(() => {
          alert("Updated Successfully");
          setModalOpen(false);
          getAllTransaction();
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      // Create Transaction
      TransactionService.createTransaction(selectedtransaction)
        .then(() => {
          alert("Created Successfully");
          setModalOpen(false);
          getAllTransaction();
          window.location.reload();
        })
        .catch((error) => {
          console.log(error);
        });
    }
  };

  const handleFindTransaction = (e) => {
    e.preventDefault();
    TransactionService.getTransactionById(findTransaction)
      .then((response) => {
        setFoundTransaction(response.data);
      })
      .catch((error) => {
        console.log(error);
        alert("Record not found");
      });
  };

  return (
    <div>
      <br></br>
      <center>
        <h1>Transaction management System</h1>
        <br />
        <button
          onClick={() => setModalOpen(true)}
          className="btn btn-primary ms-4 px-2"
        >
          Add Transaction
        </button>

        <button
          onClick={handleFind}
          className="btn btn-warning    px-2 mr-2 ms-4 "
        >
          Find Transaction
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
                  placeholder="Mode of transaction"
                  name="modeOfTransaction"
                  className="form-control mb-4"
                  value={selectedtransaction?.modeOfTransaction || ""}
                  onChange={(e) =>
                    setSelectedTransaction({
                      ...selectedtransaction,
                      modeOfTransaction: e.target.value,
                    })
                  }
                  required
                />
                <TextField
                  type="text"
                  placeholder="Location of Transaction"
                  name="transactionLocation"
                  className="form-control mb-4"
                  value={selectedtransaction?.transactionLocation || ""}
                  onChange={(e) =>
                    setSelectedTransaction({
                      ...selectedtransaction,
                      transactionLocation: e.target.value,
                    })
                  }
                  required
                />

                <select
                  className="form-control mb-4"
                  value={selectedtransaction.user.accountNumber || ""}
                  onChange={(e) =>
                    setSelectedTransaction({
                      ...selectedtransaction,
                      user: {
                        ...selectedtransaction.user,
                        accountNumber: e.target.value,
                      },
                    })
                  }
                >
                  <option value="">Select Account...</option>
                  {Users.map((user) => (
                    <option key={user.accountNumber} value={user.accountNumber}>
                      {user.accountNumber}
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
            <form onSubmit={handleFindTransaction}>
              <select
                className="form-control"
                value={findTransaction || ""}
                onChange={(e) => setFindTransaction(Number(e.target.value))}
              >
                <option value="">Select Transaction...</option>
                {transactions.map((option) => (
                  <option key={option} value={option.transactionId}>
                    {option.transactionId}
                  </option>
                ))}
              </select>
              <br />

              <center>
                <button className="btn btn-success" type="submit">
                  Find Transaction
                </button>
              </center>
            </form>
            <br></br>
            <center>
              <button className="btn btn-secondary" onClick={handleFindClose}>
                Close
              </button>
            </center>
            <br></br>
            {foundTransaction && (
              <div>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th>Transaction mode</th>
                      <th>Location</th>
                      <th>Account number</th>
                      <th>User</th>
                      <th>Mail id</th>
                      <th>Phone</th>
                      <th>Address</th>
                      <th>Branch</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>{foundTransaction.modeOfTransaction}</td>
                      <td>{foundTransaction.transactionLocation}</td>
                      <td>{foundTransaction.user.accountNumber}</td>
                      <td>{foundTransaction.user.userName}</td>
                      <td>{foundTransaction.user.eMail}</td>
                      <td>{foundTransaction.user.contact}</td>
                      <td>{foundTransaction.user.address}</td>
                      <td>{foundTransaction.user.branchName}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            )}
          </Box>
        </Fade>
      </Modal>
      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            <th>Transaction ID</th>
            <th>Mode Of Transaction</th>
            <th>Location</th>
            <th>Account Number</th>
            <th>Holder</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Branch</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {transactions.map((tran) => (
            <tr key={tran.transactionId}>
              <td>{tran.transactionId}</td>
              <td>{tran.modeOfTransaction}</td>
              <td>{tran.transactionLocation}</td>
              <td>{tran.user.accountNumber}</td>
              <td>{tran.user.userName}</td>
              <td>{tran.user.eMail}</td>
              <td>{tran.user.contact}</td>
              <td>{tran.user.address}</td>
              <td>{tran.user.branchName}</td>
              {/* Other table data */}
              <td>
                <button
                  onClick={() => handleUpdateOpen(tran)}
                  className="btn btn-primary"
                >
                  Update
                </button>
                <button
                  onClick={() => handleDelete(tran.transactionId)}
                  className="btn btn-danger"
                  style={{ marginLeft: "10px" }}
                >
                  Delete
                </button>{" "}
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
  );
};

export default Transaction;
