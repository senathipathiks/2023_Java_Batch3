import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useState } from 'react';
import Output from '../UtilitiesComponents/Output';

const {doAdd} = require("../Services/Services")

const AddPayee = (props) => {

    const [insertData, setInsertData] = useState({
        payeeName: "",
        nickName: "",
        account: {
            accountNumber: ""
        }

    });

    const [flag, setFlag] = useState(props.Flags.isAddable);
    const [msg, setMsg] = useState("");
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const handleInsert = (e) => {
        e.preventDefault();
        setFlag(false)
        console.log(insertData)
        doAdd(insertData).then((res) => {
            if (res.data === "success") {
                setMsg("Successfully added the Payee Information")
                setRightFlag(true)
            }
            else {
                setMsg("Failed to add the Payee Information!")
                setWrongFlag(true)
            }
        }).catch((err) => {
            console.log(err)
        })
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
                        id="payeeName"
                        name="payeeName"
                        label="Full Name"
                        aria-label="Full Name"
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
                        id="nickName"
                        name="nickName"
                        label="Nick Name"
                        aria-label="Nick Name"
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
                        id="accountNumber"
                        name="accountNumber"
                        label="Account Number"
                        aria-label="Account Number"
                        type="number"
                        fullWidth
                        variant="standard"
                        error= {insertData.account.accountNumber ? insertData.account.accountNumber.length !== 10 : false}
                        helperText={insertData.account.accountNumber ? "Account Number should be 10 digits && Cannot be updatable" : ""}
                        onChange={(e) => { setInsertData({ ...insertData, account:{ [e.target.name]: e.target.value }}) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" data-testid="addBtn" color="success">Add</Button>
                </DialogActions>
            </Dialog>
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default AddPayee;
