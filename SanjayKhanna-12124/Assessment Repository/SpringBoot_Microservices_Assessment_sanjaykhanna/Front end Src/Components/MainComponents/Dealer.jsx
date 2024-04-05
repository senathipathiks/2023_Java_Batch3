import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import dealerService from '../../Services/DealerService';
import AddDealer from '../DealerComponents/AddDealer';
import DeleteDealer from '../DealerComponents/DeleteDealer';
import EditDealer from '../DealerComponents/EditDealer';
import Search from '../UtilitiesComponents/Search';

const Dealer = () => {

    const [data, setData] = useState([]);
    const [eId, setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    useEffect(() => {
        dealerService.doReadAll()
            .then((res) => setData(res.data))
            .catch((err) => console.log(err))
    }, [])

    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">Dealer Record List</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-4" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={() => { setFlags({ isAddable: true }) }} color="success">Add dealer</Button></div>
                            <div className="col-4" style={{ "textAlign": "center" }}>
                                <h5>No of Record: {data.length} </h5>
                            </div>
                            <div className="col-4">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                        </div>
                        <div className='container'>
                            <table className="table table-bordered table-striped table-hover mt-3">
                                <thead className="bg-dark text-white text-center">
                                    <tr>
                                        <td>Dealer Name</td>
                                        <td>Contact Number</td>
                                        <td>Address</td>
                                        <td>Product Name</td>
                                        <td>Product Type</td>
                                        <td>Quantity</td>
                                        <td className="col-2">Action</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        data.filter((st) => st.dealerName.toLowerCase().includes(search) || st.dealerName.toUpperCase().includes(search)).map((item) => (
                                            <tr key={item.dealerId}>
                                                <td>{item.dealerName}</td>
                                                <td>{item.dealerContactNo}</td>
                                                <td>{item.dealerAddress}</td>
                                                <td>{item.product.productName}</td>
                                                <td>{item.product.productType}</td>
                                                <td>{item.product.quantity}</td>
                                                <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({ isEditable: true }); setEventId(item.dealerId) }}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({ isDeletable: true }); setEventId(item.dealerId) }}>delete</Button></td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddDealer Flags={Flags} />}
            {Flags.isEditable && <EditDealer Flags={Flags} id={eId} />}
            {Flags.isDeletable && <DeleteDealer Flags={Flags} id={eId} />}
        </div>
    );
}

export default Dealer;
