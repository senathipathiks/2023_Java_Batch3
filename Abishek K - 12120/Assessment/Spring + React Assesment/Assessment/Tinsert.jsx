import React, { useState } from "react";
import "./Style.css";
import { Card } from "react-bootstrap";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import Alert from "@mui/material/Alert";
import Stack from "@mui/material/Stack";
import { useForm } from "react-hook-form";
import Train from "./Service/Train";

const Tinsert = () => {
  const [alert, setalert] = useState(false);
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  const getFormData = (data) => {
    console.log(data);
    Train.doInsert(data).then(() => {
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
          <form onSubmit={handleSubmit(getFormData)}>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Train Name"
                {...register("trName", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Train Name</label>
              {errors.trName && <p className="error">Please fill the Field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Train Number"
                {...register("trNum", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Train Number</label>
              {errors.trNum && <p className="error"> Please fill the field</p>}
            </Form.Floating>
            <Form.Floating className="mb-3">
              <Form.Control
                id="floatingPasswordCustom"
                type="text"
                placeholder="Train Year"
                {...register("trYear", { required: true })}
              />
              <label htmlFor="floatingPasswordCustom">Train Year</label>
              {errors.trYear && <p className="error">Please fill the Field</p>}
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

export default Tinsert;
