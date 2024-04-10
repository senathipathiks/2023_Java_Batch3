import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import customerService from '../../Services/CustomerService';
import productService from '../../Services/ProductService';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';


const AddCustomer = (props) => {

    useEffect(() => {
        productService.doReadAll()
            .then((res) =>{setProductData(res.data)})
            .catch((err) => console.log(err))
    }, [])

    const [insertData, setInsertData] = useState({
        customerName: "",
        customerContactNo: 0,
        paymentMethod: "",
        product: {
            productId: 0,
        }
    });

    const [flag, setFlag] = useState(props.Flags.isAddable);
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()
    const [productData, setProductData] = useState([]);

    const handleInsert = (e) =>{
        e.preventDefault();
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(() => {
            setLoadingFlag(false)
            customerService.doCreate(insertData).then((res) => {
                if (res.data === "success") {
                    setMsg("Successfully added the Customer Information")
                    setRightFlag(true)
                }
                else {
                    setMsg("Failed to add the Customer Information!")
                    setWrongFlag(true)
                }
            })
        }, 2000)
    }


    return (
        <div>
            <Dialog
                open={flag}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleInsert(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Insert</DialogTitle>
                <DialogContent>
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="customerName"
                        name="customerName"
                        label="Customer Name"
                        autoComplete='off'
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        autoComplete='off'
                        id="customerContactNo"
                        name="customerContactNo"
                        label="Contact Number"
                        type="number"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <FormControl fullWidth className="mt-3">
                        <InputLabel id="payment-label">Payment Method</InputLabel>
                        <Select
                            labelId="payment-label"
                            id='paymentMethod'
                            name='paymentMethod'
                            label="Choose Payment Method"
                            required
                            onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
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
                            id='productId'
                            name='productId'
                            label='Choose Product'
                            required
                            onChange={(e) => { setInsertData({ ...insertData, product: { [e.target.name]: e.target.value } }) }}
                        >
                            {productData.map((item) => (<MenuItem key={item.productId} value={item.productId}>{item.productName}</MenuItem>))}
                        </Select>
                    </FormControl>
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Insert</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default AddCustomer;
