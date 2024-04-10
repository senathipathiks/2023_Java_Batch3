
import axios from 'axios';
import React, { Component } from 'react';

const Add="http://localhost:1234/CreateDepartment";
const Delete="http://localhost:1234/DeleteDepartment/";
const Update="http://localhost:1234/UpdateDepartment";
const Find="http://localhost:1234/GetDepartment/";
const FindAll="http://localhost:1234/GetAllDepartment";
const GetIds="http://localhost:1234/GetDepartmentIds";


class DepartmentService extends Component {

    addDepartment=(department)=>{
        return axios.post(Add,department);
    }

    deleteDepartment=(id)=> {
        return axios.delete(Delete+id);
    }

    updateDepartment=(department)=>{
        return axios.put(Update,department);
    }

    findDepartment=(id)=>{
        return axios.get(Find+id);
    }

    findallDepartment=(department)=>{
        return axios.get(FindAll,department);
    }

    getIds=(department)=>{
        return  axios.get(GetIds,department);
    }
}
export default new DepartmentService();