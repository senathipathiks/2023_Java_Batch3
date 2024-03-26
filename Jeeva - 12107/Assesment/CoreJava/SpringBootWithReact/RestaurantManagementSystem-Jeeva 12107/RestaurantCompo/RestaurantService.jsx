
import { Component } from "react";
import axios from "axios";

 const createRes="http://localhost:1234/insetRestaurant";

 const getAllRes="http://localhost:1234/getAllRestaurants";

const updateRes="http://localhost:1234/updateResDetails";

 const deleteRes="http://localhost:1234/deleteResId";

 const findRestaurant="http://localhost:1234/findResById";

class RestaurantService extends Component {


    createRestaurant=(create)=>{
        return axios.post(createRes,create);
    }

    getAllRestaurant=()=>{
        return axios.get(getAllRes);
    }

    deleteRestaurant=(rid)=>{
            return axios.delete(deleteRes+'/'+rid);
    }

    findResDetails =(rid)=>{
        return axios.get(findRestaurant+'/'+rid);
    }

    updateRestaurant =(updaterid)=>{
        return axios.put(updateRes,updaterid);
    }

}
// eslint-disable-next-line import/no-anonymous-default-export
export default new RestaurantService();