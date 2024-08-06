import HowToRegIcon from '@mui/icons-material/HowToReg';
import Avatar from "@mui/material/Avatar";
import Box from "@mui/material/Box";
import Button from "@mui/material/Button";
import Checkbox from "@mui/material/Checkbox";
import CssBaseline from "@mui/material/CssBaseline";
import FormControlLabel from "@mui/material/FormControlLabel";
import Grid from "@mui/material/Grid";
import Paper from "@mui/material/Paper";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import TextField from "@mui/material/TextField";
import Typography from "@mui/material/Typography";
import axios from 'axios';
import * as React from "react";
import { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';


const theme = createTheme();
export default function UserRegister() {

    let navigate = useNavigate();
    const [regi, setRegi] = useState({
        userName: '',
        userPassword: '',
        userMobile: '',
        userEmail: '',
        userAddress: ''
    });

    const [errors, setErrors] = useState({});

    const handleChange = (event) => {
        setRegi({ ...regi, [event.target.name]: event.target.value });
    };

    const handleBlur = (event) => {
        const { name, value } = event.target;
        let error = '';

        switch (name) {
            case 'userName':
                if (!value) error = 'Username is required';
                else if (value.length < 3) error = 'Username must be at least 3 characters long';
                break;
            case 'userPassword':
                if (!value) error = 'Password is required';
                else if (value.length < 6) error = 'Password must be at least 6 characters long';
                break;
            case 'userMobile':
                if (!value) error = 'Mobile number is required';
                else if (value.length >10 || !value.match(/^[0-9]+$/)) error = 'Mobile number should be numeric & 10 characters long';
                break;
            case 'userEmail':
                if (!value) error = 'Email is required';
                else if (!/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i.test(value)) error = 'Invalid email address';
                break;
            case 'userAddress':
                if (!value) error = 'Address is required';
                break;
            default:
                break;
        }

        setErrors({ ...errors, [name]: error });
    };
    const handleSubmit = async (e) => {
        e.preventDefault();
        console.log(regi);
        const response = await axios.post(`http://localhost:8080/doUserInsert`, regi)
        console.log(response.data);
        navigate('/user');
    };



    return (

        <ThemeProvider theme={theme}>
            <Grid container component="main" sx={{ height: "100vh" }}>
                <CssBaseline />
                <Grid
                    item
                    xs={false}
                    sm={3}
                    md={7}
                    sx={{
                        backgroundImage:
                            "url(https://wallpapercave.com/wp/wp4782910.jpg)",
                        backgroundRepeat: "no-repeat",
                        backgroundColor: (t) =>
                            t.palette.mode === "light"
                                ? t.palette.grey[50]
                                : t.palette.grey[900],
                        backgroundSize: "cover",
                        backgroundPosition: "center",
                    }}
                />
                <Grid item xs={12} sm={8} md={5} component={Paper} elevation={6} square>
                    <Box
                        sx={{
                            my: 8,
                            mx: 4,
                            display: "flex",
                            flexDirection: "column",
                            alignItems: "center",
                        }}
                    >
                        <Avatar sx={{ m: 1, md: 5, bgcolor: "black" }}>
                            <HowToRegIcon />
                        </Avatar>
                        <Typography component="h1" variant="h5">
                            USER REGISTRATION
                        </Typography><br />
                        <form onSubmit={handleSubmit} >
                            <Grid container spacing={2} >
                                <Grid item xs={12} sm={6}>
                                    <TextField
                                        autoComplete="given-name"
                                        name="userName"
                                        fullWidth
                                        id="firstName"
                                        type="text"
                                        value={regi.userName}
                                        onChange={handleChange}
                                        onBlur={handleBlur}
                                        helperText={errors.userName}
                                        error={errors.userName ? true : false}

                                        label="Enter your User Name"

                                        autoFocus
                                        required

                                    />
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField
                                        required
                                        fullWidth
                                        id="lastName"
                                        label="Enter Password"
                                        type='password'
                                        name="userPassword"
                                        value={regi.userPassword}
                                        onChange={handleChange}
                                        onBlur={handleBlur}
                                        error={errors.userPassword ? true : false}
                                        autoComplete="family-name"

                                    />
                                </Grid>
                                <Grid item xs={12}>
                                    <TextField
                                        required
                                        fullWidth
                                        id="scheme"
                                        label="Enter Mobile Number"
                                        name="userMobile"
                                        value={regi.userMobile}
                                        onChange={handleChange}
                                        onBlur={handleBlur}
                                        error={errors.userMobile ? true : false}

                                        helperText={errors.userMobile} autoComplete="scheme"

                                    />
                                </Grid>
                                <Grid item xs={12}>
                                    <TextField
                                        required
                                        fullWidth
                                        id='mail'
                                        name="userEmail"
                                        label="Enter Your Email"
                                        value={regi.userEmail}
                                        onChange={handleChange}
                                        onBlur={handleBlur}
                                        error={errors.userEmail ? true : false}

                                        helperText={errors.userEmail} type="text"
                                        autoComplete="cause"

                                    />
                                </Grid>
                                <Grid item xs={12}>
                                    <TextField
                                        required
                                        id='address'
                                        fullWidth
                                        name="userAddress"
                                        label="Address"
                                        onChange={handleChange}
                                        type="text"
                                        onBlur={handleBlur}
                                        error={errors.userAddress ? true : false}

                                        helperText={errors.userAddress}
                                        autoComplete="cause"
                                    />
                                </Grid>

                                <Grid item xs={12}>
                                    <FormControlLabel
                                        // required
                                        control={
                                            <Checkbox value="allowExtraEmails" color="primary" />
                                        }
                                        label="I acknowledge the above details are correct"
                                    />
                                </Grid>
                            </Grid>
                            <Button
                                type="submit"
                                fullWidth
                                id='signup'
                                variant="contained"
                                sx={{ mt: 3, mb: 2, bgcolor: 'black' }}
                            >
                                SIGN UP
                            </Button>
                        </form>

                        <Grid container justifyContent="flex-end">
                            <Grid item>
                                <Link to="/user" variant="body2">
                                    Already have an account click here !
                                </Link>
                            </Grid>
                        </Grid>
                    </Box>
                </Grid>
            </Grid>
        </ThemeProvider>
    );
}