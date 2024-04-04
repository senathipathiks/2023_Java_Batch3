import React, { useState } from "react";
import SignIn from "./Signin";
import SignUp from "./Signup";
import { Button } from "@mui/material";

const LandingPage = () => {
  const [useroption, setUseroption] = useState("signIn");

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(e.target.value);
    if (e.target.name === "signIn") {
      console.log(useroption);
      setUseroption("signIn");
      return;
    }
    setUseroption("signup");
  };

  return (
    <div className="container">
      <div className="conatiner container d-flex justify-content-center gap-4 mt-5">
        <Button
          variant="contained"
          name="signIn"
          value={useroption}
          onClick={(e) => handleSubmit(e)}
        >
          signIn
        </Button>
        <Button
          variant="outlined"
          name="signUp"
          value={useroption}
          onClick={handleSubmit}
        >
          signUp
        </Button>
      </div>
      {useroption === "signIn" ? <SignIn /> : <SignUp />}
    </div>
  );
};

export default LandingPage;
