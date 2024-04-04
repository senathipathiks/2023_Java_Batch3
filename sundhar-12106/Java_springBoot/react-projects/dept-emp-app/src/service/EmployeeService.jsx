import axios from "axios";
import React from "react";

const fetch = "http://localhost:9876/api/employee/";
const fetchId = "http://localhost:9876/api/department/fetchById?id=";
const add = "http://localhost:9876/api/employee/";
const Delete = "http://localhost:9876/api/employee/";

export const deleteById = (id) => {
  return axios.delete(Delete + id);
};

export const fetchAll = () => {
  return axios.get(fetch);
};

export const save = (employee) => {
  return axios.put(add, employee);
};

export const fetchById = (id) => {
  return axios.get(fetchId + id);
};

const EmployeeService = () => {
  return <div></div>;
};

export default EmployeeService;
