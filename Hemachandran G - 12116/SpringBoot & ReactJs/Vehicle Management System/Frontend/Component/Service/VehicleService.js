import React, { Component } from 'react'
import axios from "axios";

const Get = "http://localhost:8001/GetVehicle";
const Post = "http://localhost:8001/CreateVehicle";
 const Put = "http://localhost:8001/UpdateVehicle/";
const Delete = "http://localhost:8001/DeleteVehicle/";

 class VehicleService extends Component {

     GetList(){ 
        const result = axios.get(Get);
        return result;
    }


    DoPost(vehi){
         axios.post(Post, vehi);
        
    }

    DoPut(vehicleId, vehic){
        axios.put(Put + vehicleId, vehic);  
        
    }

    DeleteVehicle(vehicleId){
        axios.delete(Delete + vehicleId)
    }




  render() {
    return (
      <div>
        
      </div>
    )
  }
}

export default new  VehicleService();