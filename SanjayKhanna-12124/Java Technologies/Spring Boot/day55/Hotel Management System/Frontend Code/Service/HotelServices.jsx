import axios from 'axios';
import { Component } from 'react';


const getHotelList = "http://localhost:1240/hotel/getAllHotel";
const addHotel = "http://localhost:1240/hotel/addHotel";
const getHotel = "http://localhost:1240/hotel/getHotel?id="
const  updateHotel = "http://localhost:1240/hotel/updateHotel"
const DeleteHotel = "http://localhost:1240/hotel/deleteHotel?id="

class HotelServices extends Component {

    doAdd = (empData) => {
        return axios.post(addHotel, empData)
    }

    doGetAll = () => {
        return axios.get(getHotelList)
    }

    doGet = (id) => {
        return axios.get(getHotel+id)
    }

    doUpdate=(empData) =>{
        return axios.put(updateHotel,empData)
    }

    doDelete =(id)=>{
        return axios.delete(DeleteHotel + id)
    }

}
const hotelServices = new HotelServices();
export default hotelServices;
