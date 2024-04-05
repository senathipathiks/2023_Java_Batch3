import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";


const LaptopDetail = () => {
    const { lapId } = useParams();

    const [lapData, lapDataChange] = useState({});

    useEffect(() => {
        fetch(`http://localhost:8000/laptop/${lapId}`).then((res) => {
            return res.json();
        }).then((resp) => {
            lapDataChange(resp);
        }).catch((err) => {
            console.log(err.message);
        })
    });
    return (
        <div className="container-fluid p-3 mb-2  text-dark" >
            <div className="row" >
                <div className="col-md-10 offset-md-1" >
                    <div className="card" >
                        <div className="card-title">
                            <h2>Medicine Details</h2>
                        </div>
                        <div className="card-body" >
                            {lapData &&
                                <div>
                                    <table className="display">
                                    <tr>
                                        <td>Laptop Make : </td>
                                        <td>{lapData.brand}</td>
                                    </tr>
                                    <br />
                                    <tr>
                                        <td>Configure :</td>
                                        <td>{lapData.configure}</td>
                                    </tr>
                                    <br />
                                    <tr>
                                        <td>Allocated User :</td>
                                        <td>{lapData.allocated_user}</td>
                                    </tr>
                                    <br />
                                    <tr>
                                        <td>Allocated on :</td>
                                        <td>{lapData.allocated_on}</td>
                                    </tr>
                                    <br/>
                                    <tr>
                                        <td>Allocation Period :</td>
                                        <td>{lapData.allocation_period}</td>
                                    </tr>
                                    <br/>
                                    <tr>
                                        <td colSpan={2}> <Link className="btn btn-danger" to="/laptop/listing">Back to Listing</Link></td>
                                    </tr>
                                    </table>
                                </div>
                            }
                        </div>
                    </div>
                </div>
            </div>
        </div >
    )
}

export default LaptopDetail;