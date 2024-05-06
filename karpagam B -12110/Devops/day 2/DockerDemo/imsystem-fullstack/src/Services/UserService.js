import React, { Component } from "react";

import axios from "axios";
const GETALL = "http://localhost:8080/getAllUserList";
const UserSave = "http://localhost:8080/doUserInsert";
const FetchId = "http://localhost:8080/GetUserId/";
const GetIdList = "http://localhost:8080/getUserIdList";


class UserService extends Component {
    getUserDetail() {
        return axios.get(GETALL);
      }
      AddUser(user) {
        return axios.post(UserSave, user);
      }

      fetchUserById(userId) {
        console.log(userId)
        return axios.get(FetchId + userId);
      }
                            
     
      getAllUserIdList() {
        return axios.get(GetIdList);
      }
}
export default new UserService()
