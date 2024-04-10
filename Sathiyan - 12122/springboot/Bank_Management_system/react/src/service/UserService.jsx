import axios from "axios";

const baseURL = "http://localhost:1234/bms/uc/api/";

const UserService = {
  getAllUser: () => axios.get(`${baseURL}GetAllUser`),

  getUserById: (accountNumber) =>
    axios.get(`${baseURL}GetUserById/${accountNumber}`),

  createUser: (user) => axios.post(`${baseURL}CreateUser`, user),

  deleteUser: (accountNumber) =>
    axios.delete(`${baseURL}DeleteUser/${accountNumber}`),
};

export default UserService;
