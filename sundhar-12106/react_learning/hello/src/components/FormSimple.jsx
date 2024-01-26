import React from "react";
import './styles/formStyle.css'
import { Button, TextField } from "@mui/material";

function FormSimple() {
  return (
    <>
      <div className="container p-5">
        <div className="form-group border pt-5 ">
          <div className="row justify-content-center">
            <div className="col-12 col-md-10 col-xl-8">
              <div className="row justify-content-center">
                <div className="col-lg-6 col-md-6 col-sm-6">
                  <TextField
                    variant="outlined"
                    className="form-group"
                    label="Email"
                    placeholder="Email"
                    type="email"
                  />
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6">
                  <TextField
                    variant="outlined"
                    className="form-control"
                    label="Password"
                    type="password"
                    placeholder="Password"
                  />
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-12 col-md-10 col-xl-8 w-100">
                  <TextField
                    variant="outlined"
                    label="Address"
                    type="text"
                    className="form-control"
                    placeholder="Address"
                  />
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-lg-4 col-md-4 col-sm-4">
                  <TextField
                    variant="outlined"
                    label="city"
                    type="text"
                    className="form-control"
                    placeholder="City"
                  />
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4">
                  <TextField
                    variant="outlined"
                    label="state"
                    type="text"
                    className="form-control"
                    placeholder="State"
                  />
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4">
                  <TextField
                    variant="outlined"
                    label="zip"
                    type="text"
                    className="form-control"
                    placeholder="Zip"
                  />
                </div>
              </div>
              <div className="row">
                <div className="col-lg-3 col-md-3 col-sm-3">
                  <Button
                    variant="contained"
                    type="submit"
                    className="btn btn-primary"
                  >
                    Register
                  </Button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default FormSimple;
