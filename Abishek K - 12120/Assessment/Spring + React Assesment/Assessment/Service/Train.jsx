import axios from "axios";
import React, { Component } from "react";

const insert = "http://localhost:2024/api/insertTrain";
const getAll = "http://localhost:2024/api/findallTrain";
const update = "http://localhost:2024/api/updateTrain";
const findId = "http://localhost:2024/api/findTrainId/";
const findName = "http://localhost:2024/api/findTrainName/";
const delId = "http://localhost:2024/api/deleteTrainId/";
const delName = "http://localhost:2024/api/deleteTrainName/";

class Train extends Component {
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

export default new Train();
