import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "@mui/material/Button";
import Alert from "@mui/material/Alert";
import Stack from "@mui/material/Stack";
import Train from "./Service/Train";

const Tupdate = () => {
  const [Adata, setAdata] = useState([]);
  const [alert, setalert] = useState(false);
  const [Idopt, setIdopt] = useState(0);
  const [formDisp, setformDisp] = useState(false);

  const [trId, changetrId] = useState("");
  const [trName, changetrName] = useState("");
  const [trNum, changetrNum] = useState("");
  const [trYear, changetrYear] = useState("");

  const UpData = {
    trId,
    trName,
    trNum,
    trYear,
  };

  useEffect(() => {
    Train.getAll().then((response) => {
      setAdata(response.data);
    });
  }, []);

  const openForm = () => {
    Train.dofindId(Idopt).then((response) => {
      changetrId(response.data.trId);
      changetrName(response.data.trName);
      changetrNum(response.data.trNum);
      changetrYear(response.data.trYear);
    });

    setformDisp(true);
  };

  const doUpdate = () => {
    console.log(UpData);
    Train.doUpdate(UpData).then(() => {
      setalert(true);
    });
  };

  return (
    <div>
      <Card bg="dark" border="dark" id="Mform">
        <>
          <Card.Header id="header">
            <h2>Update Operation</h2>
          </Card.Header>
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
                onClick={() => openForm()}
              >
                Fetch
              </Button>
            </Stack>
          </Card.Body>
        </>

        {formDisp && (
          <Card.Body>
            <form>
              <Form.Floating className="mb-3">
                <Form.Control
                  id="floatingInputCustom"
                  type="text"
                  placeholder="ID"
                  disabled
                  defaultValue={trId}
                />
                <label htmlFor="floatingInputCustom">ID</label>
              </Form.Floating>
              <Form.Floating className="mb-3">
                <Form.Control
                  id="name"
                  type="text"
                  placeholder="Train Name"
                  name="pName"
                  defaultValue={trName}
                  onChange={(e) => {
                    changetrName(e.target.value);
                  }}
                />
                <label htmlFor="floatingPasswordCustom">Train Name</label>
              </Form.Floating>
              <Form.Floating className="mb-3">
                <Form.Control
                  id="floatingPasswordCustom"
                  type="text"
                  placeholder="Product Price"
                  defaultValue={trNum}
                  onChange={(e) => {
                    changetrNum(e.target.value);
                  }}
                />
                <label htmlFor="floatingPasswordCustom">Train Number</label>
              </Form.Floating>
              <Form.Floating className="mb-3">
                <Form.Control
                  id="floatingPasswordCustom"
                  type="text"
                  placeholder="Product seller"
                  defaultValue={trYear}
                  onChange={(e) => {
                    changetrYear(e.target.value);
                  }}
                />
                <label htmlFor="floatingPasswordCustom">Train Year</label>
              </Form.Floating>

              <br></br>
              <Form.Floating className="mb-3">
                <Stack direction="row" spacing={2}>
                  <Button
                    variant="contained"
                    color="success"
                    onClick={doUpdate}
                  >
                    Update
                  </Button>
                </Stack>
              </Form.Floating>
            </form>
          </Card.Body>
        )}
      </Card>
      <br />
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
    </div>
  );
};

export default Tupdate;
