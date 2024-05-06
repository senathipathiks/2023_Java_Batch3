import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Button, Offcanvas } from 'react-bootstrap';
import VisibilityIcon from '@mui/icons-material/Visibility';
import Appservice from '../Services/Appservice';



export default function AppointmentHome() {

    const [app, setApp] = useState([])
    const [search, setSearch] = useState("");




   
    

    //to pass the studentId we are creating useparams
    const { appId } = useParams()


    //to load the information everytime the page loaded
    useEffect(() => {
        // console.log("This is the react code by kavi")
        loadApp(appId);
        //if we didn't give array means it will run n time
    }, []);


    //async is to wait for the function and to execute the code line by line
    const loadApp = async () => {
        const result = await Appservice.getApps();
        setApp(result.data);
    };

   

    const [apps, setApps] = useState({
        appId: "",
        appDate: "",
        pet:{
            petId:"",
            petName:""

        },user:{
            userId: ""
        }

    })




    // for view page 


    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);


    const loadSchools = async (appId) => {
        console.log(appId);
        const result = Appservice.fetchApById(appId)
        setApps(result.data)
    }



    return (

        <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
            id='navbar-custom'>
            <div className="container-fluid">
                <Link className="navbar-brand" to={"/"}><h5><i><b>ONLINE PET
                     SHOP - APPOINTMENT PAGE</b></i></h5></Link>
                
                <button className="navbar-toggler" type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent"
                    aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse mx " id="navbarSupportedContent1">



                    <Link className="btn btn-light btn-outline-dark mx" to="/home" id="tbn" ><b>Back to Main page <ArrowLeftIcon /></b></Link>



                </div>
            </div>
        </nav>


            <div className='py-4'>
                <table className="table border shadow table table-success table-striped " id="main">
                    <thead className="table-dark">
                        <tr>
                            <th scope="col">APPOINTMENT ID</th>
                            <th scope="col">APPOINTMENT DATE</th>
                            <th scope="col">PET ID</th>
                            <th scope="col">PET NAME</th>

                            <th scope="col">USER ID</th>
                            <th scope="col">USER NAME</th>






                            <th scope="col">Actions</th>

                        </tr>
                    </thead>
                    <tbody>
                        {app.map((apps, index) => (
                                <tr>
                                    <th scope="row" key={index}>{apps.appId}</th>
                                    <td>{apps.appDate}</td>
                                    <td>{apps.pet.petId}</td>
                                    <td>{apps.pet.petName}</td>

                                    <td>{apps.user.userId}</td>
                                    <td>{apps.user.userName}</td>






                                    <td><Button variant="primary" onClick={handleShow} >
                                        <VisibilityIcon />View
                                    </Button>
                                        <Offcanvas show={show} onHide={handleClose}>
                                            <Offcanvas.Header closeButton>
                                                <Offcanvas.Title>  <h2 className='text-center m-4'> APPOINTMENT DETAILS</h2></Offcanvas.Title>
                                            </Offcanvas.Header>
                                            <Offcanvas.Body>
                                                <div className='container '>
                                                    <div className='row'>
                                                        <div className="col-md-6 offset-md-3 border rounded p-3 mt-4 shadow ">

                                                            <div className='card'>
                                                                <div className='card-header '>

                                                                    <ul className='list-group list-group-flush'>
                                                                        <li className='list-group-item'>
                                                                            <b>Appointment Id: </b>
                                                                            {apps.appId}
                                                                        </li>
                                                                        <li className='list-group-item'>
                                                                            <b>Appointment  Date: </b>
                                                                            {apps.appDate}                       
                                                                             </li>
                                                                        <li className='list-group-item'>
                                                                            <b>Pet Id : </b>
                                                                            {apps.pet.petId}
                                                                        </li>
                                                                        <li className='list-group-item'>
                                                                            <b>Pet Name : </b>
                                                                            {apps.pet.petName}
                                                                        </li>
                                                                        <li className='list-group-item'>
                                                                            <b>User Id : </b>
                                                                            {apps.user.userId}
                                                                        </li>


                                                                    </ul>

                                                                </div></div>
                                                            <br />
                                                        </div>
                                                    </div>
                                                </div>
                                            </Offcanvas.Body>
                                        </Offcanvas>

                                        </td>

                                </tr>
                            ))}

                    </tbody>
                </table>
            </div>
        </>
    );
}

