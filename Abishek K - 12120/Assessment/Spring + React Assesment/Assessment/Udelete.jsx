import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "@mui/material/Button";
import Stack from "@mui/material/Stack";
import Alert from "@mui/material/Alert";
import User from "./Service/User";

const Udelete = () => {
  const [alert, setalert] = useState(false);
  const [Adata, setAdata] = useState([]);
  const [choose, setchoose] = useState("");
  const [Idopt, setIdopt] = useState(0);
  const [Nameopt, setNameopt] = useState("");

  useEffect(() => {
    User.getAll().then((response) => {
      setAdata(response.data);
      console.log(response.data);
    });
  }, []);

  const doDelete = (data) => {
    data === "Name"
      ? User.deleteName(Nameopt).then(() => {
          setalert(true);
        })
      : User.deleteId(Idopt).then(() => {
          setalert(true);
        });
  };
  return (
    <>
      <Card bg="dark" border="dark" id="Mform">
        <Card.Header id="header">
          <h2>Deletion Operation</h2>
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
                setIdopt(e.target.value);
              }}
            >
              <option>--select--</option>
              {Adata.map((item) => (
                <option value={item.usId}>{item.usId}</option>
              ))}
            </Form.Select>
            <br></br>
            <Stack direction="row" spacing={2}>
              <Button
                variant="contained"
                color="warning"
                onClick={() => doDelete(1)}
              >
                Delete
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
                onClick={() => doDelete("Name")}
              >
                Delete
              </Button>
            </Stack>
          </Card.Body>
        )}
      </Card>
      {alert && (
        <>
          <br></br>
          <Stack
            sx={{
              width: "50%",
              marginLeft: "390px",
              marginBottom: "50px",
              fontWeight: "bold",
              color: "yellowgreen",
            }}
            spacing={2}
          >
            <Alert
              variant="filled"
              onClose={() => {
                setalert(false);
                window.location.reload();
              }}
            >
              Record Successfully Deleted
            </Alert>
          </Stack>
        </>
      )}
    </>
  );
};

export default Udelete;
