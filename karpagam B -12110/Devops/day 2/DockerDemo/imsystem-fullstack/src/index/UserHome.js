import React, { useEffect, useState } from 'react'
import { Link,useParams } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
 import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Button, Offcanvas } from 'react-bootstrap';
import VisibilityIcon from '@mui/icons-material/Visibility';
import UserService from '../Services/UserService';
import PetService from '../Services/PetService';




export default function UserHome() {

    const [users,setUsers]=useState([])
    const [search, setSearch] = useState("");
    const [usersearch,setUserSerach]=useState([]);
    

   

    const handleSubmit = (e) => {
      setSearch(e.target.value);
      onSearch();
    };
   
    const onSearch = async () => {
      const result= await PetService.fetchByName();
          console.log(result.status);
          setUserSerach(result.data);
    };
  

    //to load the information everytime the page loaded
    useEffect(()=>{
      loadUsers();
    },[]);


    //async is to wait for the function and to execute the code line by line
    const loadUsers= async()=>{
        const result=await UserService.getUserDetail();
        setUsers(result.data);
        
    };
  

    const [user,setUser]=useState({
      userId:0,
      userName:"",
      userCity:"",
      userAge:"",
      petId:"",
      petName:""

      
})
const [show, setShow] = useState(false);

const handleClose = () => setShow(false);
const handleShow = () => setShow(true);


const loadCourse=async(userId)=>{
console.log(userId);
  const result= UserService.fetchUserById(userId)
  setUser(result.data)
}
return (

    <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
      id='navbar-custom'>
      <div className="container-fluid">
        <Link className="navbar-brand" to={"/"}><h5><i><b>ONLINE PET SHOP USER PAGE</b></i></h5></Link>
        <div className='container '>
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Enter Pet Name to Search.."
          aria-label="Search"
          id="search"
          onChange={(e) => handleSubmit(e)} 
          />
          </div>
        <button className="navbar-toggler" type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        
        <div className="collapse navbar-collapse mx " id="navbarSupportedContent2">
        <div role='bookpetslink'><Link className="btn btn-light btn-outline-dark mx" to="/addbrand" name="bookpets">
          <b>Book Pets</b></Link><br /> </div>

          <Link className="btn btn-light btn-outline-dark mx" to="/home" id="tbn" name="backButton"><b>Back to Main page <ArrowLeftIcon/></b></Link>  


        </div>
      </div>
    </nav>


        <div className='py-4'>
          <table className="table border shadow table table-success table-striped " id="main">
          <thead className="table-dark">
            <tr>
              <th scope="col"> user Id </th>
              <th scope="col"> User Name </th>
              <th scope="col"> User City </th>
              <th scope="col"> User Age </th>
               <th scope="col"> Pet Id</th>
               <th scope="col"> Pet Name</th>

               <th scope="col"> Actions </th>
              

            </tr>
          </thead>
          <tbody>
            {users.filter((index) => {
              return search.toLowerCase() === ""
                ? index
                : index.pet.petName.toLowerCase().includes(search);
            })
            .map((user, index) => (

                <tr>
                  <th scope="row" key={index}>{user.userId}</th>
                  <td>{user.userName}</td>
                  <td>{user.userCity}</td>
                  <td>{user.userAge}</td>
                  <td>{user.pet.petId}</td>
                  <td>{user.pet.petName}</td>




                  <td><Button variant="primary"onClick={()=>{
                    // console.log(course.id +"this is")
                      UserService.fetchUserById(user.userId).then((res)=>{
                       console.log(res.data)
                       setUser(res.data)
                      handleShow();
                     })
                    
                  }} >
<VisibilityIcon/>View
      </Button>
      <Offcanvas show={show} onHide={handleClose}>
        <Offcanvas.Header closeButton id='close'>
          <Offcanvas.Title>  <h2 className='text-center m-4'> USER DETAILS</h2></Offcanvas.Title>
        </Offcanvas.Header>
        <Offcanvas.Body>
        <div className='container '>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
          
            <div className='card'>
                <div className='card-header '>
                      Details of User :

                      <ul className='list-group list-group-flush'>
                      <li className='list-group-item'>
                            <b>User Id: </b>
                            {user.userId}
                        </li>
                        <li className='list-group-item'>
                            <b>User Name: </b>

                            {user.userName}
                        </li>
                        <li className='list-group-item'>
                            <b>User City: </b>

                            {user.userCity}
                        </li>
                        <li className='list-group-item'>
                            <b>User Age: </b>

                            {user.userAge}
                        </li>
                        <li className='list-group-item'>
                            <b>Pet Id</b>

                            {user.pet.petId}
                        </li>
                        <li className='list-group-item'>
                            <b>Pet Name</b>

                            {user.pet.petName}
                        </li>
                        
                       
                      </ul>

                </div></div>
                <br/>
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

