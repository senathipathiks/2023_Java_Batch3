
import axios from 'axios';
const origin = "http://localhost:1330";
const addPayee = "/addPayee"
const deletePayee = "/deletePayee?payeeId="
const updatePayee = "/updatePayee"
const getPayees = "/getPayees"
const getPayee = "/getPayee?payeeId="
const saveTransaction = "/saveTransaction"
const getTransactions = "/getTransactions"

const doAdd = (data) => {
    return axios.post(origin + addPayee, data);
}

const doDelete = (payeeId) => {
    return axios.delete(origin + deletePayee + payeeId);
}

const doUpdate = (data) => {
    return axios.put(origin + updatePayee, data);
}

const doGetPayee = (payeeId) => {
    return axios.get(origin + getPayee + payeeId);
}

const doGetAllPayee = () => {
    return axios.get(origin + getPayees);
}

const doSave = (data) => {
    return axios.post(origin + saveTransaction, data);
}

const doGetAllTransaction = () => {
    return axios.get(origin + getTransactions);
}

// exports.doAdd = doAdd;
// exports.doDelete = doDelete;
// exports.doGetAllPayee = doGetAllPayee;
// exports.doGetAllTransaction = doGetAllTransaction;
// exports.doGetPayee = doGetPayee;
// exports.doSave = doSave;
// exports.doUpdate = doUpdate;


export { doAdd, doDelete, doGetAllPayee, doGetAllTransaction, doGetPayee, doSave, doUpdate };

