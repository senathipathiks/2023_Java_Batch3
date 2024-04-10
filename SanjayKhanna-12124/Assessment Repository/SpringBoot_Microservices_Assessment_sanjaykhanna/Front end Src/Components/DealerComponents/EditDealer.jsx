import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import dealerService from '../../Services/DealerService';
import productService from '../../Services/ProductService';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const EditDealer = (props) => {

    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()
    const [productData, setProductData] = useState([]);

    const [data, setData] = useState({
        dealerId:0,
        dealerName: "",
        dealerContactNo: 0,
        dealerAddress:"",
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
        dealerService.doRead(props.id)
        .then((res)=>setData(res.data))
        .catch((err)=>{console.error(err)})
    },[props.id])

    const handleEdit = (e) => {
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            dealerService.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Dealer information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Dealer!")
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
                        id="dealerName"
                        name="dealerName"
                        label="Dealer Name"
                        autoComplete="off"
                        type="text"
                        value={data.dealerName}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        margin="dense"
                        id="dealerContactNo"
                        name="dealerContactNo"
                        label="Contact Number"
                        autoComplete="off"
                        type="number"
                        value={data.dealerContactNo}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />

                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        margin="dense"
                        id="dealerAddress"
                        name="dealerAddress"
                        label="Address"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        value={data.dealerAddress}
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />

                    <FormControl fullWidth className='mt-3'>
                        <InputLabel id="product-label">Product Name</InputLabel>
                        <Select
                            labelId="product-label"
                            id='productId'
                            name='productId'
                            label='Choose Product'
                            required
                            value={data.product.productId}
                            onChange={(e) => { setData({ ...data, product:{[e.target.name]: e.target.value }}) }}
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

export default EditDealer;
