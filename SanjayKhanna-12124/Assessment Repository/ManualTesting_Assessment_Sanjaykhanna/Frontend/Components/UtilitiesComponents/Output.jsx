import { Alert, Snackbar } from "@mui/material";
import React from 'react';

const Output = (props) => {
    

    return (
        <div>
            <Snackbar open={props.success} autoHideDuration={6000} anchorOrigin={{ vertical: "bottom", horizontal: "left" }} onClose={() => { window.location.reload() }}>
                <Alert
                    onClose={() => { window.location.reload() }}
                    severity="success"
                    variant="filled"
                    sx={{ width: '100%' }}
                >
                    {props.msg}
                </Alert>
            </Snackbar>
            <Snackbar open={props.fail} autoHideDuration={6000} anchorOrigin={{ vertical: "bottom", horizontal: "left" }} style={{ marginTop: "115px" }} onClose={() => { window.location.reload() }}>
                <Alert
                    onClose={() => { window.location.reload() }}
                    severity="error"
                    variant="filled"
                    sx={{ width: '100%' }}
                >
                    {props.msg}
                </Alert>
            </Snackbar>
        </div>
    );
}

export default Output;
