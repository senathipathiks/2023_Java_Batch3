import axios from 'axios';
import { Component } from 'react';

const origin = "http://localhost:1260/";
const createCustomer = "createcustomer";
const readAllCustomer = "readallcustomer";
const updateCustomer = "updatecustomer";
const deleteCustomer = "deletecustomer?id=";
const readCustomer = "readcustomer?id=";

class CustomerService extends Component {

    doCreate = (data) => {
        return axios.post(origin + createCustomer, data);
    };

    doReadAll = () => {
        return axios.get(origin + readAllCustomer);
    };

    doRead = (id) => {
        return axios.get(origin + readCustomer + id);
    };

    doUpdate = (data) => {
        return axios.put(origin + updateCustomer, data);
    };

    doDelete = (id) => {
        return axios.delete(origin + deleteCustomer + id)
    };
}
const customerService = new CustomerService();
export default customerService;
