import React, { Component } from "react";

import axios from "axios";
const GETALL = "http://localhost:8080/getAllCourseList";
const SAVE = "http://localhost:8080/doCourseInsert";
const FetchId = "http://localhost:8080/GetCourseId/";
const UPDATE= "http://localhost:8080/doCourseUpdate";
const GetIdList = "http://localhost:8080/getCourseIdList";

const DeleteCourse = "http://localhost:8080/doCourseDelete/";
const FetchByName = "http://localhost:8080/findByStudName/{courseName}";

class CourseService extends Component {
    getCourseDetail() {
        return axios.get(GETALL);
      }
      saveCourse(brand) {
        return axios.post(SAVE, brand);
      }

      fetchCourseById(id) {
        console.log(id)
        return axios.get(FetchId + id);
      }
      UpdateCourse(brand) {
        console.log(brand)
        return axios.put(UPDATE,brand);
      }
      DeleteById(id) {
        console.log(id);
        return axios.delete(DeleteCourse + id);
      }
      FetchByName(name) {
        return axios.get(FetchByName + name);
      }                              
     
      getAllIdList() {
        return axios.get(GetIdList);
      }
}
export default new CourseService()
