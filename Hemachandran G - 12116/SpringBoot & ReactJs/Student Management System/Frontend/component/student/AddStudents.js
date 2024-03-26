
import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import StudentService from '../../service/StudentService';



const AddStudents = () => {

    let navigate = useNavigate();

    const[student,setStudent] = useState({
        name: "",
        phnno: "",
        email: "",
        department: {
            id:" ",
            dname:" "        
        }
        
    })


    
    const handleInputChange=(e)=>{
        if(e.target.name === "deptid"){
          setStudent({...student,department:{id: e.target.value}});
      }else
      setStudent({ ...student,[e.target.name]: e.target.value });
       
      };
    const saveStudent = async(e) => {
        e.preventDefault() ;
        
        const result= await StudentService.addStudents(student);
        setStudent(result.data)
        console.log(result)
            alert("Success")
            navigate("/view-students");

        }
    
    const [all,setAll]=useState([]);

    const loadDetails=async()=>{
        await StudentService.getAllId().then((res)=>setAll(res.data)).catch((err)=>console.log(err));
    }

    useEffect(()=>{
        loadDetails();
    },[])
    


  return (
    <div className='col-sm-8 py-2 px-5 offset-2 shadow'>
      <form onSubmit={(e)=> saveStudent(e,student)}>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="name">
                Name
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='name'
            id='name'
            required
            value={student.name}
            onChange={(e) => handleInputChange(e)}
            />

        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="phnno">
                PhoneNum 
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='phnno'
            id='phnno'
            required
            value={student.phnno}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="email">
                Your E-mail
            </label>
            <input
            className='form-control col-sm-6'
            type='email'
            name='email'
            id='email'
            required
            value={student.email}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="deptid">
                DeptId
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='deptid'
            id='deptid'
            required
            value={student.id}
            onChange={(e) => handleInputChange(e)}
            />
            
        </div>
        
         <div className='input-group mb-5'>
            <label
            className='input-group-text'
            htmlFor="dname">
                Dept Name
            </label>
            <input
            className='form-control col-sm-6'
            type='text'
            name='dname'
            id='dname'
            required
            value={student.dname}
            onChange={(e) => handleInputChange(e)}
            />
            </div> 
       
        
        <div className='row mb-5'>
            <div className='col-sm-2'>
                <button
                type="submit"
                className='btn btn-outline-success btn-lg'>
                    Save
                </button>

            </div>
            <div className='col-sm-2'>
                <Link to={"/view-students"}
                type="submit"
                className='btn btn-outline-warning btn-lg'>
                    Cancel
                </Link>

            </div>


        </div>
      </form>
    </div>
  )
}

export default AddStudents
