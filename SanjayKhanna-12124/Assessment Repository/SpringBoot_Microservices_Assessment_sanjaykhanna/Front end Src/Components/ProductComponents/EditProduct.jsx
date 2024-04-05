import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import productService from '../../Services/ProductService';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const EditProduct = (props) => {
    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const [data,setData] = useState({
        productId:0,
        productName: "",
        productType:"",
        quantity:  0,
        price:0
    });

    useEffect(()=>{
        productService.doRead(props.id)
        .then((res)=>{setData(res.data)})
        .catch((err)=>console.log(err))
    },[props.id])

    const  handleEdit= (e)=>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            productService.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Product information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Product information!")
                setWrongFlag(true)
            }
            })
        },2000)
    }

    return (
        <div>
            <Dialog
                open={flag}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleEdit(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Update</DialogTitle>
                <DialogContent>
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="productName"
                        name="productName"
                        label="Product Name"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        value={data.productName}
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="productType"
                        name="productType"
                        label="Product Type"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        value={data.productType}
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="quantity"
                        name="quantity"
                        label="Quantity"
                        autoComplete="off"
                        type="number"
                        fullWidth
                        value={data.quantity}
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="price"
                        name="price"
                        label="Price"
                        autoComplete="off"
                        type="number"
                        fullWidth
                        value={data.price}
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Update</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default EditProduct;
