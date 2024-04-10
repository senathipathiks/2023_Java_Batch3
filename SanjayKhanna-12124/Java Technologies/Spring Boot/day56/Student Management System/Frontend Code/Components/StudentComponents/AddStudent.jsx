import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, FormControlLabel, FormLabel, InputLabel, MenuItem, Radio, RadioGroup, Select, TextField } from "@mui/material";
import React, { useEffect, useState } from 'react';
import departmentService from '../../Services/DepartmentServices';
import studentService from '../../Services/StudentService';
import Loading from "../UtilitiesComponents/Loading";
import Output from "../UtilitiesComponents/Output";
const AddStudent = (props) => {

    const [flag, setFlag] = useState(props.Flags.isAddable);
    const [deptData, setDeptData] = useState([]);
    const [msg, setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const [insertData, setInsertData] = useState({
        stuName: "",
        stuAge: 0,
        stuGender: "",
        department: {
            deptId: 0
        }
    })

    useEffect(() => {
        departmentService.doReadAllDepartment()
            .then((res) => { setDeptData(res.data) })
            .catch((err) => console.log("Error:" + err))
    },[])

    const handleInsert = (e) => {
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(() => {
            setLoadingFlag(false)
            studentService.doCreate(insertData).then((res) => {
                if (res.data === "success") {
                    setMsg("Successfully added the Student information.")
                    setRightFlag(true)
                }
                else {
                    setMsg("Failed to add the Student Information!")
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
                        id="stuName"
                        name="stuName"
                        label="Student Name"
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
                        id="stuAge"
                        name="stuAge"
                        label="Age"
                        autoComplete="off"
                        type="number"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <FormControl className="mt-3">
                        <FormLabel id="gender-label">Gender</FormLabel>
                        <RadioGroup
                            row
                            aria-labelledby="gender-label"
                            name="stuGender"
                            onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                        >
                            <FormControlLabel value="Female" required control={<Radio />} label="Female" />
                            <FormControlLabel value="Male" required control={<Radio />} label="Male" />
                        </RadioGroup>
                    </FormControl>
                    <FormControl fullWidth className='mt-3'>
                        <InputLabel id="dept-label">Department</InputLabel>
                        <Select
                            labelId="dept-label"
                            id='deptId'
                            name={'deptId'}
                            label="Department"
                            required
                            onChange={(e) => { setInsertData({ ...insertData, department: { [e.target.name]: e.target.value } }) }}
                        >
                            {deptData.map((item) => (<MenuItem key={item.deptId} value={item.deptId}>{item.deptName}</MenuItem>))}
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

export default AddStudent;
