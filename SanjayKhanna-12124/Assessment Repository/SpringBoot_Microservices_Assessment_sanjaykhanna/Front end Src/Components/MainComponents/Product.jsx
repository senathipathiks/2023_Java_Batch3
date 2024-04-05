import { Button } from '@mui/material';
import React, { useEffect, useState } from 'react';
import productService from '../../Services/ProductService';
import AddProduct from '../ProductComponents/AddProduct';
import DeleteProduct from '../ProductComponents/DeleteProduct';
import EditProduct from '../ProductComponents/EditProduct';
import Search from '../UtilitiesComponents/Search';

const Product = () => {

    const [data, setData] = useState([]);
    const [eId, setEventId] = useState(0);
    const [search, setSearch] = useState("");

    const [Flags, setFlags] = useState({
        isAddable: false,
        isEditable: false,
        isDeletable: false
    });

    useEffect(() => {
        productService.doReadAll()
            .then((res) => setData(res.data))
            .catch((err) => console.log(err))
    }, [])


    return (
        <div>
            <section className="container container-lg">
                <div className="card card-lg mt-5 shadow-lg p-2 mx-auto">
                    <div className="card-header card-title border-0 text-center h1">Product Record List</div>
                    <div className="card-body">
                        <div className="container row mt-3">
                            <div className="col-4" style={{ "textAlign": "left" }}>
                                <Button variant="contained" onClick={() => { setFlags({ isAddable: true }) }} color="success">Add product</Button></div>
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
                                        <td>Product Name</td>
                                        <td>Product Type</td>
                                        <td>Quantity</td>
                                        <td>Price</td>
                                        <td className="col-2">Action</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        data.filter((st) => st.productName.toLowerCase().includes(search) || st.productName.toUpperCase().includes(search)).map((item) => (
                                            <tr key={item.productId}>
                                                <td>{item.productName}</td>
                                                <td>{item.productType}</td>
                                                <td>{item.quantity}</td>
                                                <td>Rs: {item.price}/-</td>
                                                <td className="d-flex justify-content-evenly"><Button variant="contained" onClick={() => { setFlags({ isEditable: true }); setEventId(item.productId) }}>edit</Button><Button variant="contained" color="error" onClick={() => { setFlags({ isDeletable: true }); setEventId(item.productId) }}>delete</Button></td>
                                            </tr>
                                        ))
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
            {Flags.isAddable && <AddProduct Flags={Flags} />}
            {Flags.isEditable && <EditProduct Flags={Flags} id={eId} />}
            {Flags.isDeletable && <DeleteProduct Flags={Flags} id={eId} />}
        </div>
    );
}

export default Product;
