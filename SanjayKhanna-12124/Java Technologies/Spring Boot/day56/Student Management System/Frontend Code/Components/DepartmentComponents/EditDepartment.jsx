import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from '@mui/material';
import React, { useEffect, useState } from 'react';
import departmentService from '../../Services/DepartmentServices';
import Loading from '../UtilitiesComponents/Loading';
import Output from '../UtilitiesComponents/Output';

const EditDepartment = (props) => {


    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [msg,setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false);
    const [rightFlag, setRightFlag] = useState();
    const [wrongFlag, setWrongFlag] = useState();
    const [data, setData] = useState({
        deptId:0,
        deptName:"",
        deptHead:""
    });

    useEffect(()=>{
        departmentService.doRead(props.id)
        .then((res)=>{setData(res.data)})
        .catch((err)=>console.log(err))
    },[props.id])

    const  handleEdit= (e)=>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            departmentService.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Department information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Department!")
                setWrongFlag(true)
            }
            })
        },3000)
    }

    return (
        <div>
            <Dialog
                open={flag}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleEdit(e)
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
                        value={data.deptName}
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
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
                        value={data.deptHead}
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">update</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default EditDepartment;
