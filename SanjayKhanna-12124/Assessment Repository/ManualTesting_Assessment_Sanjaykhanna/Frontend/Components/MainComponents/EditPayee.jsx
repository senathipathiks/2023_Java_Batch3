import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import payeeService from '../../Services/PayeeService';
import Output from '../UtilitiesComponents/Output';



const EditPayee = (props) => {
    const [insertData, setInsertData] = useState({
        payeeId: "",
        payeeName: "",
        nickName: "",
        accountNumber: ""
    });

    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg, setMsg] = useState("");
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()
    const id = props.id

    useEffect(() => {
        payeeService.doGet(id).then((res) => {
            setInsertData(res.data)
        }).catch((err)=>{
            console.log(err)
        })
    },[id])

    const handleUpdate = (e) => {
        e.preventDefault();
        setFlag(false)
        payeeService.doAdd(insertData).then((res) => {
            if (res.data === "success") {
                setMsg("Successfully updated the Payee Information")
                setRightFlag(true)
            }
            else {
                setMsg("Failed to update the Payee Information!")
                setWrongFlag(true)
            }
        })
    }


    return (
        <div>
            <Dialog
                open={flag}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleUpdate(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Insert</DialogTitle>
                <DialogContent>
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="payeeName"
                        name="payeeName"
                        label="Full Name"
                        autoComplete='off'
                        type="text"
                        value={insertData.payeeName}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="nickName"
                        name="nickName"
                        label="Nick Name"
                        autoComplete='off'
                        value={insertData.nickName}
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
                        id="accountNumber"
                        name="accountNumber"
                        label="Account Number"
                        type="number"
                        fullWidth
                        value={insertData.accountNumber}
                        variant="standard"
                        helperText={insertData.accountNumber ? "Account Number should be 10 digits" : ""}
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Add</Button>
                </DialogActions>
            </Dialog>
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default EditPayee;
