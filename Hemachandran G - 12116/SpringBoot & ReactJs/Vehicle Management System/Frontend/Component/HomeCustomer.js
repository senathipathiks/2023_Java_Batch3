import React, { useState } from 'react';
import axios from "axios";
import { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import VehicleService from './Service/VehicleService';
import CustomerService from './Service/CustomerService';
// import "./Home.css";
function HomeCustomer() {

  const { customerId } = useParams();

  const [count, setCount] = useState(0);
  const [cus, setCus] = useState([]);


  useEffect(() => {

    loadUsers();

  }, []);


  // const loadUsers = async () => {
  //   const result = await axios.get("http://localhost:8001/GetAll");
  //   console.log(result.data)
  //   setVehic(result.data)
  // }


  const loadUsers = (e) => {
    CustomerService.LoadCustomer().then((result) => {
      // console.log("HEm")
      // console.log(result.data)
      setCus(result.data)
    }).catch((err) => { console.error(err) })
  }


  // const deleteUser = async (vehicleId) => {
  //   await axios.delete(`http://localhost:8001/Delete/${vehicleId}`)
  //   loadUsers()
  // }

  const deleteUser = async (customerId) => {
    CustomerService.DeleteCustomer(customerId);


    loadUsers()
    alert('Deleted Successfully')
  }


  return (
    <div>
      <div id="page" className='py-4'>
        <div id="table">
          <table className="table table-light border-radius: 10px">
            <thead>
              <tr>
                <th scope="col">Customer ID</th>
                <th scope="col">Customer Name</th>
                <th scope="col">Customer Phone Number</th>
                <th scope="col">Customer Address</th>
                <th scope="col">Edit</th>
                <th scope="col">Remove</th>

              </tr>
            </thead>
            <tbody>

              {
                cus.map((customer, index) => (
                  <tr>

                    <td>{customer.customerId}</td>
                    <td>{customer.customerName}</td>
                    <td>{customer.customerPhnNo}</td>
                    <td>{customer.customerAddress}</td>


                    <td><Link type="submit" to={`/EditUserCustomer/${customer.customerId}`} className='btn btn-outline-primary'>Edit</Link></td>
                    <td><button type="submit" onClick={() => deleteUser(customer.customerId)} className='btn btn-outline-danger'>Remove</button></td>

                  </tr>
                ))

              }



            </tbody>
          </table>

        </div>
      </div>
    </div>
  )
}



export default HomeCustomer