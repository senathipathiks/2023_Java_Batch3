import React, { Component } from 'react'
import axios from "axios";

const Get = "http://localhost:8001/GetAllCustomer";
const Post = "http://localhost:8001/CreateCustomer";
 const Put = "http://localhost:8001/UpdateCustomer/";
const Delete = "http://localhost:8001/DeleteCustomer/";

 class CustomerService extends Component {

     LoadCustomer(){ 
        const result = axios.get(Get);
        return result;
    }


    CreateCustomer(cus){
         axios.post(Post, cus);
        
    }

    UpdateCustomer(customerId, cus){
        axios.put(Put + customerId, cus);  
        
    }

    DeleteCustomer(customerId){
        axios.delete(Delete + customerId)
    }




  render() {
    return (
      <div>
        
      </div>
    )
  }
}

export default new  CustomerService();