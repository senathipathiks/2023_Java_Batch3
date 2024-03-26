import { Button, Dialog, DialogActions, DialogContent, DialogTitle, FormControl, FormControlLabel, FormLabel, InputLabel, MenuItem, Radio, RadioGroup, Select, TextField } from "@mui/material";
import { React, useEffect, useState } from 'react';
import departmentService from "../../Services/DepartmentServices";
import studentService from "../../Services/StudentService";
import Loading from "../UtilitiesComponents/Loading";
import Output from "../UtilitiesComponents/Output";


const EditStudent = (props) => {

    const [flag, setFlag] = useState(props.Flags.isEditable);
    const [deptData, setDeptData] = useState([]);
    const [msg,setMsg] = useState("");
    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState();
    const [wrongFlag, setWrongFlag] = useState();
    const [data, setData] = useState({
        stuId:0,
        stuName: "",
        stuAge: 0,
        stuGender: "",
        department: {
            deptId: 0,
            deptName:"",
            deptHead:"",
        }
    });

    useEffect(() => {
        departmentService.doReadAllDepartment()
            .then((res) => { setDeptData(res.data) })
            .catch((err) => console.log("Error:" + err))
    },[])

    useEffect(()=>{
        studentService.doRead(props.id)
        .then((res)=>{setData(res.data)})
        .catch((err)=>console.log(err))
    },[props.id])

    const  handleEdit= (e)=>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            studentService.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Student information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Student!")
                setWrongFlag(true)
            }
            })
        },2000)
    }
    return (
        <div>
            <Dialog
                open={flag}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleEdit(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Update</DialogTitle>
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
                        value={data.stuName}
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
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
                        value={data.stuAge}
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <FormControl className="mt-3">
                        <FormLabel id="gender-label">Gender</FormLabel>
                        <RadioGroup
                            row
                            aria-labelledby="gender-label"
                            name="stuGender"
                            value={data.stuGender}
                            onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
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
                            name='deptId'
                            label="Department"
                            required
                            value={data.department.deptId}
                            onChange={(e) => { setData({ ...data, department: { [e.target.name]: e.target.value } }) }}
                        >
                            {deptData.map((item) => (<MenuItem key={item.deptId} value={item.deptId}>{item.deptName}</MenuItem> )
                            )}
                        </Select>
                    </FormControl>
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Update</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            {(rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default EditStudent;
