import axios from 'axios';
import { Component } from 'react';
const origin = "http://localhost:1330";
const saveTransaction = "/saveTransaction"
const getTransactions = "/getTransactions"
class TransactionService extends Component {
  
    doSave = (data) => {
        return axios.post(origin+saveTransaction,data);
    }

    doGetAll = () =>{
        return axios.get(origin+getTransactions);
    }
}
const transactionService = new TransactionService();
export default transactionService;
