import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import dealerService from '../../Services/DealerService';
import productService from '../../Services/ProductService';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const AddDealer = (props) => {

    const [insertData, setInsertData] = useState({
        dealerName: "",
        dealerContactNo: 0,
        dealerAddress:"",
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

    useEffect(() => {
        productService.doReadAll()
            .then((res) => setProductData(res.data))
            .catch((err) => console.log(err))
    }, [])

    const handleInsert = (e) =>{
        e.preventDefault();
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(() => {
            setLoadingFlag(false)
            dealerService.doCreate(insertData).then((res) => {
                if (res.data === "success") {
                    setMsg("Successfully added the Dealer Information.")
                    setRightFlag(true)
                }
                else {
                    setMsg("Failed to add the Dealer Information!")
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
                        margin="dense"
                        id="dealerName"
                        name="dealerName"
                        label="Dealer Name"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
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
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
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
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />

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

export default AddDealer;
