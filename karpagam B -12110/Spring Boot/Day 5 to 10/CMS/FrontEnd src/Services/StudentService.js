import React, { Component } from "react";
import axios from "axios";
const GET = "http://localhost:8080/getAllStudentList";
const SAVE = "http://localhost:8080/doInsert";
const FetchId = "http://localhost:8080/GetStudentId/";
const UpdateStudent= "http://localhost:8080/doUpdate";
const GetIdList = "http://localhost:8080/getAllIdList";

const DeleteStudent = "http://localhost:8080/dostudDelete/";
const fetchByName = "http://localhost:8080/findByStudName/{studentName}";

class Studentservice extends Component {
    getStudents() {
        return axios.get(GET);
      }
      saveStudent(student) {
        return axios.post(SAVE, student);
      }
      fetchStudentById(studentId) {
        return axios.get(FetchId + studentId);
      }
      UpdateStudents(student) {
        console.log(student)
        return axios.put(UpdateStudent,student);
      }
      DeleteStudents(studentId) {
        return axios.delete(DeleteStudent + studentId);
      }
      fetchByName(studentName) {
        return axios.get(fetchByName + studentName);
      }                              
     
      getAllIdList() {
        return axios.get(GetIdList);
      }
}
export default new Studentservice()
