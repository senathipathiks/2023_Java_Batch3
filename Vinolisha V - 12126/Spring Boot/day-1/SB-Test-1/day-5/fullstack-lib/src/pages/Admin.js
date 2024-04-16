import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import {FaTrashAlt,FaEye,FaEdit} from "react-icons/fa";
import { Link, useNavigate, useParams } from "react-router-dom";
import "./Style.css";
import Service from "../service/Service";

export default function Admin() {
  let navigate = useNavigate();

  const [Record, setRecord] = useState([]);

  const [search, setSearch] = useState("");

  useEffect(() => {
    loadRecord();
  }, []);

  const loadRecord = async () => {
    // console.log("hii");
    await Service.GetAllAdmins().then((res) => setRecord(res.data));
  };

  const removeDetails = async (e, id) => {
    e.preventDefault();
    if (window.confirm("Are you sure?")) {
      await Service.DeleteAdmin(id);
      setRecord(id);
      window.location.reload();
      navigate("./admin");
    } else {
      alert("cancelled");
    }
  };

  return (
    <div className="container">
      <div className="col-4">
        <div className="col-sm-30 mb-4 mt-2">
          <form onSubmit={(e) => e.preventDefault()}>
            <input
              className="form-control"
              type="search"
              role="searchbox"
              placeholder="Enter the name to search " 
              value={search}
              onChange={(e) => setSearch(e.target.value)}
            ></input>
          </form>
        </div>
        <Link className="btn btn-dark m-2" to="/insertdept" id="add">
          Add Admin <b><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-plus-fill" viewBox="0 0 16 16">
  <path d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6"/>
  <path fill-rule="evenodd" d="M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5"/>
</svg></b>
        </Link>
      </div>
      <div className="py-">
        <table class="table table-transparent table-striped shadow ">
          <thead>
            <tr>
              <th scope="col">Admin Id</th>
              <th scope="col">Admin Name</th>
              <th scope="col">Subject</th>
              <th scope="col">Question</th>
              <th scope="col">Time</th>
              <th scope="col">Action</th>
            </tr>
          </thead>

          <tbody className="text-center">
            {Record.filter((st) =>
            st.name.toLowerCase().includes(search))
            .map((emp, index) => (
              <tr>
                <th scope="row" key={index}>
                  {emp.id}
                </th>

                <td>{emp.name}</td>
                <td>{emp.subject}</td>
                <td>{emp.question}</td>
                <td>{emp.time}</td>

                <td>
                  <Link
                    className="btn btn-dark mx-2"
                    to={`/updatedep/${emp.id}`}
                  >
                    <FaEdit/>
                  </Link>
                  <button
                    className="btn btn-outline-danger"
                    onClick={(e) => removeDetails(e, emp.id)}
                  >
                    <FaTrashAlt/>
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <Link className="btn btn-light m-2" to="/" id="add">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-counterclockwise" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M8 3a5 5 0 1 1-4.546 2.914.5.5 0 0 0-.908-.417A6 6 0 1 0 8 2z"/>
  <path d="M8 4.466V.534a.25.25 0 0 0-.41-.192L5.23 2.308a.25.25 0 0 0 0 .384l2.36 1.966A.25.25 0 0 0 8 4.466"/>
</svg> Back
        </Link>
      </div>
    </div>
  );
}
