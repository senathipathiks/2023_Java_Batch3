import axios from 'axios';
import { Component } from 'react';

const GetAll = "http://localhost:9090/employees";
const GET = "http://localhost:9090/getEmployee/";
const INSERT = "http://localhost:9090/insertEmployee";
const UPDATE = "http://localhost:9090/updateEmployee/";
const DELETE = "http://localhost:9090/deleteEmployee/";

class EmployeeService extends Component{
    getAllEmployee(){
        return axios.get(GetAll);
    }
    getEmployeeById(id){
        return axios.get(GET + id);
    }
    insertEmployee(employee) {
        return axios.post(INSERT, employee);
    }
    updateEmployee(employee){
        return axios.put(UPDATE+ employee.id , employee );
    }
    deleteEmployee(id){
        return axios.delete(DELETE  + id);
    }
}

export default new EmployeeService();