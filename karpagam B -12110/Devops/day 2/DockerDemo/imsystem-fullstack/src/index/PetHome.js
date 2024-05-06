import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import StudentService from '../Services/PetService';
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Button, Offcanvas } from 'react-bootstrap';
import VisibilityIcon from '@mui/icons-material/Visibility';
import ArrowRightIcon from '@mui/icons-material/ArrowRight';
import PetService from '../Services/PetService';
export default function PetHome() {

  const [pets, setPets] = useState([])
  const [search, setSearch] = useState("");
  const [inventsearch, setPetsearch] = useState([]);



  const handleSubmit = (e) => {
    setSearch(e.target.value);
    onSearch();
  };

  const onSearch = async () => {
    const result = await PetService.fetchByName();
    console.log(result.status);
    setPetsearch(result.data);
  };



  //to load the information everytime the page loaded
  useEffect(() => {
    // console.log("This is the react code by kavi")
    loadAllpets();
    //if we didn't give array means it will run n time
  }, []);


  //async is to wait for the function and to execute the code line by line
  const loadAllpets = async () => {
    const result = await PetService.getPets();
    setPets(result.data);
    console.log(result.data)

  };



  const [pet, setPet] = useState({
    petId: "",
    petName: "",
    petType: "",
    petAge: " ",
    petWeight: "",
    petPrice: ""

  })



  // for view page 


  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);


  const loadPets = async (petId) => {

    const result = StudentService.fetchPetById(petId)
    console.log(petId);
    setPet(result.data)
  }



  return (

    <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
      id='navbar-custom'>
      <div className="container-fluid">
        <h4 className="icon" data-testid="pet"><i><b>ONLINE PET SHOP</b></i></h4>
        <div className='container '>
          <input
            className="form-control mr-sm-2"
            type="search"
            placeholder="Enter Pet Name to Search.."
            aria-label="Search"
            id="search"
            role='searchbox'
            onChange={(e) => handleSubmit(e)} />
        </div>
        <button className="navbar-toggler" type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse mx " id="navbarSupportedContent">

          <div role='insertpetlink'><Link className="btn btn-light btn-outline-dark mx" to="/addpet" id="insert">

            <b>Insert Pet</b></Link><br /></div>


          <div role='userlink'> <Link className="user btn btn-light btn-outline-dark mx" to="/user" id="tbn" name="btnUser" ><b>USER<ArrowRightIcon /></b></Link></div>
          <div role='applink'> <Link className="btn btn-light btn-outline-dark mx" to="/app" id="tbn" ><b>APPOINTMENT<ArrowRightIcon /></b></Link></div>
          <Link className="btn btn-light btn-outline-dark mx" to="/" id="tbn" ><b> <ArrowLeftIcon />Log Out</b></Link>



        </div>
      </div>
    </nav>


      <div className='py-4'>
        <table className="table border shadow table table-success table-striped " id="main">
          <thead className="table-dark">
            <tr>
              <th scope="col">Pet Id</th>
              <th scope="col">Pet Name</th>
              <th scope="col">Pet Type</th>
              <th scope="col">Pet Age</th>
              <th scope="col">Pet weight</th>
              <th scope="col">Pet Price</th>






              <th scope="col">Actions</th>

            </tr>
          </thead>
          <tbody>
            {pets.filter((index) => {

              return search.toLowerCase() === ""
                ? index
                : index.petName.toLowerCase().includes(search);


            })
              .map((pet, index) => (

                <tr>
                  <th scope="row" key={index}>{pet.petId}</th>
                  <td>{pet.petName}</td>
                  <td>{pet.petType}</td>
                  <td>{pet.petAge}</td>
                  <td>{pet.petWeight}</td>
                  <td>{pet.petPrice}</td>
                  <td><Link className="btn btn-light btn-outline-dark mx" to="/addbrand" id='bookpt'><b>BOOK PET</b></Link></td>
</tr>
              ))}

          </tbody>
        </table>
      </div>
    </>
  );
}

