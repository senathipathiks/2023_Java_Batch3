import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import Train from "./Service/Train";

const Tfindall = () => {
  const [Adata, setAdata] = useState([]);
  useEffect(() => {
    Train.getAll().then((response) => {
      setAdata(response.data);
    });
  }, []);
  return (
    <div>
      <Card bg="light" id="findall" class="table table-hover">
        <Card.Header id="fheader">
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
              {Adata.map((item) => (
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
    </div>
  );
};

export default Tfindall;
