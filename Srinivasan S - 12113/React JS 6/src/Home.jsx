import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

function Home() {
  let [data, setData] = useState([]);
  useEffect(() => {
    loadData();
  });
  const loadData = async () => {
    const response = await axios.get(`http://localhost:3000/users`);
    console.log(response);
    setData(response.data);
    console.log(data);
  };

  const handleDelete = (id) => {
    const confirm = window.confirm("would you like to delete");
    if (confirm) {
      axios
        .delete(`http://localhost:3000/users/${id}`)
        .then((response) => setData(response.data))
        .catch((err) => console.log(err));
    }
  };
  return (
    <div className="d-flex flex-column  justify-content-center align-items-center  bg-light  vh-100 ">
      <h1>Users</h1>
      <div className="w-75  rounded bg-white border shadow p-4 ">
        <div className="d-flex justify-content-end">
          <Link to="/create" className="btn btn-success mb-2">
            Add User
          </Link>
        </div>
        <table className="table table-striped ">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Email</th>
              <th>Phone</th>
              <th>CRUD</th>
            </tr>
          </thead>
          <tbody>
            {data.map((e) => (
              <tr key={e.id}>
                <td>{e.id}</td>
                <td>{e.name}</td>
                <td>{e.email}</td>
                <td>{e.phone}</td>
                <td>{e.address}</td>
                <td>
                  <Link
                    to={`/read/${e.id}`}
                    className="btn brn-sm btn-info ms-3 "
                  >
                    Read
                  </Link>
                  <Link
                    to={`/update/${e.id}`}
                    className="btn brn-sm btn-primary ms-3 "
                  >
                    Edit
                  </Link>
                  <Link
                    onClick={(e) => handleDelete(e.id)}
                    className="btn btn-sm btn-danger ms-3"
                  >
                    Delete
                  </Link>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default Home;
