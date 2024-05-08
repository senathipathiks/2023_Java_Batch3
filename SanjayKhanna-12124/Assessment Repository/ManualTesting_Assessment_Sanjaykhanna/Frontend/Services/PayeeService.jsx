import axios from 'axios';
import { Component } from 'react';
const origin = "http://localhost:1330";
const addPayee = "/addPayee"
const deletePayee = "/deletePayee?payeeId="
const updatePayee = "/updatePayee"
const getPayees = "/getPayees"
const getPayee = "/getPayee?payeeId="

class PayeeService extends Component {
 
    doAdd = (data) =>{
        return axios.post(origin+addPayee,data);
    }

    doDelete = (payeeId) =>{
        return axios.delete(origin+deletePayee+payeeId);
    }

    doUpdate = (data) => {
        return axios.put(origin+updatePayee,data);
    }

    doGetPayee = (payeeId) =>{
        return axios.get(origin+getPayee+payeeId);
    }

    doGetAll = () => {
        return axios.get(origin+getPayees);
    }
}

const payeeService = new PayeeService();
export default payeeService;
