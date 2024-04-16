import React, { useEffect, useState } from "react";
import { Card } from "react-bootstrap";
import User from "./Service/User";

const Ufindall = () => {
  const [Adata, setAdata] = useState([]);

  useEffect(() => {
    User.getAll().then((response) => {
      setAdata(response.data);
      console.log(response.data);
    });
  }, []);
  return (
    <>
      <Card bg="light" id="findall" class="table table-hover">
        <Card.Header id="fheader">
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
              {Adata.map((item) => (
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
    </>
  );
};

export default Ufindall;
