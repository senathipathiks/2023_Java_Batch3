import axios from "axios";
import React from "react";

const fetchAll = "http://localhost:9876/api/department/";
const IdList = "http://localhost:9876/api/department/idList";
const save = "http://localhost:9876/api/department/";

export const fetchDepartment = () => {
  return axios.get(fetchAll);
};

export const fetchIdList = () => {
  return axios.get(IdList);
};

export const saveDept = (dept) => {
  return axios.post(save, dept);
};

const DepartmentService = () => {
  return <div></div>;
};

export default DepartmentService;
