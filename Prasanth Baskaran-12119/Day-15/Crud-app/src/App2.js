import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css"

function App2() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:5000/users")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:5000/users/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <div id="body">
    <div className="container ">
      <h1 id="app2" className="text-center text-bg-success ">
        Student Management System
      </h1>

      <div className="text-end">
        <Link to="/create" className="btn btn-primary">
          Add +
        </Link>
      </div>
      <br />
      <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
        <thead>
          <tr>
            {columns.map((c, i) => (
              <th key={i}>{c}</th>
            ))}
            <th>Action</th>
          </tr>
        </thead>

        <tbody>
          {records.map((d, i) => (
            <tr key={i}>
              <td>{d.id}</td>
              <td>{d.Name}</td>
              <td>{d.Mobile}</td>
              <td>{d.City}</td>
              <td>{d.Pincode}</td>

              <td>
                <Link
                  to={`/update/${d.id}`}
                  className="btn btn-sm btn-success "
                >
                  Update
                </Link>
                <button
                  onClick={(e) => handleSubmit(d.id)}
                  className="btn btn-sm ms-1 btn-danger"
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
    </div>
  );
}

export default App2;
