import { useEffect } from "react";
import React from "react";
import Allservices from "../Service/Allservices";
import { useNavigate, Link } from "react-router-dom";

export default function Insert() {
  let navigate = useNavigate();

  const [user, setUser] = React.useState({
    uid: "",
    uname: "",
    uage: "",
    lib: { lid: "", bname: " ", price: " " }
  });

  const { uid, uname, uage } = user;
  const handleChange = (e) => {
    if (e.target.name === 'lid') {
      setUser({ ...user, lib: { lid: e.target.value } })
    }
    else {
      setUser({ ...user, [e.target.name]: e.target.value });
    }
  };
  const [idList, setidList] = React.useState([]);

  useEffect(() => {
    Allservices.FindallId().then((response) => {
      console.log(response.data);
      setidList(response.data);
    });

  }, []);

  const onsubmit = async (e) => {
    e.preventDefault();
    console.log(user);
    await Allservices.Adduser(user);
    alert("Data inserted successfully");
    navigate("/");
  };
  return (
    <div>
      <div style={{ marginLeft: "30%", marginRight: "20%", marginTop: "5%", height: "400px", width: "600px", }} className="card" >
        <div className="container mt-5">
          <div className="row justify-content-center">
            <div className="col-md-6">
              <div className="card">
                <div className="card-header">
                  <h1 className="card-title">User page</h1>
                </div>
                <div className="card-body">
                  <form onSubmit={onsubmit}>
                    <div className="form-group row">
                      <label
                        for="colFormLabel"
                        className="col-sm-3 col-form-label"
                      >
                        Name
                      </label>
                      <div className="col-sm-9">
                        <input
                          type="text"
                          className="form-control"
                          id="colFormLabel"
                          name="uname"
                          value={uname}
                          onChange={handleChange}
                          required
                          placeholder="Enter name"
                        />
                      </div>
                    </div>
                    <div className="form-group row">
                      <label
                        for="colFormLabelLg"
                        className="col-sm-3 col-form-label col-form-label-lg"
                      >
                        Age
                      </label>
                      <div className="col-sm-9">
                        <input
                          type="number"
                          className="form-control form-control-lg"
                          id="colFormLabelLg"
                          name="uage"
                          value={uage}
                          required
                          onChange={handleChange}
                          placeholder="Enter age"
                        />
                      </div>
                      <br></br>
                      &nbsp;
                      <div className="form-group row">
                        <label
                          for="colFormLabelLg"
                          className="col-sm-3 col-form-label col-form-label-lg"
                        >
                          Lib ID
                        </label>
                        <div className="col-sm-9">
                          <select
                            style={{ width: "410px", height: "30px" }}
                            name="lid"
                            className="form-control form-control-lg"
                            value={user.lib.lid}
                            required
                            onChange={handleChange}
                            class="form-select"
                            aria-label="Default select example"
                          ><option>Select Library id</option>
                            {
                              idList.map((id) =>
                                <option key={id}>{id}</option>

                              )}

                          </select>
                        </div>
                      </div>
                      &nbsp;
                      <div className="form-group row">
                        <div className="col-sm-9 offset-sm-3">
                          <input
                            type="submit"
                            value="Insert"
                            className="btn btn-primary p-1 m-2 "
                          />
                          <Link to="/">
                            {"  "}
                            <button className="btn btn-warning p-1 m-2 ">
                              Back
                            </button>
                          </Link>
                        </div>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
