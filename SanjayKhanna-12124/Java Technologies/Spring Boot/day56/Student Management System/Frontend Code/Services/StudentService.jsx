import axios from 'axios';
import { Component } from 'react';

const readAllStudent = "http://localhost:1260/readAllStudent";
const createStudent = "http://localhost:1260/createStudent";
const  updateStudent = "http://localhost:1260/updateStudent" ;
const readStudent =  "http://localhost:1260/readStudent?stuId=";
const deleteStudent = "http://localhost:1260/deleteStudent?stuId=";

class StudentService extends Component {

    doReadAll = () => {
        return axios.get(readAllStudent);
    }

    doCreate = (data) => {
        return axios.post(createStudent, data)
    }

    doUpdate = (data) => {
        return axios.put(updateStudent, data)
    }

    doRead = (id) => {
        return axios.get(readStudent + id);
    }

    doDelete = (id) => {
        return axios.delete(deleteStudent+id);
    }

}

const studentService =  new StudentService();

export default studentService;
