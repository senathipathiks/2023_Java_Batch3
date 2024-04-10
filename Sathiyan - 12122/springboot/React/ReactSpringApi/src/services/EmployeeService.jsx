import axios from "axios";

const EMPLOYEE_BASE_REST_API_URL = "http://localhost:2345/api/v1/employees";

class EmployeeService {
  getAllEmployees() {
    return axios.get(EMPLOYEE_BASE_REST_API_URL);
  }

  getEmployeeId(idList) {
    return axios.get(EMPLOYEE_BASE_REST_API_URL + "/" + idList);
  }

  createEmployee(employee) {
    return axios.post(EMPLOYEE_BASE_REST_API_URL, employee);
  }

  getEmployeeById(employeeId) {
    return axios.get(EMPLOYEE_BASE_REST_API_URL + "/" + employeeId);
  }

  getEmployeeByName(nameList) {
    return axios.get(EMPLOYEE_BASE_REST_API_URL + "/" + nameList);
  }

  updateEmployee(employeeId, employee) {
    return axios.put(EMPLOYEE_BASE_REST_API_URL + "/" + employeeId, employee);
  }

  deleteEmployee(employeeId) {
    return axios.delete(EMPLOYEE_BASE_REST_API_URL + "/" + employeeId);
  }
}

export default new EmployeeService();
