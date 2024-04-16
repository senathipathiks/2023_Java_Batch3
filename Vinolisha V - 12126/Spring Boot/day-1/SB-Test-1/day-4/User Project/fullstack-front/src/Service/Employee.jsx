
import axios from 'axios';
import React, { Component } from 'react'

const Add="http://localhost:2244/user";
const Allusers="http://localhost:2244/getUsers";
const Dele="http://localhost:2244/DeleteUser/";
const Update="http://localhost:2244/updateUser/";
const Load ="http://localhost:2244/users/";
const Auto="http://localhost:2244/Autopop";
class Employee extends Component {
   
addnew=(user)=>{
   return axios.post(Add,user);
}

findall=()=>{
    return axios.get(Allusers);
}

dele=(id)=>{
    return axios.delete(Dele+id);

}
load=(id) =>{
    return axios.get(Load + id); 
}

Upda=(user)=>{
    return axios.update(Update,user);
}

fetch=(id)=>{
    return axios.get(Load+id);
}

auto=()=>{
    return axios.get(Auto);
}

}

export default new Employee();
