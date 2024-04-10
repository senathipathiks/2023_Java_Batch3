import React, { useState } from 'react';
import axios from "axios";
import { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import AdminService from './Service/AdminService';
// import "./Home.css";
function HomeAdmin() {

  const { adminID } = useParams();

  const [count, setCount] = useState(0);
  const [adm, setAdm] = useState([]);


  useEffect(() => {

    loadUsers();

  }, []);




  const loadUsers = (e) => {
    AdminService.LoadAdmin().then((result) => {
      // console.log("HEm")
      // console.log(result.data)
      setAdm(result.data)
    }).catch((err) => { console.error(err) })
  }


  // const deleteUser = async (vehicleId) => {
  //   await axios.delete(`http://localhost:8001/Delete/${vehicleId}`)
  //   loadUsers()
  // }

  const deleteUser = async (customerId) => {
    AdminService.DeleteAdmin(adminID);


    loadUsers()
    alert('Deleted Successfully')
  }


  return (
    <div>
      <div id="page" className='py-4'>
        <div id="table">
          <table className="table text-center  table-striped table-hover w-75 ">
            <thead>
              <tr>
                <th scope="col">Admin ID</th>
                <th scope="col">Admin Name</th>
                <th scope="col">Admin Phone Number</th>
                <th scope="col">Admin Address</th>
                <th scope="col">Edit</th>
                <th scope="col">Remove</th>

              </tr>
            </thead>
            <tbody>

              {
                adm.map((admin, index) => (
                  <tr>

                    <td>{admin.adminId}</td>
                    <td>{admin.adminName}</td>
                    <td>{admin.adminPhnNo}</td>
                    <td>{admin.adminAddress}</td>


                    <td><Link type="submit" to={`/EditUserCustomer/${admin.adminId}`} className='btn btn-outline-primary'>Edit</Link></td>
                    <td><button type="submit" onClick={() => deleteUser(admin.adminId)} className='btn btn-outline-danger'>Remove</button></td>

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



export default HomeAdmin