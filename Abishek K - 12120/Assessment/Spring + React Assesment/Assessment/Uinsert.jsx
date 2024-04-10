import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import Alert from "@mui/material/Alert";
import Stack from "@mui/material/Stack";
import { useForm } from "react-hook-form";
import Train from "./Service/Train";
import User from "./Service/User";

const Uinsert = () => {
  const [alert, setalert] = useState(false);
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();
  const [Adata, setAdata] = useState([]);
  const [trId, changetrId] = useState(0);

  useEffect(() => {
    Train.getAll().then((response) => {
      console.log(response.data.data);
      setAdata(response.data);
    });
  }, []);

  console.log(trId);

  const getFormData = (data) => {
    var { usName, usAge, usMob, usStart, usEnd, usStDate, usEnDate } = data;
    var indata = {
      usName,
      usAge,
      usMob,
      usStart,
      usEnd,
      usStDate,
      usEnDate,
      trn: {
        trId,
      },
    };
    console.log(indata);
    User.doInsert(indata).then(() => {
      setalert(true);
    });
  };
  return (
    <>
      <Card bg="dark" border="dark" id="Mform">
        <Card.Header id="header">
          <h2>Insertion Operation</h2>
        </Card.Header>
        <Card.Body>
          <Form.Select
            className="mb-3"
            aria-label="Default select example"
            onChange={(e) => {
              changetrId(e.target.value);
            }}
          >
            <option>--select Train--</option>
            {Adata.map((idlst) => (
              <option value={idlst.trId}>{idlst.trId}</option>
            ))}
          </Form.Select>
          <form onSubmit={handleSubmit(getFormData)}>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="User Name"
                {...register("usName", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">User Name</label>
              {errors.usName && <p className="error">Please fill the Field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="number"
                placeholder="User Age"
                {...register("usAge", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">User Age</label>
              {errors.usAge && <p className="error"> Please fill the field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Mobile No."
                {...register("usMob", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Mobile No.</label>
              {errors.usMob && <p className="error">Please fill the Field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Strating location"
                {...register("usStart", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Strating Location</label>
              {errors.usStart && <p className="error">Please fill the Field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Destination"
                {...register("usEnd", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Destination</label>
              {errors.usEnd && <p className="error">Please fill the Field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Date of Arrival"
                {...register("usStDate", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Date of Arrival</label>
              {errors.usStDate && (
                <p className="error">Please fill the Field</p>
              )}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Date of Depature"
                {...register("usEnDate", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Date of Depature</label>
              {errors.usEnDate && (
                <p className="error">Please fill the Field</p>
              )}
            </Form.Floating>

            <br></br>
            <Form.Floating className="mb-3">
              <Button as="input" type="submit" value="Insert" size="md" />{" "}
            </Form.Floating>
          </form>
        </Card.Body>
      </Card>
      <br />
      {alert && (
        <>
          <Stack
            sx={{
              width: "50%",
              marginLeft: "390px",
              marginBottom: "50px",
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
              Records Inserted Successfully
            </Alert>
          </Stack>
        </>
      )}
    </>
  );
};

export default Uinsert;
