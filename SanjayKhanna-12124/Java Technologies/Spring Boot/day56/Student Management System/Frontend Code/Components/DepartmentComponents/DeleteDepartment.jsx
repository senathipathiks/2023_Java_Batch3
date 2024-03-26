import { Alert, Button, Dialog, DialogActions, DialogContent, DialogContentText, DialogTitle } from '@mui/material';
import React, { useState } from 'react';
import departmentService from '../../Services/DepartmentServices';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const DeleteDepartment = (props) => {
    const [flag, setFlag] = useState(props.Flags.isDeletable);
    const [msg,setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const handleDelete = (e) =>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            departmentService.doDelete(props.id).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Deleted the Department information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Delete the Department!")
                setWrongFlag(true)
            }
            })
        },2000)
    }
    return (
        <div>
            <Dialog
                open={flag}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description"
            >
                <DialogTitle id="alert-dialog-title">
                <Alert severity="error"  className='fs-6'>
                        Are you confirm to delete ?
                    </Alert>
                </DialogTitle>
                <DialogContent>
                    <DialogContentText id="alert-dialog-description">
                        Warning: this action cannot be undone. Are you sure to delete the department?
                        <Alert variant="outlined" severity="warning" className='mt-2' >
                            Note: All the Students Record which belongs to this department will also be deleted.
                        </Alert>
                    </DialogContentText>
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button onClick={(e) => { handleDelete(e) }} variant="contained" color="success">Confirm</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default DeleteDepartment;
