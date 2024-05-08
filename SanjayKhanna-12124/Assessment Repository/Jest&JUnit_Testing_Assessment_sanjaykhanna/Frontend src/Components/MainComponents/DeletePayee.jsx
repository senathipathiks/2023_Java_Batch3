import { Alert, Button, Dialog, DialogActions, DialogContent, DialogContentText, DialogTitle } from '@mui/material';
import React, { useState } from 'react';
import Output from '../UtilitiesComponents/Output';

// const { doDelete } = require('../Services/Services')

const services = require('../Services/Services')

const DeletePayee = (props) => {

    const [flag, setFlag] = useState(props.Flags.isDeletable);
    const [msg,setMsg] = useState("");
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const handleDelete = (e) =>{
        e.preventDefault()
        setFlag(false)
            services.doDelete(props.id).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Deleted the Payee Information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Delete the Payee Information!")
                setWrongFlag(true)
            }
            })
    }

    return (
        <div>
            <Dialog
                open={flag}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description"
            >
                <DialogTitle id="alert-dialog-title">
                    <Alert severity="error">
                        Are you confirm to delete ?
                    </Alert>
                </DialogTitle>
                <DialogContent>
                    <DialogContentText data-testid="warning" id="alert-dialog-description">
                        Warning: this action cannot be undone. Are you sure to delete the Payee Data?
                        <br />
                        Warning: Transaction history will deleted for this payee.
                    </DialogContentText>
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} data-testid="cancelBtn" variant="contained" >Cancel</Button>
                    <Button onClick={(e) => { handleDelete(e) }} data-testid="confirmBtn" variant="contained" color="success">Confirm</Button>
                </DialogActions>
            </Dialog>
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default DeletePayee;
