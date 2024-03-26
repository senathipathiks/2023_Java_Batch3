import { Button, Dialog, DialogActions, DialogContent, DialogTitle, TextField } from "@mui/material";
import InputAdornment from '@mui/material/InputAdornment';
import { React, useEffect, useState } from 'react';
import hotelServices from "../Service/HotelServices";
import Loading from "./Loading";
import Output from "./Output";

const UpdateHotel = (props) => {

    const [flag, setFlag] = useState(props.Flags.isEditable);

    const [msg,setMsg] = useState("");

    const [data, setData] = useState({
        hotelId: 0,
        hotelName: "",
        hotelLocation: "",
        hotelRating: 0,
        phoneNumber: 0
    })

    useEffect(() => {
        hotelServices.doGet(props.id).then((res) => { setData(res.data) }).catch((err) => console.log(err))
    }, [props.id])

    const [loadingFlag, setLoadingFlag] = useState(false)
    const [rightFlag, setRightFlag] = useState()
    const [wrongFlag, setWrongFlag] = useState()

    const  handleEdit= (e)=>{
        e.preventDefault()
        setFlag(false)
        setLoadingFlag(true)
        setTimeout(()=>{
            setLoadingFlag(false)
            hotelServices.doUpdate(data).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Updated the Hotel information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Update the Hotel!")
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
                    onSubmit: (e) => handleEdit(e),
                }}
            >
                <DialogTitle className="text-center h2">Enter details to Insert</DialogTitle>
                <DialogContent>
                <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="hotelId"
                        name="hotelId"
                        label="Hotel Id"
                        autoComplete="off"
                        type="text"
                        fullWidth
                        variant="standard"
                        value={data.hotelId}
                        disabled
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="hotelName"
                        name="hotelName"
                        label="Hotel Name"
                        autoComplete="off"
                        value={data.hotelName}
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="hotelLocation"
                        name="hotelLocation"
                        label="Hotel Location"
                        autoComplete="off"
                        value={data.hotelLocation}
                        type="text"
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        type="number"
                        margin="dense"
                        id="hotelRating"
                        name="hotelRating"
                        label="Hotel Rating"
                        autoComplete="off"
                        value={data.hotelRating}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                    <TextField
                        autoFocus
                        required
                        margin="dense"
                        id="phoneNumber"
                        name="phoneNumber"
                        label="Contact Number"
                        autoComplete="off"
                        value={data.phoneNumber}
                        type="Number"
                        InputProps={{
                            startAdornment: <InputAdornment position="start">+91</InputAdornment>,
                        }}
                        fullWidth
                        variant="standard"
                        onChange={(e) => { setData({ ...data, [e.target.name]: e.target.value }) }}
                    />
                </DialogContent>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload() }} variant="contained" >Cancel</Button>
                    <Button type="submit" variant="contained" color="success">Update</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            { (rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default UpdateHotel;
