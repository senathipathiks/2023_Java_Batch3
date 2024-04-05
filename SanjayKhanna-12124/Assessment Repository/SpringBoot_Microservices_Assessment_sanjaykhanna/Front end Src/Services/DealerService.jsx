import axios from 'axios';
import { Component } from 'react';

const origin = "http://localhost:1260/";
const createDealer = "createdealer";
const readAllDealer = "readalldealer";
const updateDealer = "updatedealer";
const deleteDealer = "deletedealer?id=";
const readDealer = "readdealer?id=";
class DealerService extends Component {

    doCreate = (data) => {
        return axios.post(origin + createDealer, data);
    };

    doReadAll = () => {
        return axios.get(origin + readAllDealer);
    };

    doRead = (id) => {
        return axios.get(origin + readDealer + id);
    };

    doUpdate = (data) => {
        return axios.put(origin + updateDealer, data);
    };

    doDelete = (id) => {
        return axios.delete(origin + deleteDealer + id)
    };

}
const  dealerService = new DealerService();
export  default dealerService;