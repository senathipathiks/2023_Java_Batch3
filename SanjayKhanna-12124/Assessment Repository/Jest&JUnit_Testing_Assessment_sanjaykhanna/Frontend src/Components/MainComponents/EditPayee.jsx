import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import Output from '../UtilitiesComponents/Output';

const services = require('../Services/Services')

const EditPayee = (props) => {
    const [data, setData] = useState({});
    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg, setMsg] = useState("");
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()


    useEffect(() => {
        services.doGetPayee(props.id).then((res) => {
            setData(res.data)
        }).catch((err)=>{
            console.log(err)
        })
    },[props.id])

    const handleUpdate = (e) => {
        e.preventDefault();
        setFlag(false)
        services.doUpdate(data).then((res) => {
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
                <DialogTitle className="text-center h2">Update Details</DialogTitle>
                <DialogContent>
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="payeeName"
                        name="payeeName"
                        label="Full Name"
                        aria-label='Full Name'
                        autoComplete='off'
                        type="text"
                        value={data.payeeName}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="nickName"
                        name="nickName"
                        label="Nick Name"
                        aria-label='Nick Name'
                        autoComplete='off'
                        value={data.nickName}
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" data-testid="editBtn" color="success">Update</Button>
                </DialogActions>
            </Dialog>
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default EditPayee;
