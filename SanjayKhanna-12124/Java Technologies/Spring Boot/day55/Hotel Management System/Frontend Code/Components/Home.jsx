import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import hotelServices from '../Service/HotelServices';
import AddHotel from './AddHotel';
import DeleteHotel from './DeleteHotel';
import UpdateHotel from './UpdateHotel';

function Home() {

    const [hotelData, setHotelData] = useState([]);
    const [eId,setEventId] = useState(0);

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    useEffect(() => {
        hotelServices.doGetAll().then((res) => { setHotelData(res.data) })
            .catch((err) => console.log("Error : " + err));
    },[])

    return (
        <div>
            <div className='container-fluid container-fluid-fixed-top pt-3'>
                <div className="card card-body w-50 mx-auto text-center  h1" id="title">Hotel Management System</div>
            </div>
            <section className="container container-lg text-center">
                <div className="card card-lg bg-body mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-title h1">Hotel List</div>
                    <div className="card-body">
                        <div className="container row">
                            <div className="col-6" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={()=>setFlags({isAddable:true})} color="success">Add Record</Button></div>
                            <div className="col-6" style={{ "textAlign": "right" }}>
                                <h5>No of Record: {hotelData.length}</h5>
                            </div>
                        </div>
                        <table className="table table-bordered table-striped table-hover table-lg mt-3">
                            <thead className="bg-dark text-white">
                                <tr>
                                    <td>Hotel Id</td>
                                    <td>Hotel Name</td>
                                    <td>Hotel Location</td>
                                    <td>Hotel Rating</td>
                                    <td>Contact number</td>
                                    <td className="col-2">Action</td>
                                </tr>
                            </thead>
                            <tbody>
                                {hotelData.map(
                                    data =>
                                        <tr key={data.hotelId}>
                                            <td>{data.hotelId}</td>
                                            <td>{data.hotelName}</td>
                                            <td>{data.hotelLocation}</td>
                                            <td>{data.hotelRating}</td>
                                            <td>{data.phoneNumber}</td>
                                            <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({isEditable:true});setEventId(data.hotelId)}}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({isDeletable:true});setEventId(data.hotelId) }}>delete</Button></td>
                                        </tr>
                                )}
                            </tbody>
                        </table>
                    </div>
                </div>
            </section>
            { Flags.isAddable && <AddHotel Flags={Flags}/>}
            { Flags.isEditable && <UpdateHotel  Flags={Flags} id={eId}/>}
            { Flags.isDeletable && <DeleteHotel Flags={Flags} id={eId} /> }
        </div>
    );
}

export default Home;
