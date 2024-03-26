import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import UsersService from './Service/UsersService';

function EditUser() {

    const { usersId } = useParams()

    const navigate = useNavigate();
    const [user, setUser] = useState({
        usersName: " ",
        usersMobNo: " ",
        usersAddress: " ",
        usersDOB: " "
    })

    const { usersName, usersMobNo, usersAddress,
        usersDOB } = user;



    const onInputChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });

    }

    useEffect(() => {
        loadUser()
        // window.alert("load user executed");
    }, []);


    const onPost = (e) => {
        e.preventDefault();
        UsersService.DoPut(usersId, user)
        alert("Update Successfull !")
        navigate("/")

    }


    const loadUser = async () => {

        const result = await axios.get(`http://localhost:8001/GetUsersById/${usersId}}`);
        // window.alert("its load user");
        setUser(result.data)

    }
    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3  border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Edit User</h2>
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

                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default EditUser