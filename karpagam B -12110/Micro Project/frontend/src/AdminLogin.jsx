import * as React from 'react';
import Avatar from '@mui/material/Avatar';
import Button from '@mui/material/Button';
import CssBaseline from '@mui/material/CssBaseline';
import TextField from '@mui/material/TextField';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import { NavLink, useNavigate } from "react-router-dom";
import AdminPanelSettingsIcon from '@mui/icons-material/AdminPanelSettings';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import { useState } from 'react';
import { IoMdJet } from "react-icons/io";
import axios from 'axios';
import ArrowLeftIcon from '@mui/icons-material/ArrowLeft';

const defaultTheme = createTheme();

export default function AdminLogin() {
  let navigate = useNavigate();

  const [adminName, setadminName] = useState("");
  const [adminPassword, setadminPassword] = useState("");
  const [adminNameError, setadminNameError] = useState("");
  const [adminPasswordError, setadminPasswordError] = useState("");

  const handleAdminNameBlur = () => {
    if (adminName.trim().length === 0) {
      setadminNameError("Username is required");
    } else if (/\d/.test(adminName)) {
      setadminNameError("Username cannot contain digits");
    } else {
      setadminNameError("");
    }
  };

  const handleAdminPasswordBlur = () => {
    if (adminPassword.trim().length === 0) {
      setadminPasswordError("Password is required");
    } else if (adminPassword.length < 8) {
      setadminPasswordError("Password must be at least 8 characters");
    }
    // } else if (!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$/.test(adminPassword)) {
    //   setadminPasswordError("Password must contain at least one uppercase letter, one lowercase letter, and one digit");
    // } 
    else {
      setadminPasswordError("");
    }
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    const data = new FormData(event.currentTarget);
    data.append("adminPassword", adminPassword);

    console.log({
      adminName: data.get("adminName"),
      adminPassword: data.get("adminPassword"),
    });

    sessionStorage.setItem("adminName", data.get("adminName"));
    sessionStorage.setItem("adminPassword", data.get("adminPassword"));

    await axios
      .get(
        `http://localhost:8080/loginadmin/${data.get("adminName")}/${data.get(
          "adminPassword"
        )}`
      )
      .then((res) => {
        if (res.data) {
          console.log(adminName);
          console.log(adminPassword);
          console.log(res.data);
          // alert("Login Successfull");
          navigate("/adminhome");
        } else {

          // alert("Login Failed");

        }
      })
      .catch((err) => console.log(err));
  };



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
          // className={click ? "nav-menu active" : "nav-menu"}
          >

            <NavLink
              exact
              to="/"
              activeClassName="active"
              className="nav-links"
            // onClick={handleClick}
            >
              <ArrowLeftIcon /> Back to Home
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
              <AdminPanelSettingsIcon />
            </Avatar>
            <Typography component="h1" variant="h5">
              Admin - Sign in
            </Typography>
            <form onSubmit={handleSubmit}>

              <Box noValidate sx={{ mt: 1 }}>
                <TextField
                  margin="normal"
                  fullWidth
                  id="name"
                  label="Enter Username"
                  name="adminName"
                  value={adminName}
                  onChange={(e) => setadminName(e.target.value)}
                  onBlur={handleAdminNameBlur}
                  error={adminNameError !== ""}
                  helperText={adminNameError}
                  autoComplete="email"
                  autoFocus
                />
                <TextField
                  margin="normal"
                  fullWidth
                  name="adminPassword"
                  label="Enter Password"
                  type="password"
                  value={adminPassword}
                  onChange={(e) => setadminPassword(e.target.value)}
                  onBlur={handleAdminPasswordBlur}
                  error={adminPasswordError !== ""}
                  helperText={adminPasswordError}
                  autoComplete="current-password"
                  id='password'
                />

                <Button

                  type="submit"
                  fullWidth
                  variant="contained"
                  sx={{ mt: 3, mb: 2, bgcolor: 'black' }}
                  id='signin'
                >
                  Sign In
                </Button>
                <Grid container>

                  <Grid item>
                    <Link href="#" variant="body2">

                    </Link>
                  </Grid>
                </Grid>
              </Box>
            </form>
          </Box>
        </Container>
      </ThemeProvider>
    </>
  );
}