import { useEffect } from "react"
import { useState } from "react";

const Employeelist = () =>{
    const [empdata,empdatachange] = useState(null);
    useEffect(()=>{
        fetch("http://localhost:3003/employee").then((res)=>{
            return res.json();
        }).then((resp)=>{
            empdatachange(resp);
            console.log(resp)
            console.log(empdata)
        }).catch((err)=>{
            console.log(err.message)
        })
    },[])
    return(
        <div className="container">
            <div className="card">
                <div className="card-title">
                    <h2>Employee Listing
                    </h2>

                </div>
                <div className="card-body">
                    <table className="table table-bordered">
                        <thead className="bg-dark text-white">
                            <tr>
                                <td>ID</td>
                                <td>Name</td>
                                <td>Email</td>
                                <td>Phone</td>
                                <td>Role</td>
                            </tr>

                        </thead>
                        <tbody>
                            {
                                
                                empdata &&
                                empdata.map((employee)=>{
                                    <tr key={employee.id}>
                                        <td>{employee.id}</td>
                                        <td>{employee.Name}</td>
                                        <td>{employee.ph}</td>
                                        <td>{employee.pw}</td>
                                        <td><a className="btn btn-success">Edit</a>
                                        <a className="btn btn-danger">Remove</a>
                                        <a className="btn btn-primary">View</a>
                                        </td>


                                    </tr>
                                })
                            }
                            
                            

                        </tbody>

                    </table>

                </div>

            </div>

        </div>
    )
}

export default Employeelist