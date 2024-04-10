import axios from "axios";
import React, { Component } from "react";

const insert = "http://localhost:2024/api/insertUser";
const getAll = "http://localhost:2024/api/findallUser";
const update = "http://localhost:2024/api/updateUser";
const findId = "http://localhost:2024/api/findUserId/";
const findName = "http://localhost:2024/api/findUserName/";
const delId = "http://localhost:2024/api/deleteUserId/";
const delName = "http://localhost:2024/api/deleteuserName/";

class User extends Component {
  doInsert(data) {
    return axios.post(insert, data);
  }

  doUpdate(data) {
    return axios.put(update, data);
  }

  dofindId(data) {
    return axios.get(findId + data);
  }

  dofindName(data) {
    return axios.get(findName + data);
  }

  deleteId(data) {
    return axios.delete(delId + data);
  }

  deleteName(data) {
    return axios.delete(delName + data);
  }
  getAll() {
    return axios.get(getAll);
  }
}

export default new User();
