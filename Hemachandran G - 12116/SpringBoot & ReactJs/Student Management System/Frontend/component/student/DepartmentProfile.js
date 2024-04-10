import React, { useEffect, useState } from 'react';
import {Link,useParams} from 'react-router-dom';
import axios from "axios";
import DepartmentService from '../../service/DepartmentService';

     
    const DepartmentProfile = () => {
    const { id } = useParams();
    const [department, setDepartment] = useState({
    dname: ""
    });
     
    useEffect(() => {
    loadDepartment();
    }, []);
     
    const loadDepartment = async()=> {
         console.log(id);
        await DepartmentService.findDepartment(id).then((response)=>{
        setDepartment(response.data);
    
});
    }     
    return (
    <section
    className="shadow"
    style={{ backgroundColor: "whitesmoke" }}>
    <div className="container py-5">
    <div className="row">
    <div className="col-lg-3">
    <div className="card mb-4">
    <div className="card-body text-center">
    <img
    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp"
    alt="avatar"
    className="rounded-circle img-fluid"
    style={{ width: 150 }}
    />
    <h5 className="my-3">
    {`${department.dname}`}
    </h5>
    <div className="d-flex justify-content-center mb-2">
    <button
    type="button"
    className="btn btn-outline-primary">
    Call
    </button>
    <button
    type="button"
    className="btn btn-outline-warning ms-1">
    Message
    </button>
    </div>
    </div>
    </div>
    </div>
     
    <div className="col-lg-9">
    <div className="card mb-4">
    <div className="card-body">
    <hr />
     
    <div className="row">
    <div className="col-sm-3">
    <h5 className="mb-0">
    DeptId
    </h5>
    </div>
     
    <div className="col-sm-9">
    <p className="text-muted mb-0">
    {department.dname}
    </p>
    </div>
    </div>
     
    <hr />
     
    <div className="row">
    <div className='row mb-5'></div>
    <div className='col-sm-2'>
                <Link to={"/view-departments"}
                type="submit"
                className='btn btn-success btn-md'>
                    Back
                </Link>

            </div>
    

    </div>
    </div>
    </div>
    </div>
    </div>
    </div>
    </section>
    );
    };

    export default DepartmentProfile;
    
    
    