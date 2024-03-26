import axios from "axios";

const baseURL = "http://localhost:1234/";

const CustomerService = {
  
  getAllCustomer: () => axios.get(`${baseURL}GetAllCustomer`),

  getCustomerById: (customerId) =>
    axios.get(`${baseURL}GetCustomerById/${customerId}`),

  updateCustomer: (customerId, customer) =>
    axios.put(`${baseURL}UpdateCustomer/${customerId}`, customer),

  createCustomer: (customer) => axios.post(`${baseURL}CreateCustomer`, customer),

  deleteCustomer: (customerId) =>
    axios.delete(`${baseURL}DeleteCustomer/${customerId}`),
};

export default CustomerService;
