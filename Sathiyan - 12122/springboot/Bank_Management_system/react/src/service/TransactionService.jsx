import axios from "axios";

const baseURL = "http://localhost:1234/bms/tc/api/";

const TransactionService = {
  getAllTransaction: () => axios.get(`${baseURL}GetAllTransaction`),

  getTransactionById: (transactionId) =>
    axios.get(`${baseURL}GetTransactionById/${transactionId}`),

  createTransaction: (Transaction) =>
    axios.post(`${baseURL}CreateTransaction`, Transaction),

  deleteTransaction: (transactionId) =>
    axios.delete(`${baseURL}DeleteTransaction/${transactionId}`),

  updateTransaction: (transactionId, transaction) =>
    axios.put(`${baseURL}UpdateTransaction/${transactionId}`, transaction),
};

export default TransactionService;
