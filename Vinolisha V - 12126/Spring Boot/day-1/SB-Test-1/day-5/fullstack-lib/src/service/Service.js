import React from "react";
import axios from "axios";
import { Component } from "react";

const addStud = "http://localhost:3345/sms/api/insertstud";
const getStud1 = "http://localhost:3345/sms/api/getStudent";
const autoIdAdmin = "http://localhost:3345/ams/db/AutopopIdList";
const UpdateStud = "http://localhost:3345/sms/api/updateStud";
const getStudbyId = "http://localhost:3345/sms/api/student/";
const deleteStudId = "http://localhost:3345/sms/api/deleteStud/";

const getadmins = "http://localhost:3345/ams/db/getAllAdmin";
const addAdmin = "http://localhost:3345/ams/db/insertAdmin";
const updateAdmin = "http://localhost:3345/ams/db/updateAdmin";
const getAdminId = "http://localhost:3345/ams/db/AutopopIdList";
const getbyId = "http://localhost:3345/ams/db/getAdminById/";
const deleteAdminId = "http://localhost:3345/ams/db/deleteAdmin/";

class Service extends Component {
  AddStud = (emp) => {
    return axios.post(addStud, emp);
  };

  GetAllStud = () => {
    return axios.get(getStud1);
  };

  FindAllId = () => {
    return axios.get(autoIdAdmin);
  };

  GetAllAdmins = () => {
    return axios.get(getadmins);
  };
  AddAdmin = (Record) => {
    return axios.post(addAdmin, Record);
  };
  UpdateAdmin = (Record) => {
    console.log(Record);
    return axios.put(updateAdmin, Record);
  };
  UpdateStudById = (Record) => {
    console.log(Record);
    return axios.put(UpdateStud, Record);
  };

  FindDeptById = () => {
    return axios.get(getAdminId);
  };

  fetchbyId = (id) => {
    console.log(id);
    return axios.get(getbyId + id);
  };

  FetchStudbyId = (id) => {
    console.log(id);
    return axios.get(getStudbyId + id);
  };

  DeleteStudent = (id) => {
    return axios.delete(deleteStudId + id);
  };

  DeleteAdmin = (id) => {
    return axios.delete(deleteAdminId + id);
  };
}

export default new Service();
