import axios from 'axios';
import { Component } from 'react';


const origin = "http://localhost:1260/"
const readAllDepartment = "readAllDepartment";
const createDepartment = "createDepartment";
const updateDepartment = "updateDepartment";
const deleteDepartment = "deleteDepartment?deptId=";
const readDepartment = "readDepartment?deptId=";

class DepartmentServices extends Component {

    doReadAllDepartment = () => {
        return axios.get(origin + readAllDepartment);
    }

    doCreate = (data) => {
        return axios.post(origin + createDepartment, data)
    }

    doUpdate = (data) => {
        return axios.put(origin + updateDepartment, data)
    }

    doRead = (id) => {
        return axios.get(origin + readDepartment + id);
    }

    doDelete = (id) => {
        return axios.delete(origin + deleteDepartment + id);
    }

}
const departmentService = new DepartmentServices();
export default departmentService;