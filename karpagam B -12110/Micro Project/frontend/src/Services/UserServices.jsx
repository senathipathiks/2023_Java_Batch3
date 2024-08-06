import React, { Component } from "react";
import axios from "axios";
const GET = "http://localhost:8080/getAllUserList";
const SAVE = "http://localhost:8080/doUserInsert";
const FetchId = "http://localhost:8080/GetId/";
const GetIdList = "http://localhost:8080/getUserIdList";


class UserService extends Component {
    getUsers() {
        return axios.get(GET);
      }
      saveUsers(app) {
        return axios.post(SAVE, app);
      }
      fetchUserById(userId) {
        return axios.get(FetchId + userId);
      }
                                
     
      getUserIdList() {
        return axios.get(GetIdList);
      }
}
export default new UserService()
