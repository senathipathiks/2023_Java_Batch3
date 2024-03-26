import { Component } from "react";
import axios from "axios";

 const insertCustomer="http://localhost:1234/insertCustomer";

 const getResIdList="http://localhost:1234/getAllResId";

const AllDetails="http://localhost:1234/getAllCustomers";

 const deleteCustomer="http://localhost:1234/deleteCusById";

 
 const findCusbyId="http://localhost:1234/findCusById";

 const customerUpdate="http://localhost:1234/updateCustomerDetails";

class CustomerService extends Component{

    CustomerInsert=(deatils)=>{
        return axios.post(insertCustomer,deatils);
      };
    
    getAllRestaurantId =()=>{
       return axios.get(getResIdList); 
    }

    findALLCusDetails (){
      return axios.get(AllDetails);
    }

    deleteCustomer (cid){
      return axios.delete(deleteCustomer+'/'+cid);
    }

    

    findCustomer= (cid)=>{
      return axios.get(findCusbyId+'/'+cid);
    }

    updateCusDetails = (updateemp)=>{

      return axios.put(customerUpdate,updateemp)
    }



}
// eslint-disable-next-line import/no-anonymous-default-export
export default new CustomerService();