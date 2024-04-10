
import axios from 'axios';
import React, { Component } from 'react';

const Add="http://localhost:8001/CreateStu";
const Delete="http://localhost:8001/DeleteStudent/";
const Update="http://localhost:8001/UpdateStudent";
const Find="http://localhost:8001/GetStudent/";
const FindAll="http://localhost:8001/GetAllStudent";
const GetId="http://localhost:8001/GetStudentIds";



class StudentService extends Component {

    addStudents=(student)=>{
        console.log(student)
        return axios.post(Add,student);
    }

    deleteStudent=(id)=> {
        return axios.delete(Delete+id);
    }

    updateStudent=(student)=>{
        return axios.put(Update,student);
    }

    findStudent=(id)=>{
        return axios.get(Find+id);
    }

    findallStudent=()=>{
        return axios.get(FindAll);
    }
    
    getAllId=(student)=>{
        return  axios.get(GetId,student);
    }
}
export default new StudentService();