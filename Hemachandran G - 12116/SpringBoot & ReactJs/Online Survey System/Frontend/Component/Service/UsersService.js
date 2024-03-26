import React, { Component } from 'react'
import axios from "axios";

const Get = "http://localhost:8001/GetAllUsers";
const Post = "http://localhost:8001/CreateUsers";
const Put = "http://localhost:8001/UpdateUsers/";
const Delete = "http://localhost:8001/DeleteUsers/";

class UsersService extends Component {

    GetList() {
        const result = axios.get(Get);
        return result;
    }


    DoPost(user) {
        axios.post(Post, user);

    }

    DoPut(usersId, user) {
        axios.put(Put + usersId, user);

    }

    DeleteUser(usersId) {
        axios.delete(Delete + usersId)
    }


    render() {
        return (
            <div>

            </div>
        )
    }
}

export default new UsersService();