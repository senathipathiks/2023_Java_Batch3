import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from "@mui/material";
import InputAdornment from '@mui/material/InputAdornment';
import React, { useState } from 'react';
import hotelServices from "../Service/HotelServices";
import Loading from "./Loading";
import Output from "./Output";
const AddHotel = (props) => {

    const [flag, setFlag] = useState(props.Flags.isAddable);

    const [errHandle,setErrHandle] = useState({
        ratingErr:false,
        phoneNumberErr: false
    })

    const [msg,setMsg] = useState("");
    const [loadingFlag,setLoadingFlag] = useState(false)
    const [rightFlag,setRightFlag]= useState()
    const [wrongFlag,setWrongFlag]=useState()

    const [insertData,setInsertData] = useState({
        hotelName:"",
        hotelLocation:"",
        hotelRating:0,
        phoneNumber:0
    })

    const handleError = (e) =>{
        e.preventDefault()
        if(e.target.name==="phoneNumber"){
            let value= e.target.value;
            if(!(/^[789]\d{9}$/.test(value))){
                setErrHandle({...errHandle,phoneNumberErr : true})
            }else {
                setErrHandle({...errHandle,phoneNumberErr : false}) 
            } 
            
        }
        if(e.target.name==="hotelRating"){
            let value= e.target.value;
            if(value<1||value>5 || isNaN(parseInt(value))) {
                setErrHandle({...errHandle,ratingErr :true})    
            }else{
                setErrHandle({...errHandle,ratingErr : false})    
            }
        }
    }

    const  handleInsert= (e)=>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            hotelServices.doAdd(insertData).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully added the Hotel information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to add the Hotel!")
                setWrongFlag(true)
            }
            })
        },3000)
    }

    return (
        <div>
        <Dialog
                open={flag}
                onClose={() => {window.location.reload()}}
                PaperProps={{
                    component: 'form',
                    onSubmit: (e) => handleInsert(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Insert</DialogTitle>
                <DialogContent>
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="hotelName"
                        name="hotelName"
                        label="Hotel Name"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="hotelLocation"
                        name="hotelLocation"
                        label="Hotel Location"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        type="text"
                        margin="dense"
                        id="hotelRating"
                        name="hotelRating"
                        label="Hotel Rating"
                        error={errHandle.ratingErr}
                        helperText={ errHandle.ratingErr && "Please enter a valid rating. Enter value between 1-5"}
                        autoComplete="off"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value });handleError(e) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="phoneNumber"
                        name="phoneNumber"
                        label="Contact Number"
                        autoComplete="off"
                        type="Number"
                        error={errHandle.phoneNumberErr}
                        helperText={ errHandle.phoneNumberErr && "Please enter a valid phone number"}
                        InputProps={{
                            startAdornment: <InputAdornment position="start">+91</InputAdornment>,
                        }}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setInsertData({ ...insertData, [e.target.name]: e.target.value });handleError(e) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" disabled={errHandle.ratingErr||errHandle.phoneNumberErr} color="success">Insert</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            { (rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
            </div>
    );
}

export default AddHotel;
