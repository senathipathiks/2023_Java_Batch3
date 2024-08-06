import * as React from 'react';
import Avatar from '@mui/material/Avatar';
import Button from '@mui/material/Button';
import CssBaseline from '@mui/material/CssBaseline';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import { NavLink, useNavigate, useParams } from "react-router-dom";
import Person2Icon from '@mui/icons-material/Person2';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
import { useEffect } from 'react';
import { useState } from 'react';


const defaultTheme = createTheme();


export default function UserLogin() {

    let navigate = useNavigate();

    const { userId } = useParams()


    const [users, setusers] = useState({
        userId: "",
        userName: "",
        userMobile: "",
        userEmail: "",
        userAddress: ""
    })

    const onInputChange = (e) => {
        setusers({ ...users, [e.target.name]: e.target.value });
    };

    const winid = sessionStorage.getItem("userId");
    console.log(winid);


    const loadAllUsers = async (e) => {
        await axios
            .get(`http://localhost:8080/GetByUserId/${winid}`)

            .then((res) => setusers(res.data))

            .catch((err) => console.log(err));
    };

    const onSubmit = async (e) => {


        e.preventDefault();
        await axios.put(`http://localhost:8080/updateUser`, users)
        // alert('User Details Updated Succesfully !!')
        navigate('/userprofile');
    }





    useEffect(() => {
        loadAllUsers();
    }, []);





    return (
        <>

            <nav className="navbar">
                <div className="nav-container">
                    <NavLink exact to="/" className="nav-logo">
                        <span><IoMdJet />  Tourism Management System
                        </span>
                        <span className="icon">
                        </span>
                    </NavLink>

                    <ul className="nav-item"
                    >

                        <NavLink
                            exact
                            to="/viewtour"
                            activeClassName="active"
                            className="nav-links"
                        >
                            <ArrowLeftIcon />Back to Home
                        </NavLink>



                    </ul>

                </div>
            </nav>
            <ThemeProvider theme={defaultTheme}>
                <Container component="main" maxWidth="xs">
                    <CssBaseline />
                    <Box
                        sx={{
                            marginTop: 8,
                            display: 'flex',
                            flexDirection: 'column',
                            alignItems: 'center',
                        }}
                    >
                        <Avatar sx={{ m: 1, bgcolor: 'black' }}>
                            <Person2Icon />
                        </Avatar>
                        <Typography component="h1" variant="h5">
                            Edit Information<br />
                        </Typography>
                        <form onSubmit={onSubmit}>
                            <Box noValidate sx={{ mt: 1 }}>
                                {/* <Grid item xs={12} md={6}>

                                        <TextField
                                            margin="normal"
                                            required
                                            fullWidth
                                            id="email"
                                            value={userId}
                                            label="Enter UserId"
                                            name="userId"
                                            aria-readonly
                                            onChange={(e) => onInputChange(e)}
                                            autoFocus
                                        />
                                    </Grid> */}
                                <Grid container spacing={1}>


                                    <TextField
                                        margin="normal"
                                        required
                                        fullWidth
                                        id="email"
                                        value={users.userName}
                                        label="Enter UserName"
                                        name="userName"
                                        onChange={(e) => onInputChange(e)}
                                        autoComplete="email"
                                        autoFocus
                                    />
                                </Grid>
                                <Grid container spacing={1}>
                                    <Grid item xs={12} md={6}>

                                        <TextField
                                            margin="normal"
                                            required
                                            fullWidth
                                            value={users.userMobile}
                                            name="userMobile"
                                            label="Enter User Mobile Number"
                                            type="text"
                                            onChange={(e) => onInputChange(e)}

                                            autoComplete="current-password"
                                        />
                                    </Grid>
                                    <Grid item xs={12} md={6}>

                                        <TextField
                                            margin="normal"
                                            required
                                            fullWidth
                                            value={users.userAddress}
                                            name="userAddress"
                                            label="Enter User Address"
                                            type="text"
                                            onChange={(e) => onInputChange(e)}

                                            autoComplete="current-password"
                                        />
                                    </Grid>
                                </Grid>
                                <Grid item xs={12} md={6}>

                                    <TextField
                                        margin="normal"
                                        required
                                        fullWidth
                                        id="email"
                                        value={users.userEmail}
                                        label="Enter Email"
                                        name="userEmail"
                                        onChange={(e) => onInputChange(e)}
                                        autoComplete="email"
                                        autoFocus

                                    />
                                </Grid>

                                <Button

                                    type="submit"
                                    fullWidth
                                    variant="contained"
                                    sx={{ mt: 3, mb: 2, bgcolor: 'black' }}
                                >
                                    UPDATE
                                </Button>
                                <Grid container>


                                </Grid>
                            </Box>
                        </form>

                    </Box>
                </Container>
            </ThemeProvider>
        </>
    );
}