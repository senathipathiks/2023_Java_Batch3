import React, { useEffect, useState } from 'react'
import { Await, Link,useParams } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import StudentService from '../Services/StudentService';
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Button, Offcanvas } from 'react-bootstrap';
import VisibilityIcon from '@mui/icons-material/Visibility';
import ArrowRightIcon from '@mui/icons-material/ArrowRight';



export default function StudentHome() {

    const [students,setStudents]=useState([])
    const [search, setSearch] = useState("");
    const [inventsearch,setStudentsearch]=useState([]);

   

    const handleSubmit = (e) => {
      setSearch(e.target.value);
      onSearch();
    };
   
    const onSearch = async () => {
      const result= await StudentService.fetchByName();
          console.log(result.status);
          setStudentsearch(result.data);
    };

    //to pass the studentId we are creating useparams
    const {studentId}=useParams()


    //to load the information everytime the page loaded
    useEffect(()=>{
        // console.log("This is the react code by kavi")
        loadStudents(studentId);
        //if we didn't give array means it will run n time
    },[]);


    //async is to wait for the function and to execute the code line by line
    const loadStudents= async()=>{
        const result=await StudentService.getStudents();
        setStudents(result.data);
    };

    const deleteInvent= async (studentId)=>{
      console.log(studentId)
      await  StudentService.DeleteStudents(studentId)
      loadStudents()
    }


    const [student,setStudent]=useState({
      studentId:"",
      studentName:"",
      studentQualification:"",
      studentAge:" ",
      studentCity:""

})

//since we will be getting specific user for specific id we will be using useparam
// const {studentId}=useParams();


// for view page 


const [show, setShow] = useState(false);

const handleClose = () => setShow(false);
const handleShow = () => setShow(true);


const loadStudent=async(studentId)=>{
console.log(studentId);
  const result= StudentService.fetchStudentById(studentId)
  setStudent(result.data)
}



  return (

    <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
      id='navbar-custom'>
      <div className="container-fluid">
        <Link className="navbar-brand" to={"/"}><h5><i><b>COURSE MANAGEMENT
          <br/> SYSTEM</b></i></h5></Link>
        <div className='container '>
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Enter Student Name to Search.."
          aria-label="Search"
          id="search"
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

          <Link className="btn btn-outline-light mx" to="/addinvent">
            {/* <Fab size="small" color="secondary" aria-label="add"> */}
  {/* <AddIcon/>
</Fab>*/}
<b>Insert Record</b></Link><br /> 

          <Link className="btn btn-outline-light" to="/deleteinvents" id="tbn"><b>Delete Record by Id</b></Link>
          <Link className="btn btn-outline-light mx" to="/" id="tbn" ><b> <ArrowLeftIcon/>Log Out</b></Link>  

          <Link className="btn btn-primary btn-outline-light mx" to="/course" id="tbn" ><b>COURSE<ArrowRightIcon/></b></Link>  


        </div>
      </div>
    </nav>


        <div className='py-4'>
          <table className="table border shadow table table-secondary table-striped " id="main">
          <thead className="table-dark">
            <tr>
              <th scope="col">Student id</th>
              <th scope="col">Student Name</th>
              <th scope="col">Student Qualification</th>
              <th scope="col">Student Age</th>
              <th scope="col">Student City</th>
              <th scope="col">Course id</th>




              
              <th scope="col">Course name</th>
              <th scope="col">Actions</th>

            </tr>
          </thead>
          <tbody>
            {students.filter((index) => {
              return search.toLowerCase() === ""
                ? index
                : index.studentName.toLowerCase().includes(search);
            })
              .map((student, index) => (

                <tr>
                  <th scope="row" key={index}>{student.studentId}</th>
                  <td>{student.studentName}</td>
                  <td>{student.studentQualification}</td>
                  <td>{student.studentAge}</td>
                  <td>{student.studentCity}</td>
                  <td>{student.course.id}</td>
                  <td>{student.course.courseName}</td>

                

<td><Button variant="primary"onClick={handleShow} >
<VisibilityIcon/>View
      </Button>
      <Offcanvas show={show} onHide={handleClose}>
        <Offcanvas.Header closeButton>
          <Offcanvas.Title>  <h2 className='text-center m-4'> STUDENT DETAILS</h2></Offcanvas.Title>
        </Offcanvas.Header>
        <Offcanvas.Body>
        <div className='container '>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-3 mt-4 shadow ">
          
            <div className='card'>
                <div className='card-header '>
                   {/* <b>Details of Inventory</b>    */}

                      <ul className='list-group list-group-flush'>
                      <li className='list-group-item'>
                            <b>Student Id: </b>
                            {student.studentId}                        </li>
                        <li className='list-group-item'>
                            <b>stuedent Name: </b>
                            {student.studentName}                        </li>
                        <li className='list-group-item'>
                            <b>Qualification : </b>
                            {student.studentQualification}
                        </li>
                        <li className='list-group-item'>
                            <b>Age : </b>
                            {student.studentAge}
                        </li>
                        <li className='list-group-item'>
                            <b>City : </b>
                            {student.studentCity}                        </li>
                        <li className='list-group-item'>
                            <b>Course id : </b>
                            {student.course.id}                        </li>
                        <li className='list-group-item'>
                            <b>Course Name </b>
                            {student.course.courseName}                        </li>
                       
                      </ul>

                </div></div>
                <br/>
            </div>
            </div>
            </div>
        </Offcanvas.Body>
      </Offcanvas>

                    <Link className="btn btn-warning mx-1" id="button" to={`/Editinvent/${student.studentId}`}><EditIcon/>Edit</Link>
                    <button className="btn btn-danger mx-1"  id="button" onClick={() => deleteInvent(student.studentId)}><DeleteIcon/>Delete</button></td>
                    
                </tr>
              ))}

          </tbody>
        </table>
        </div>
     </>
  );
}

