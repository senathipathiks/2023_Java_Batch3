import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import customerService from '../../Services/CustomerService';
import AddCustomer from '../CustomerComponents/AddCustomer';
import DeleteCustomer from '../CustomerComponents/DeleteCustomer';
import EditCustomer from '../CustomerComponents/EditCustomer';
import Search from '../UtilitiesComponents/Search';

const Customer = () => {

    const [customerData,setCustomerData] = useState([]);
    const [eId,setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    useEffect(()=>{
        customerService.doReadAll()
        .then((res) => {setCustomerData(res.data)})
        .catch((err)=>console.log(err));
    },[])


    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">Customer Record List</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-4" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={() => { setFlags({ isAddable: true }) }} color="success">Add Customer</Button></div>
                            <div className="col-4" style={{ "textAlign": "center" }}>
                                <h5>No of Record: {customerData.length} </h5>
                            </div>
                            <div className="col-4">
                                <Search search={search} setSearch={setSearch} />
                            </div>
                        </div>
                        <div className='container'>
                            <table className="table table-bordered table-striped table-hover mt-3">
                                <thead className="bg-dark text-white text-center">
                                    <tr>
                                        <td>Customer Name</td>
                                        <td>Contact Number</td>
                                        <td>Purchased Product</td>
                                        <td>Product Type</td>
                                        <td>Price</td>
                                        <td>Payment method</td>
                                        <td className="col-2">Action</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        customerData.filter((st)=>st.customerName.toLowerCase().includes(search)||st.customerName.toUpperCase().includes(search)).map((item)=>(
                                            <tr key={item.customerId}>
                                                <td>{item.customerName}</td>
                                                <td>{item.customerContactNo}</td>
                                                <td>{item.product.productName}</td>
                                                <td>{item.product.productType}</td>
                                                <td>Rs: {item.product.price}/-</td>
                                                <td>{item.paymentMethod}</td>
                                                <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({isEditable:true});setEventId(item.customerId)}}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({isDeletable:true});setEventId(item.customerId) }}>delete</Button></td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddCustomer Flags={Flags} />}
            {Flags.isEditable && <EditCustomer Flags={Flags} id={eId} />}
            {Flags.isDeletable && <DeleteCustomer Flags={Flags} id={eId} />}
        </div>
    );
}

export default Customer;
