import React, { Component } from 'react'
import axios from "axios"

const addUser="http://localhost:2233/Userins";
const addLib="http://localhost:2233/Libraryins";
const findallUser="http://localhost:2233/Userfindall";
const findallLib="http://localhost:2233/Libraryfindall";
const Autolid="http://localhost:2233/Autopoplid";
const delUser="http://localhost:2233/Userdel/";
const findUser="http://localhost:2233/Userfind/";
const updateUser="http://localhost:2233/Userupd"
const dellib="http://localhost:2233/Librarydel/";
const finlib="http://localhost:2233/Libraryfind/";
const updlib="http://localhost:2233/Libraryupd"

 class Allservices extends Component {

    Adduser(user){
        return axios.post(addUser,user);
    }
    Addlib(libr){
        return axios.post(addLib,libr);
    }
    Findalluser(){
        return axios.get(findallUser);
    }
    Findalllib(){
        return axios.get(findallLib);
    }
    FindallId(){
        return axios.get(Autolid);
    }
    Deleteuser(uid){
        return axios.delete(delUser+uid);
    }
    finduser(uid){
        return axios.get(findUser+uid);
    }
    Updateuser(user){
        return axios.put(updateUser,user);
    }
    Deletelib(lid){
        return axios.delete(dellib+lid);
    }
    findLib(lid){
        return axios.get(finlib+lid);
    }
    Updatelib(libr){
        return axios.put(updlib,libr);
    }

  
      
}

export default new  Allservices(); 
