import axios from "axios";

const baseURL = "http://localhost:1234/sms/api/";

const StudentService = {
  // getAllStudent: () => axios.get(baseURL + "GetAllStudent"),
  getAllStudent: () => axios.get(`${baseURL}GetAllStudent`),

  getStudentById: (studentId) =>
    axios.get(`${baseURL}GetEmployeeById/${studentId}`),

  updateStudent: (studentId, student) =>
    axios.put(`${baseURL}UpdateStudent/${studentId}`, student),

  createStudent: (student) => axios.post(`${baseURL}CreateStudent`, student),

  deleteStudent: (studentId) =>
    axios.delete(`${baseURL}DeleteStudent/${studentId}`),
};

export default StudentService;
