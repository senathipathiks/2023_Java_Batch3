import React, { useState } from 'react';
import { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import UsersService from './Service/UsersService';

// import "./Home.css";
function Home() {

    const { usersId } = useParams();

    const [count, setCount] = useState(0);
    const [user, setUser] = useState([]);
    const [con, setCon] = useState([]);

    useEffect(() => {

        loadUsers();

    }, []);



    const loadUsers = (e) => {
        UsersService.GetList().then((result) => {
            // console.log("HEm")
            // console.log(result.data)
            setUser(result.data)
        }).catch((err) => { console.error(err) })
    }




    // const deleteUser = async (vehicleId) => {
    //   await axios.delete(`http://localhost:8001/Delete/${vehicleId}`)
    //   loadUsers()
    // }

    const deleteUser = async (usersId) => {
        UsersService.DeleteUser(usersId);
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
                                <th scope="col">User ID</th>
                                <th scope="col">User Name</th>
                                <th scope="col">User's Mobile Number</th>
                                <th scope="col">User's Address</th>
                                <th scope="col">User's Address</th>
                                <th scope="col">Admin Id</th>
                                <th scope="col">Admin Name</th>
                                <th scope="col">Edit</th>
                                <th scope="col">Remove</th>

                            </tr>
                        </thead>
                        <tbody>

                            {
                                user.map((users, index) => (
                                    <tr>

                                        <td>{users.usersId}</td>
                                        <td>{users.usersName}</td>
                                        <td>{users.usersMobNo}</td>
                                        <td>{users.usersAddress}</td>
                                        <td>{users.usersDOB}</td>
                                        <td>{users.admin ? users.admin.adminId : "Null"}</td>
                                        <td>{users.admin ? users.admin.adminName : "Unknown"}</td>
                                        <td><Link type="submit" to={`/EditUser/${users.usersId}`} className='btn btn-outline-primary'>Edit</Link></td>
                                        <td><button type="submit" onClick={() => deleteUser(users.usersId)} className='btn btn-outline-danger'>Remove</button></td>

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