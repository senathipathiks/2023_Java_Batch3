import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "@mui/material/Button";
import Alert from "@mui/material/Alert";
import Stack from "@mui/material/Stack";
import User from "./Service/User";
import Train from "./Service/Train";

const Uupdate = () => {
  const [Adata, setAdata] = useState([]);

  const [Pdata, setPdata] = useState([]);
  const [alert, setalert] = useState(false);
  const [Idopt, setIdopt] = useState(0);
  const [formDisp, setformDisp] = useState(false);
  const [trId, changetrId] = useState(0);

  var [usId, changeusId] = useState(0);
  const [usName, changeusName] = useState("");
  const [usAge, changeusAge] = useState("");
  const [usMob, changeusMob] = useState("");
  const [usStart, changeusStart] = useState("");
  const [usEnd, changeusEnd] = useState("");
  const [usStDate, changeusStDate] = useState("");
  const [usEnDate, changeusEnDate] = useState("");

  useEffect(() => {
    User.getAll().then((response) => {
      setAdata(response.data);
      console.log(response.data);
    });
  }, []);

  useEffect(() => {
    Train.getAll().then((response) => {
      console.log(response.data);
      setPdata(response.data);
    });
  }, []);

  const openForm = () => {
    console.log(Idopt);

    User.dofindId(Idopt).then((response) => {
      console.log(response.data);
      changeusId(response.data.usId);
      changeusName(response.data.usName);
      changeusAge(response.data.usAge);
      changeusMob(response.data.usMob);
      changeusStart(response.data.usStart);
      changeusEnd(response.data.usEnd);
      changeusStDate(response.data.usStDate);
      changeusEnDate(response.data.usEnDate);
    });

    setformDisp(true);
  };

  const doUpdate = () => {
    const inData = {
      usId,
      usName,
      usAge,
      usMob,
      usStart,
      usEnd,
      usStDate,
      usEnDate,
      trn: { trId },
    };
    console.log(inData);
    User.doUpdate(inData).then(() => {
      setalert(true);
    });
  };
  return (
    <>
      <Card bg="dark" border="dark" id="Mform">
        <Card.Header id="header">
          <h2>Update Operation</h2>
        </Card.Header>
        <Card.Body>
          <label style={{ color: "white" }}>Choose the User ID</label>
          <Form.Select
            aria-label="Default select example"
            onChange={(e) => {
              setIdopt(e.target.value);
            }}
          >
            <option>--select--</option>
            {Adata.map((idlst) => (
              <option value={idlst.usId}>{idlst.usId}</option>
            ))}
          </Form.Select>
          <br></br>
          <Stack direction="row" spacing={2}>
            <Button
              variant="contained"
              color="warning"
              onClick={() => openForm()}
            >
              Fetch
            </Button>
          </Stack>
        </Card.Body>
        {formDisp && (
          <Card.Body>
            <label style={{ color: "white" }}>Change Train</label>
            <Form.Select
              className="mb-3"
              aria-label="Default select example"
              onChange={(e) => {
                changetrId(e.target.value);
              }}
            >
              <option>--select TrainName--</option>
              {Pdata.map((idlst) => (
                <option value={idlst.trId}>{idlst.trName}</option>
              ))}
            </Form.Select>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingInputCustom"
                type="text"
                placeholder="ID"
                value={usId}
              />
              <label htmlFor="floatingInputCustom">ID</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="name"
                type="text"
                placeholder="Name"
                defaultValue={usName}
                onChange={(e) => {
                  changeusName(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">User Name</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Age"
                defaultValue={usAge}
                onChange={(e) => {
                  changeusAge(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">User Age</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Mobile"
                defaultValue={usMob}
                onChange={(e) => {
                  changeusMob(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">Mobile No.</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Arrival"
                defaultValue={usStart}
                onChange={(e) => {
                  changeusStart(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">Arrival location</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Depature"
                defaultValue={usEnd}
                onChange={(e) => {
                  changeusEnd(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">Depature</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Arrival Date"
                defaultValue={usStDate}
                onChange={(e) => {
                  changeusStDate(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">Arrival Date</label>
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Arrival Date"
                defaultValue={usEnDate}
                onChange={(e) => {
                  changeusEnDate(e.target.value);
                }}
              />
              <label htmlFor="floatingPasswordCustom">Depature Date</label>
            </Form.Floating>

            <br></br>
            <Form.Floating className="mb-3">
              <Stack direction="row" spacing={2}>
                <Button variant="contained" color="success" onClick={doUpdate}>
                  Update
                </Button>
              </Stack>
            </Form.Floating>
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
              Record updation is Successfully Done
            </Alert>
          </Stack>
        </>
      )}
    </>
  );
};

export default Uupdate;
