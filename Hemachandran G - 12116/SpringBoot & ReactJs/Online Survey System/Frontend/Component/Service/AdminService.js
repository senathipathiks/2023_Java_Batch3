import React, { Component } from 'react'
import axios from "axios";

const Get = "http://localhost:8001/GetAdmin";
const Post = "http://localhost:8001/CreateAdmin";
const Put = "http://localhost:8001/UpdateAdmin/";
const Delete = "http://localhost:8001/DeleteAdmin/";

class AdminService extends Component {

    LoadAdmin() {
        const result = axios.get(Get);
        return result;
    }


    CreateAdmin(adm) {
        axios.post(Post, adm);

    }

    UpdateAdmin(adminId, adm) {
        axios.put(Put + adminId, adm);

    }

    DeleteAdmin(adminId) {
        axios.delete(Delete + adminId)
    }




    render() {
        return (
            <div>

            </div>
        )
    }
}

export default new AdminService();