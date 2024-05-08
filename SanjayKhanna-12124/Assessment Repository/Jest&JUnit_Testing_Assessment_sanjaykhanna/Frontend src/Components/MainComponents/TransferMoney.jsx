import { Button, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import InputAdornment from '@mui/material/InputAdornment';
import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import Output from '../UtilitiesComponents/Output';
const services = require('../Services/Services')

const TransferMoney = () => {

    
    const [payeeData, setPayeeData] = useState([]);
    const [insertData, setInsertData] = useState({
        amount: '',
        payee: {
            payeeId: ''
        }
    })

    const [msg, setMsg] = useState("");
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()


    useEffect(() => {
        
        services.doGetAllPayee().then((res)=>{
            return res.data;
        }).then((resp)=>{
            setPayeeData(resp)
        }).catch(err => {
            console.log(err)
        })
    },[])

    const handleSubmit = (e) =>{
        e.preventDefault();
        services.doSave(insertData).then(res=>{
            if (res.data === "success") {
                setMsg("Transaction Successful")
                setRightFlag(true)
            }
            else {
                setMsg("Transaction Failure!")
                setWrongFlag(true)
            }
        }).catch(err=>{
            console.log(err)
        })
        setTimeout(()=>{
            window.location.href="/"
        },2000)
    }

    return (
        <div>
            <div className='container w-25 p-5 shadow bg-body rounded position-absolute top-50 start-50 translate-middle'>
                <div className='mb-3 text-center h5' data-testid="transferHeader">Enter details to Transfer Money</div>
                <form onSubmit={(e)=>handleSubmit(e)}>
                    <FormControl fullWidth className="mt-3">
                        <InputLabel id="payment-label">Select Payee's Nick Name</InputLabel>
                        <Select
                            labelId="payment-label"
                            id='payeeId'
                            name='payeeId'
                            label="Select Payee's Nick Name"
                            aria-label='payeeId'
                            required
                            onChange={(e) => { setInsertData({ ...insertData, payee: { payeeId: e.target.value } }) }}
                        >
                            {payeeData && payeeData.map(item => <MenuItem key={item.payeeId} value={item.payeeId}>{item.nickName}</MenuItem>)}
                        </Select>
                    </FormControl>
                    <TextField
                        className="mt-3"
                        required
                        autoComplete='off'
                        id="amount"
                        name="amount"
                        label="amount"
                        aria-label='amount'
                        type="number"
                        error= {insertData.amount < 1 && insertData.amount !== "" ? true : false}
                        helperText={insertData.amount < 1 && insertData.amount !== "" ? "Amount should be greater than 0":""}
                        fullWidth
                        InputProps={{
                            startAdornment: <InputAdornment position="start">Rs:</InputAdornment>,
                        }}
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <div className='mt-3'>
                        <Link to="/" className="float-start">
                            <Button variant="contained" color="success" >
                                <i className="bi bi-arrow-left"></i>back
                            </Button>
                        </Link>

                        <Button type="submit"  disabled={insertData.amount <= 0 && insertData.amount !== "" ? true:false} className="float-end" variant="contained">
                            Transfer
                        </Button>
                    </div>
                </form>
            </div>
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default TransferMoney;
