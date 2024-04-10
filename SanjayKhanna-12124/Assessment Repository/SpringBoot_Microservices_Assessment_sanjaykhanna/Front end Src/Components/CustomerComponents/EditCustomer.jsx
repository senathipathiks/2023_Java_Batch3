import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import customerService from '../../Services/CustomerService';
import productService from '../../Services/ProductService';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const EditCustomer = (props) => {

    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()
    const [productData, setProductData] = useState([]);

    const [data, setData] = useState({
        customerId:0,
        customerName: "",
        customerContactNo: 0,
        paymentMethod: "",
        product: {
            productId: 0,
        }
    });

    useEffect(() => {
        productService.doReadAll()
            .then((res) => setProductData(res.data))
            .catch((err) => console.log(err))
    }, [])


    useEffect(()=>{
        customerService.doRead(props.id)
        .then((res)=>setData(res.data))
        .catch((err)=>{console.error(err)})
    },[props.id])

    const handleEdit = (e) => {
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            customerService.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Customer information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Customer Information!")
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
                        margin="dense"
                        id="customerName"
                        name="customerName"
                        label="Customer Name"
                        autoComplete="off"
                        type="text"
                        value={data.customerName}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        margin="dense"
                        id="customerContactNo"
                        name="customerContactNo"
                        label="Contact Number"
                        autoComplete="off"
                        type="number"
                        value={data.customerContactNo}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <FormControl fullWidth className="mt-3">
                        <InputLabel id="payment-label">Payment Method</InputLabel>
                        <Select
                            labelId="payment-label"
                            id='paymentMethod'
                            name='paymentMethod'
                            label="Choose Payment Method"
                            value={data.paymentMethod}
                            required
                            onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                        >
                            <MenuItem value="Cash">Cash</MenuItem>
                            <MenuItem value="GPay">GPay</MenuItem>
                            <MenuItem value="PayTM">PayTM</MenuItem>
                            <MenuItem value="AmazonPay">AmazonPay</MenuItem>
                            <MenuItem value="NetBanking">NetBanking</MenuItem>
                        </Select>
                    </FormControl>
                    <FormControl fullWidth className='mt-3'>
                        <InputLabel id="product-label">Product Name</InputLabel>
                        <Select
                            labelId="product-label"
                            id='productName'
                            name='productName'
                            label='Choose Product'
                            required
                            value={data.product.productId}
                            onChange={(e) => { setData({ ...data, product: { [e.target.name]: e.target.value } }) }}
                        >
                            {productData.map((item) => (<MenuItem key={item.productId} value={item.productId}>{item.productName}</MenuItem>))}
                        </Select>
                    </FormControl>
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

export default EditCustomer;
