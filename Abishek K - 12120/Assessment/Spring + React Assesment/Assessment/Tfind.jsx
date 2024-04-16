import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "@mui/material/Button";
import Stack from "@mui/material/Stack";
import Train from "./Service/Train";

const Tfind = () => {
  const [Adata, setAdata] = useState([]);
  const [Fdata, setFdata] = useState([]);
  const [choose, setchoose] = useState("");
  const [Idopt, setIdopt] = useState(0);
  const [Nameopt, setNameopt] = useState("");
  const [TblId, setTblId] = useState(false);
  const [TblName, setTblName] = useState(false);

  useEffect(() => {
    Train.getAll().then((response) => {
      setAdata(response.data);
    });
  }, []);
  console.log(Idopt);
  console.log(Nameopt);

  const doFind = (data) => {
    data === "Name"
      ? Train.dofindName(Nameopt).then((response) => {
          setFdata(response.data);
          console.log(response.data);
          setTblId(false);
          setTblName(true);
        })
      : Train.dofindId(Idopt).then((response) => {
          setFdata(response.data);
          setTblName(false);
          setTblId(true);
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
            <label style={{ color: "white" }}>Choose the Train ID</label>
            <Form.Select
              aria-label="Default select example"
              onChange={(e) => {
                setIdopt(e.target.value);
              }}
            >
              <option>--select--</option>
              {Adata.map((pdt) => (
                <option value={pdt.trId}>{pdt.trId}</option>
              ))}
            </Form.Select>
            <br></br>
            <Stack direction="row" spacing={2}>
              <Button
                variant="contained"
                color="warning"
                onClick={() => doFind(1)}
              >
                Find
              </Button>
            </Stack>
          </Card.Body>
        )}
        {choose === "Name" && (
          <Card.Body>
            <label style={{ color: "white" }}>Choose the Train Name</label>
            <Form.Select
              aria-label="Default select example"
              onChange={(e) => {
                setNameopt(e.target.value);
              }}
            >
              <option>--select--</option>
              {Adata.map((pdt) => (
                <option value={pdt.trName}>{pdt.trName}</option>
              ))}
            </Form.Select>
            <br></br>
            <Stack direction="row" spacing={2}>
              <Button
                variant="contained"
                color="warning"
                onClick={() => doFind("Name")}
              >
                Find
              </Button>
            </Stack>
          </Card.Body>
        )}
      </Card>
      <br></br>
      {TblId && (
        <Card bg="light" border="dark" className="tbl">
          <Card.Header id="header">
            <h2>Record</h2>
          </Card.Header>
          <Card.Body>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">Train Id</th>
                  <th scope="col">Train Name</th>
                  <th scope="col">Train Number</th>
                  <th scope="col">Train Year</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>{Fdata.trId}</td>
                  <td>{Fdata.trName}</td>
                  <td>{Fdata.trNum}</td>
                  <td>{Fdata.trYear}</td>
                </tr>
              </tbody>
            </table>
          </Card.Body>
        </Card>
      )}
      {TblName && (
        <Card bg="light" className="tbl">
          <Card.Header id="header">
            <h2>Record</h2>
          </Card.Header>
          <Card.Body>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">Train Id</th>
                  <th scope="col">Train Name</th>
                  <th scope="col">Train Number</th>
                  <th scope="col">Train Year</th>
                </tr>
              </thead>
              <tbody>
                {Fdata.map((item) => (
                  <tr>
                    <td>{item.trId}</td>
                    <td>{item.trName}</td>
                    <td>{item.trNum}</td>
                    <td>{item.trYear}</td>
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

export default Tfind;
