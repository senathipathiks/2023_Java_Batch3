import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';
import UsersService from './Service/UsersService';

function AddUser() {

    const navigate = useNavigate();
    const { usersId } = useParams()
    const [adm, setAdm] = useState([]);

    useEffect(() => {

        loadUser();

    }, []);

    const [user, setUser] = useState({
        usersName: " ",
        usersMobNo: " ",
        usersAddress: " ",
        usersDOB: " ",
        admin:
        {
            adminId: " "
            // customerName: " ",
            // customerPhnNo: " ",
            // customerAddress: " "
        }
    })

    const { usersName, usersMobNo, usersAddress,
        usersDOB } = user;

    const onInputChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });

    }
    const handleChange = (e) => {
        setUser({ ...user, admin: { adminId: e.target.value } })

    }

    const loadUser = async () => {

        const result = await axios.get(`http://localhost:8001/AdminById`);
        // window.alert("its load user");
        setAdm(result.data)

    }



    const onPost = async (e) => {
        // e.preventDefault();
        // console.log(user)
        UsersService.DoPost(user)

        alert("Added Successfully !")
        navigate("/")

    }



    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Insert User Details</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='usersName' className='form-label'>User's Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Name' value={usersName} name='usersName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='usersMobNo' className='form-label'>User's Mobile Number: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Mobile Number' value={usersMobNo} name='usersMobNo' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='usersAddress' className='form-label'>User's Addres: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Address' value={usersAddress} name='usersAddress' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='usersDOB' className='form-label'>User's Date Of Birth: </label>
                            <input type={"text"} className='form-control' placeholder='Enter DOB' value={usersDOB} name='usersDOB' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <select

                                onChange={(e) => handleChange(e)}

                                name="adminId"
                                class="form-control"
                                placeholder="Enter Admin Name"
                                required="required"
                                value={user.admin.adminId}

                            ><option value=''>Select Admin</option>
                                {adm.map((x) => (
                                    <option key={x} value={x}>
                                        {x}
                                    </option>
                                ))}
                            </select>
                        </div>

                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default AddUser