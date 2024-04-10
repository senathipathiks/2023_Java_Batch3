import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "@mui/material/Button";
import Stack from "@mui/material/Stack";
import User from "./Service/User";
import Style from "./Style.css";

const Ufind = () => {
  const [Adata, setAdata] = useState([]);
  const [Fdata, setFdata] = useState([]);
  const [choose, setchoose] = useState("");
  const [Idopt, setIdopt] = useState(0);
  const [Nameopt, setNameopt] = useState("");
  const [Tbl, setTbl] = useState(false);

  useEffect(() => {
    User.getAll().then((response) => {
      setAdata(response.data);
      console.log(response.data);
    });
  }, []);

  const doFind = () => {
    User.dofindName(Nameopt).then((response) => {
      setFdata(response.data);
      setTbl(true);
    });
  };
  return (
    <>
      <Card bg="dark" border="dark" id="Mform">
        <Card.Header id="header">
          <h2>Search Operation</h2>
        </Card.Header>
        <Card.Body>
          <label style={{ color: "white" }}>Choose your Preferences</label>
          <Form.Select
            aria-label="Default select example"
            onChange={(e) => {
              setchoose(e.target.value);
            }}
          >
            <option>--select--</option>
            <option value="ID">ID</option>
            <option value="Name">Name</option>
          </Form.Select>
        </Card.Body>

        {choose === "ID" && (
          <Card.Body>
            <label style={{ color: "white" }}>Choose the User ID</label>
            <Form.Select
              aria-label="Default select example"
              onChange={(e) => {
                setNameopt(e.target.value);
              }}
            >
              <option>--select--</option>
              {Adata.map((item) => (
                <option value={item.usName}>{item.usId}</option>
              ))}
            </Form.Select>
            <br></br>
            <Stack direction="row" spacing={2}>
              <Button
                variant="contained"
                color="warning"
                onClick={() => doFind()}
              >
                Find
              </Button>
            </Stack>
          </Card.Body>
        )}
        {choose === "Name" && (
          <Card.Body>
            <label style={{ color: "white" }}>Choose the User Name</label>
            <Form.Select
              aria-label="Default select example"
              onChange={(e) => {
                setNameopt(e.target.value);
              }}
            >
              <option>--select--</option>
              {Adata.map((item) => (
                <option value={item.usName}>{item.usName}</option>
              ))}
            </Form.Select>
            <br></br>
            <Stack direction="row" spacing={2}>
              <Button
                variant="contained"
                color="warning"
                onClick={() => doFind()}
              >
                Find
              </Button>
            </Stack>
          </Card.Body>
        )}
      </Card>
      {Tbl && (
        <Card bg="light" className="tbl" id="ubtl">
          <Card.Header id="header">
            <h2>Record</h2>
          </Card.Header>
          <Card.Body>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">User Id</th>
                  <th scope="col">User Name</th>
                  <th scope="col">User Age</th>
                  <th scope="col">Mobile No.</th>
                  <th scope="col">Arrival Location</th>
                  <th scope="col">Depature Location</th>
                  <th scope="col">Arrival Date</th>
                  <th scope="col">Depature Date</th>
                  <th scope="col">Train Id</th>
                  <th scope="col">Train Name</th>
                  <th scope="col">Train Number</th>
                  <th scope="col">Train Year</th>
                </tr>
              </thead>
              <tbody>
                {Fdata.map((item) => (
                  <tr>
                    <td>{item.usId}</td>
                    <td>{item.usName}</td>
                    <td>{item.usAge}</td>
                    <td>{item.usMob}</td>
                    <td>{item.usStart}</td>
                    <td>{item.usEnd}</td>
                    <td>{item.usStDate}</td>
                    <td>{item.usEnDate}</td>
                    <td>{item.trn.trId}</td>
                    <td>{item.trn.trName}</td>
                    <td>{item.trn.trNum}</td>
                    <td>{item.trn.trYear}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </Card.Body>
        </Card>
      )}
    </>
  );
};

export default Ufind;
