import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useState } from 'react';
import departmentService from '../../Services/DepartmentServices';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const AddDepartment = (props) => {

    const [flag, setFlag] = useState(props.Flags.isAddable);
    const [updateData,setUpdateData] = useState({
        deptName:"",
        deptHead:""
    })
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const handleInsert = (e) => {
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(() => {
            setLoadingFlag(false)
            departmentService.doCreate(updateData).then((res) => {
                if (res.data === "success") {
                    setMsg("Successfully added the Department information.")
                    setRightFlag(true)
                }
                else {
                    setMsg("Failed to add the Department Information!")
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
                        id="deptName"
                        name="deptName"
                        label="Department Name"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setUpdateData({ ...updateData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        className="mt-3"
                        autoFocus
                        required
                        id="deptHead"
                        name="deptHead"
                        label="Department Head"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setUpdateData({ ...updateData, [e.target.name]: e.target.value }) }}
                    />
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

export default AddDepartment;
