import React, { useState } from 'react';
import axios from "axios";
import { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import VehicleService from './Service/VehicleService';
// import "./Home.css";
function Home() {

  const { vehicleId } = useParams();

  const [count, setCount] = useState(0);
  const [vehic, setVehic] = useState([]);
  const [con, setCon] = useState([]);

  useEffect(() => {

    loadUsers();

  }, []);

  // const loadUsers = async () => {
  //   const result = await axios.get("http://localhost:8001/GetAll");
  //   console.log(result.data)
  //   setVehic(result.data)
  // }


  const loadUsers = (e) => {
    VehicleService.GetList().then((result) => {
      // console.log("HEm")
      // console.log(result.data)
      setVehic(result.data)
    }).catch((err) => { console.error(err) })
  }

  


  // const deleteUser = async (vehicleId) => {
  //   await axios.delete(`http://localhost:8001/Delete/${vehicleId}`)
  //   loadUsers()
  // }

  const deleteUser = async (vehicleId) => {
    VehicleService.DeleteVehicle(vehicleId);
    alert('Deleted Successfully')
    loadUsers()
  }


  return (
    <div>
      <div id="page" className='py'>
        <div id="table">
          <table className="table text-center  table-striped table-hover w-75   ">
            <thead>
              <tr>
                <th scope="col">Vehicle ID</th>
                <th scope="col">Vehicle Name</th>
                <th scope="col">Vehicle Type</th>
                <th scope="col">Vehicle Brand</th>
                <th scope="col">Fuel Entity</th>
                <th scope="col">Vehicle Weight</th>
                <th  scope="col">Customer Id</th>
                <th   scope="col">Customer Name</th>
                <th scope="col">Edit</th>
                <th scope="col">Remove</th>

              </tr>
            </thead>
            <tbody>

              {
                vehic.map((vehi, index) => (
                  <tr>

                    <td>{vehi.vehicleId}</td>
                    <td>{vehi.vehicleName}</td>
                    <td>{vehi.vehicleType}</td>
                    <td>{vehi.vehicleBrand}</td>
                    <td>{vehi.fuelEntity}</td>
                    <td>{vehi.weight}</td>
                    <td>{vehi.customer ? vehi.customer.customerId : "Null"}</td>
                    <td>{vehi.customer ? vehi.customer.customerName : "Unknown"}</td>
                    <td><Link type="submit" to={`/EditUser/${vehi.vehicleId}`} className='btn btn-outline-primary'>Edit</Link></td>
                    <td><button type="submit" onClick={() => deleteUser(vehi.vehicleId)} className='btn btn-outline-danger'>Remove</button></td>

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



export default Home