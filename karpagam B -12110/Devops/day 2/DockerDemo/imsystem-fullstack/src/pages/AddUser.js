import React, { useState, useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import "bootstrap/dist/css/bootstrap.min.css";
import UserService from '../Services/UserService';
import PetService from '../Services/PetService';

export default function AddUser() {

    //to navigate to the home page after clicking submit
    let navigate = useNavigate()

    const [user, setUser] = useState({
        userName: "",
        userCity: "",
        userAge: "",
        pet: {
            petId: 0
        }
    });


    //.. for keep on adding new data or objects
    const onInputChange = (e) => {

        if (e.target.name === "petId") {
            console.log("hello");
            setUser({ ...user, pet: { petId : e.target.value } });
        }
        else {

            setUser({ ...user, [e.target.name]: e.target.value });
        }
    };



    //prevent default is to stop the unwanted url loading when clicking submit
    //to insert the data fetch axios link from postman API
    const onHandleSubmit = async (e) => {
        console.log(user);
        e.preventDefault();
        await UserService.AddUser(user)
        // alert('Pets Booked Successfully !!')
        navigate("/user");
    };


    const [all, setAll] = useState([]);

    const loadDetails = async (e) => {
        await PetService.getAllIdList()
            .then((res) => setAll(res.data))
            .catch((err) => console.log(err));
    };



    useEffect(() => {
        loadDetails();
    }, []);


    return (

        <><div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
                id='navbar-custom-i'>
                <div className="container-fluid">
                    <Link className="navbar-brand" to={"/"}><h4><i><b>ONLINE PET SHOP</b></i></h4></Link>


                </div>
            </nav>
        </div>




            <div className='container '
                id='Carder'>
                <div className='row'>
                    <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow dark ">
                        <h2 className='text-center m-4' ><b className='.text-danger'> BOOK APPOINTMENT</b></h2>
                        <form onSubmit={(e) => onHandleSubmit(e, user)}>

                            <div className='mb-8'>
                                <label htmlFor='userName' className='form-label' role="labelusername"><b>USER NAME :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter User Name'
                                    name="userName"
                                    id='name'
                                    role='usrname'
                                    value={user.userName}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                />



                            </div>
                            <div className='mb-8'>
                                <label htmlFor='userCity' className='form-label' role="labelusercity"><b>User City :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter User city'
                                    name="userCity"
                                    id='city'
                                    role='usrcity'
                                    value={user.userCity}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>
                            <div className='mb-8'>
                                <label htmlFor='studentAge' className='form-label' role="labeluserage"><b>User Age :</b></label>
                                <input type={'text'}
                                    className='form-label'
                                    placeholder='Enter User Age'
                                    name="userAge"
                                    id='age'
                                    role='usrage'
                                    value={user.userAge}
                                    onChange={(e) => onInputChange(e)}
                                    required
                                /></div>


                            <div className='mb-3'>
                                <label htmlFor='Pet Id' className='form-label' role="labelpetId"><b>PET ID :</b></label>
                                <select
                                    name="petId"

                                    onChange={(e) => onInputChange(e)}>
                                    <option selected="selected">Choose Pet Id Here</option>
                                    {all.map((index) => (
                                        <option name="petId" key={index} value={index}>
                                            {index}
                                        </option>
                                    ))}
                                </select>
                            </div>



                            <button type='submit' className='btn btn-info' id='usersubmit' data-testid="user-submit">SUBMIT</button>
                            <Link type='submit' className='btn btn-danger mx-2' to="/home">CANCEL</Link>


                        </form>
                    </div>
                </div>
            </div></>
    )
}
