import { Button, FormControl, InputLabel, MenuItem, Select, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import payeeService from '../../Services/PayeeService';
import transactionService from '../../Services/TransactionService';
import Output from '../UtilitiesComponents/Output';

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
        payeeService.doGetAll()
            .then((res) => {
                setPayeeData(res)
            }).catch(err => {
                console.log(err)
            })
    },[])

    const handleSubmit = (e) =>{
        e.preventDefault();
        transactionService.doSave(insertData).then(res=>{
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
        },5000)
    }

    return (
        <div>
            <div className='container w-25 p-5 shadow bg-body rounded position-absolute top-50 start-50 translate-middle'>
                <div className='mb-3 text-center h5'>Enter details to Transfer Money</div>
                <form onSubmit={(e)=>handleSubmit(e)}>
                    <FormControl fullWidth className="mt-3">
                        <InputLabel id="payment-label">Select Payee's Nick Name</InputLabel>
                        <Select
                            labelId="payment-label"
                            id='payeeId'
                            name='payeeId'
                            label="Choose Payment Method"
                            required
                            onChange={(e) => { setInsertData({ ...insertData, payee: { payeeId: e.target.value } }) }}
                        >
                            {payeeData!=null && payeeData.map(item => <MenuItem value={item.payeeId}>{item.nickName}</MenuItem>)}
                        </Select>
                    </FormControl>
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        autoComplete='off'
                        id="amount"
                        name="amount"
                        label="amount"
                        type="number"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <div className='mt-3'>
                        <Link to="/" className="float-start">
                            <Button variant="contained" color="success">
                                <i className="bi bi-arrow-left"></i>back
                            </Button>
                        </Link>

                        <Button type="submit" className="float-end" variant="contained">
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
