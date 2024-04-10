import axios from "axios";

const baseURL = "http://localhost:1234/sms/db/api/";

const DepartmentService = {
  getAllDepartment: () => axios.get(`${baseURL}GetAllDepartment`),

  getDepartmentById: (departmentId) =>
    axios.get(`${baseURL}GetDepartmentById/${departmentId}`),

  createDepartment: (department) =>
    axios.post(`${baseURL}CreateDepartment`, department),

  deleteDepartment: (departmentId) =>
    axios.delete(`${baseURL}DeleteDepartment/${departmentId}`),
};

export default DepartmentService;
