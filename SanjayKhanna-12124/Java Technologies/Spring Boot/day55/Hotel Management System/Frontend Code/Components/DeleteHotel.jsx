import { Alert, Button, Dialog, DialogActions, DialogTitle } from "@mui/material";
import { React, useState } from 'react';
import hotelServices from '../Service/HotelServices';
import Loading from "./Loading";
import Output from "./Output";

const DeleteHotel = (props) => {

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
            hotelServices.doDelete(props.id).then((res)=>{
                if (res.data === "success"){
                    setMsg("Successfully Deleted the Hotel information.")
                    setRightFlag(true)
                }
            else {
                setMsg("Failed to Delete the Hotel!")
                setWrongFlag(true)
            }
            })
        },3000)

    }

    return (
        <div>
            <Dialog
                open={flag}
                onClose={() => { window.location.reload() }}
            >
                <DialogTitle>
                    <Alert severity="error">
                        Are you confirm to delete ?
                    </Alert>
                </DialogTitle>
                <DialogActions className="d-flex d-flex justify-content-between">
                    <Button onClick={() => { window.location.reload()}} variant="contained" >Cancel</Button>
                    <Button onClick={(e) => { handleDelete(e) }} variant="contained" color="success">Confirm</Button>
                </DialogActions>
            </Dialog>
            {<Loading flag={loadingFlag} />}
            { (rightFlag || wrongFlag) && <Output success={rightFlag} fail={wrongFlag} msg={msg} />}
        </div>
    );
}

export default DeleteHotel;
