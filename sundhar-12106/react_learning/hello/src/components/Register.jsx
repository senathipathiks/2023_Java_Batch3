import React from "react";

function Register() {
  return (
    <>
      <div className="container p-5">
        <div className="form-group border pt-5 ">
          <div className="row justify-content-center">
            <div className="col-12 col-md-10 col-xl-8">
              <div className="row justify-content-center">
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    className="form-control"
                    label="Email"
                    placeholder="Email"
                    type="email"
                    id="usr-mail"
                  />
                  <label htmlFor="usr-mail" className="ms-3 ms-md-4 ms-sm-2 ">
                    mail
                  </label>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-6 form-floating">
                  <input
                    variant="outlined"
                    className="form-control"
                    label="Password"
                    type="password"
                    placeholder="Password"
                    id="usr-pass"
                  />
                  <label htmlFor="usr-pass" className="ms-3 ms-md-4 ms-sm-2 ">
                    password
                  </label>
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-12 col-md-10 col-xl-8 w-100 form-floating">
                  <input
                    variant="outlined"
                    label="Address"
                    type="text"
                    className="form-control"
                    placeholder="Address"
                    id="address"
                  />
                  <label htmlFor="address" className="ms-3 ms-md-4 ms-sm-2 ">
                    address
                  </label>
                </div>
              </div>
              <div className="row justify-content-center">
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="city"
                    type="text"
                    className="form-control"
                    placeholder="City"
                    id="city"
                  />
                  <label htmlFor="city" className="ms-3 ms-md-4 ms-sm-2 ">
                    city
                  </label>
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="state"
                    type="text"
                    className="form-control"
                    placeholder="State"
                    id="state"
                  />
                  <label htmlFor="state" className="ms-3 ms-md-4 ms-sm-2 ">
                    state
                  </label>
                </div>
                <div className="col-lg-4 col-md-4 col-sm-4 form-floating">
                  <input
                    variant="outlined"
                    label="zip"
                    type="text"
                    className="form-control"
                    placeholder="Zip"
                    id="zip"
                  />
                  <label htmlFor="zip" className="ms-3 ms-md-4 ms-sm-2 ">
                    pincode
                  </label>
                </div>
              </div>
              <div className="row">
                <div className="col-lg-3 col-md-3 col-sm-3 form-floating">
                  <button
                    variant="contained"
                    type="submit"
                    className="btn btn-primary"
                  >
                    Register
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Register;
