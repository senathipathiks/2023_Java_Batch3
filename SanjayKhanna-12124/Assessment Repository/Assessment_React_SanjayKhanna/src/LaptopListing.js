import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";

const LaptopListing = () => {
    const [lapData, lapDataChange] = useState(null);
    const navigate = useNavigate();

    const LoadDetail = (id) => {
        navigate("/laptop/detail/" + id);
    }
    const LoadEdit = (id) => {
        navigate("/laptop/edit/" + id);
    }
    const RemoveFunction = (id) => {
        if (window.confirm('Do you want to remove?')) {
            fetch("http://localhost:8000/laptop/" + id, {
                method: "DELETE"
            }).then((res) => {
                alert('Removed successfully.')
                window.location.reload();
            }).catch((err) => {
                console.log(err.message)
            })
        }
    }




    useEffect(() => {
        fetch(" http://localhost:8000/laptop/").then((res) => {
            return res.json();
        }).then((resp) => {
            lapDataChange(resp);
        }).catch((err) => {
            console.log(err.message);
        })
    }, [])
    return (
        <div >
        <div className="p-3 mb-2 text-dark" >
        <div className="container bg-warning ">
            <div className="card">
                <div className="card-title">
                    <h2>Laptop Allocation Management</h2>
                </div>
                <div className="card-body">
                    <div className="container " style={{"textAlign":"left"}}>
                        <Link to="/laptop/create"  className="btn btn-success" >Add details</Link>
                    </div>
                    <br/><br/>
                    <table className="table table-bordered">
                        <thead className="bg-dark text-white">
                            <tr>
                                <td>Laptop ID</td>
                                <td>Laptop Make</td>
                                <td>Configure</td>
                                <td>Allocated User</td>
                                <td>Allocated on</td>
                                <td>Allocation Period</td>
                            </tr>
                        </thead>
                        <tbody>

                            {lapData &&
                                lapData.map(item => (
                                    <tr key={item.id}>
                                        <td>{item.id}</td>
                                        <td>{item.brand}</td>
                                        <td>{item.configure}</td>
                                        <td>{item.allocated_user}</td>
                                        <td>{item.allocated_on}</td>
                                        <td>{item.allocation_period}</td>
                                        <td><button onClick={() => { LoadEdit(item.id) }} className="btn btn-outline-success rounded-top mx-2 btn-xs" >Edit</button>
                                            <button onClick={() => { RemoveFunction(item.id) }} className="btn btn-outline-danger rounded-top mx-2 btn-xs">Remove</button>
                                            <button onClick={() => { LoadDetail(item.id) }} className="btn btn-outline-primary  rounded-top mx-2 btn-xscd ">View</button>
                                        </td>
                                    </tr>
                                ))
                            }

                        </tbody>

                    </table>
                </div>
            </div>
        </div>
        </div>
        </div>
       
    );
}

export default LaptopListing;
