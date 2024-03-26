import React, { useEffect, useState } from 'react'
import { Link,useParams } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
 import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { Button, Offcanvas } from 'react-bootstrap';
import VisibilityIcon from '@mui/icons-material/Visibility';
import CourseService from '../Services/CourseService';




export default function CourseHome() {

    const [courses,setCourses]=useState([])
    const [search, setSearch] = useState("");
    const [coursesearch,setCourseSerach]=useState([]);

   

    const handleSubmit = (e) => {
      setSearch(e.target.value);
      onSearch();
    };
   
    const onSearch = async () => {
      const result= await CourseService.FetchByName();
          console.log(result.status);
          setCourseSerach(result.data);
    };
    
   

    
    //to pass the itemid we are creating useparams
    const {id}=useParams() 


    //to load the information everytime the page loaded
    useEffect(()=>{
      loadCourses(id);
    },[]);


    //async is to wait for the function and to execute the code line by line
    const loadCourses= async()=>{
        const result=await CourseService.getCourseDetail();
        setCourses(result.data);
        
    };
    const deleteCourse= async (id)=>{
      console.log(id)
      await  CourseService.DeleteById(id);
      loadCourses();
    }


    const [course,setCourse]=useState({
      id:0,
      courseName:"",
      couresDuration:"",
      courseType:"",
      courseStartDate:"",
      courseEndDate:"",
      courseLecturer:""

      
})
const [show, setShow] = useState(false);

const handleClose = () => setShow(false);
const handleShow = () => setShow(true);


const loadCourse=async(id)=>{
console.log(id);
  const result= CourseService.fetchCourseById(id)
   setCourse(result.data)
}
return (

    <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
      id='navbar-custom'>
      <div className="container-fluid">
        <Link className="navbar-brand" to={"/"}><h5><i><b>COURSE MANAGEMENT </b></i></h5></Link>
        <div className='container '>
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Enter Course Name to Search.."
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
        
        <div className="collapse navbar-collapse mx " id="navbarSupportedContent">
        <Link className="btn btn-outline-light mx" to="/addbrand">
          <b>Insert Record</b></Link><br /> 

          <Link className="btn btn-outline-light" to="/deletebrands" id="tbn"><b>Delete Record by Id</b></Link>
          <Link className="btn btn-primary btn-outline-light mx" to="/home" id="tbn" ><b>Back to Main page <ArrowLeftIcon/></b></Link>  


        </div>
      </div>
    </nav>


        <div className='py-4'>
          <table className="table border shadow table table-secondary table-striped " id="main">
          <thead className="table-dark">
            <tr>
              <th scope="col"> Id </th>
              <th scope="col"> course name </th>
              <th scope="col"> course duration </th>
              <th scope="col"> course type </th>
               <th scope="col"> course start date </th>
               <th scope="col"> course End date </th>
               <th scope="col"> Lecturer</th>
               <th scope="col"> Actions </th>
              

            </tr>
          </thead>
          <tbody>
            {courses.filter((index) => {
              return search.toLowerCase() === ""
                ? index
                : index.courseName.toLowerCase().includes(search);
            })
            .map((course, index) => (

                <tr>
                  <th scope="row" key={index}>{course.id}</th>
                  <td>{course.courseName}</td>
                  <td>{course.couresDuration}</td>
                  <td>{course.courseType}</td>
                  <td>{course.courseStartDate}</td>
                  <td>{course.courseEndDate}</td>
                  <td>{course.courseLecturer}</td>





                  












                  <td><Button variant="primary"onClick={()=>{
                    console.log(course.id +"this is")
                      CourseService.fetchCourseById(course.id).then((res)=>{
                       console.log(res.data)
                      setCourse(res.data)
                      handleShow();
                     })
                    
                  }} >
<VisibilityIcon/>View
      </Button>
      <Offcanvas show={show} onHide={handleClose}>
        <Offcanvas.Header closeButton>
          <Offcanvas.Title>  <h2 className='text-center m-4'> COURSE DETAILS</h2></Offcanvas.Title>
        </Offcanvas.Header>
        <Offcanvas.Body>
        <div className='container '>
        <div className='row'> 
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-4 shadow ">
          
            <div className='card'>
                <div className='card-header '>
                      Details of Course :

                      <ul className='list-group list-group-flush'>
                      <li className='list-group-item'>
                            <b>Course Id: </b>
                            {id}
                        </li>
                        <li className='list-group-item'>
                            <b>Course Name: </b>

                            {course.courseName}
                        </li>
                        <li className='list-group-item'>
                            <b>Course duration: </b>

                            {course.couresDuration}
                        </li>
                        <li className='list-group-item'>
                            <b>Course type: </b>

                            {course.courseType}
                        </li>
                        <li className='list-group-item'>
                            <b>Course start date: </b>

                            {course.courseStartDate}
                        </li>
                        <li className='list-group-item'>
                            <b>Course End date: </b>

                            {course.courseEndDate}
                        </li>
                        <li className='list-group-item'>
                            <b>Course lecturer: </b>

                            {course.courseLecturer}
                        </li>
                       
                      </ul>

                </div></div>
                <br/>
            </div>
            </div>
            </div>
        </Offcanvas.Body>
      </Offcanvas>

                    <Link className="btn btn-warning mx-1" id="button" to={`/editbrand/${course.id}`}><EditIcon/>Edit</Link>
                    <button className="btn btn-danger mx-1"  id="button" onClick={() => deleteCourse(course.id)}><DeleteIcon/>Delete</button></td>
                    
                
                </tr>
              ))}

          </tbody>
        </table>
        </div>
     </>
  );
}

