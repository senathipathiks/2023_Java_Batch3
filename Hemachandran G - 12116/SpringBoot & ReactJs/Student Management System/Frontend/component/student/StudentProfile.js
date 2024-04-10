import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import axios from "axios";
import StudentService from '../../service/StudentService';


const StudentProfile = () => {
    const { id } = useParams();
    const [student, setStudent] = useState({
        name: "",
        phnno: "",
        email: "",
        dname: "",
        id: " "
    });

    useEffect(() => {
        loadStudent();
    }, []);

    const loadStudent = async (e) => {
        e.preventDefault();
        // console.log(id);
        await StudentService.findStudent(id).then((response) => {
            setStudent(response.data);

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
                                    {`${student.name} ${student.phnno}`}
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
                                            Name
                                        </h5>
                                    </div>

                                    <div className="col-sm-9">
                                        <p className="text-muted mb-0">
                                            {student.name}
                                        </p>
                                    </div>
                                </div>

                                <hr />

                                <div className="row">
                                    <div className="col-sm-3">
                                        <h5 className="mb-0">
                                            PhoneNo
                                        </h5>
                                    </div>

                                    <div className="col-sm-9">
                                        <p className="text-muted mb-0">
                                            {student.phnno}
                                        </p>
                                    </div>
                                </div>
                                <hr />

                                <div className="row">
                                    <div className="col-sm-3">
                                        <h5 className="mb-0">
                                            Email
                                        </h5>
                                    </div>

                                    <div className="col-sm-9">
                                        <p className="text-muted mb-0">
                                            {student.email}

                                        </p>
                                    </div>
                                </div>
                                <hr />
                                <div className="row">
                                    <div className="col-sm-3">
                                        <h5 className="mb-0">
                                            DeptId
                                        </h5>
                                    </div>

                                    <div className="col-sm-9">
                                        <p className="text-muted mb-0">
                                            {student.dep.id}
                                        </p>
                                    </div>
                                </div>
                                <hr />





                                <div className='row mb-5'></div>
                                <div className='col-sm-2'>
                                    <Link to={"/view-students"}
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

        </section>
    );
};

export default StudentProfile;


