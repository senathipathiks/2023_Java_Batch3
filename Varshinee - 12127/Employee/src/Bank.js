import React, { useState, useEffect } from "react";
import axios from "axios";
import BankUpdate from "./BankUpdate";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min";

const Bank = () => {
  const [transaction, setTransaction] = useState([]);
  const [newTransaction, setNewTransaction] = useState({
    Transname: "",
    TransDescription: "",
    Transmode: "",
  });
  const [updatedTransaction, setUpdatedTransaction] = useState(null);

  useEffect(() => {
    fetchTransaction();
  }, []);

  const fetchTransaction = () => {
    axios
      .get("http://localhost:3005/users")
      .then((response) => setTransaction(response.data))
      .catch((error) => console.error("Error fetching data:", error));
  };

  const addTransaction = () => {
    axios
      .post("http://localhost:3005/users", newTransaction)
      .then(() => {
        fetchTransaction();
        setNewTransaction({ Transnamename: "", TransDescription: "", Transmode: "" });
      })
      .catch((error) => console.error("Error adding transaction:", error));
  };

  const updateTransaction = (id, updatedData) => {
    axios
      .put(`http://localhost:3005/users/${id}`, updatedData)
      .then(() => fetchTransaction())
      .catch((error) => console.error("Error updating transaction:", error));
  };

  const deleteTransaction = (id) => {
    axios
      .delete(`http://localhost:3005/users/${id}`)
      .then(() => fetchTransaction())
      .catch((error) => console.error("Error deleting transaction:", error));
  };

  const handleUpdateClick = (transaction) => {
    setUpdatedTransaction(transaction);
  };

  const handleUpdateSubmit = (updatedTransaction) => {
    updateTransaction(updatedTransaction.id, updatedTransaction);
    setUpdatedTransaction(null);
  };

  return (
    <div className="container mt-4">
      <div className="container d-flex flex-column justify-content-center ">
        <h4>TRANSACTION MANAGEMENT SYSTEM</h4>

       

        <div className="mb-3 justify-content-center ">
          <label className="col g-8 "><b>Transaction_Name:</b></label>
          <input
          className="form-control "
            type="text"
            value={newTransaction.Transname}
            onChange={(e) =>
              setNewTransaction({ ...newTransaction, Transname: e.target.value })
            }
          />
        </div>

        <div className="mb-3">
          <label><b>Transaction_Description:</b></label>
          <input
          className="form-control "
            type="text"
            value={newTransaction.TransDescription}
            onChange={(e) =>
              setNewTransaction({ ...newTransaction, TransDescription: e.target.value })
            }
          />
        </div>
        {/* <div className="mb-3">
          <label>Address:</label>
          <input
          className="form-control "
            type="text"
            value={newEmployee.address}
            onChange={(e) =>
              setNewEmployee({ ...newEmployee, address: e.target.value })
            }
          />
        </div> */}

        <div className="mb-3 ">
          <label><b>Transaction_Mode:</b></label>
          <input
          className="form-control "
            type="text"
            value={newTransaction.Transmode}
            onChange={(e) =>
              setNewTransaction({ ...newTransaction, Transmode: e.target.value })
            }
          />
        </div>

        <button className="btn btn-primary mr-2" onClick={addTransaction}>
          Add Transaction
        </button>
      </div>

      <table className="table mt-4">
        <thead>
          <tr>
            <th>Trans Id</th>
            <th>Trans Name</th>
            <th>Trans Description</th>
            <th>Trans Mode</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {transaction.map((transaction) => (
            <tr key={transaction.id}>
              <td>{transaction.id}</td>
              <td>{transaction.Transname}</td>
              <td>{transaction.TransDescription}</td>
              <td>{transaction.Transmode}</td>

              <td>
                <button
                  className="btn btn-warning   "
                  onClick={() => handleUpdateClick(transaction)}
                >
                  Update
                </button>
                <button
                  className="btn btn-danger ms-3"
                  onClick={() => deleteTransaction(transaction.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      {updatedTransaction && (
        <BankUpdate transaction={updatedTransaction} onUpdate={handleUpdateSubmit} />
      )}
    </div>
  );
};

export default Bank