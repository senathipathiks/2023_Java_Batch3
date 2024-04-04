import React, { useEffect, useState } from "react";
import EmployeeService, {
  deleteById,
  fetchAll,
} from "../service/EmployeeService";
import { useNavigate } from "react-router-dom";
// import { Modal } from "bootstrap";
import { Button, Modal } from "react-bootstrap";
// import { Button } from "bootstrap";

function MyVerticallyCenteredModal(props) {
  return (
    <Modal
      {...props}
      size="lg"
      aria-labelledby="contained-modal-title-vcenter"
      centered
    >
      <Modal.Header closeButton>
        <Modal.Title id="contained-modal-title-vcenter">
          Modal heading
        </Modal.Title>
      </Modal.Header>
      <Modal.Body>
        <h4>Centered Modal</h4>
        <p>
          Cras mattis consectetur purus sit amet fermentum. Cras justo odio,
          dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac
          consectetur ac, vestibulum at eros.
        </p>
      </Modal.Body>
      <Modal.Footer>
        <Button onClick={props.onHide}>Close</Button>
      </Modal.Footer>
    </Modal>
  );
}

const Home = () => {
  const navigate = useNavigate();
  const [employee, setEmployee] = useState([]);
  const [modalShow, setModalShow] = useState(false);

  useEffect(() => {
    fetchAll()
      .then((res) => {
        console.log(res);
        setEmployee(res.data);
      })
      .catch((err) => console.log(err));
  }, []);

  const handleDelete = (id) => {
    // alert("hello : " + id);
    let confiramtion = window.confirm("Do You Really Want to delete");
    if (confiramtion) {
      deleteById(id).then((res) => {
        // alert("Deleted Successfully!");
        console.log(res.data);
        // window.location.reload();
        let emp1 = employee.filter((employee) => {
          console.log(employee.id + " : " + id);
          return employee.id !== id;
        });
        setEmployee(emp1);
      });
    }
  };

  return (
    <div className="container">
      <div className="container border rounded shadow p-4 mt-4">
        <div className="container">
          <input
            type="button"
            className="btn btn-primary"
            value={"Add Employee"}
            onClick={() => {
              navigate("/add");
            }}
          />
        </div>
        <div className="container">
          <h2 className="text-center">Employee Details</h2>
        </div>
        <div className="mt-3">
          <div className="row gap-2 border-bottom mb-3  ">
            <div className="col-2 text-dark fw-medium ">Employee Name</div>
            <div className="col-2 text-dark fw-medium ">gender</div>
            <div className="col-2 text-dark fw-medium ">email</div>
            <div className="col-2 text-dark fw-medium ">department name</div>
            <div className="col-1 text-dark fw-medium ">action1</div>
            <div className="col-1 text-dark fw-medium ">action2</div>
            <div className="col-1 text-dark fw-medium ">action3</div>
          </div>
          {employee.map((emp) => (
            <div className="row mt-2 gap-2" key={emp.id}>
              <div className="col-2">{emp.name}</div>
              <div className="col-2">{emp.gender}</div>
              <div className="col-2">{emp.email}</div>
              <div className="col-2">{emp.department.deptName}</div>
              <div className="col-1 p-0">
                <button className="btn btn-primary">edit</button>
              </div>
              <div className="col-1 p-0">
                <button
                  className="btn btn-info"
                  onClick={() => handleDelete(emp.id)}
                >
                  Delete
                </button>
              </div>
              <div className="col-1">
                {/* <button className="btn btn-secondary">view</button> */}
                <>
                  <Button variant="primary" onClick={() => setModalShow(true)}>
                    view
                  </Button>

                  <MyVerticallyCenteredModal
                    show={modalShow}
                    onHide={() => setModalShow(false)}
                  />
                </>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Home;
