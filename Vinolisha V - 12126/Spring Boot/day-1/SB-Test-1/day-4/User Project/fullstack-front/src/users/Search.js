import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Employee from "../Service/Employee";

export default function SearchUser() {
  const [id, setId] = React.useState(0);

  const [user, setUser] = useState({
    id: "",
    name: "",
    username: "",
    email: "",
  });

  const [idList, setidList] = React.useState([]);

  useEffect(() => {
    const loadUsers = async ()=>{
      await Employee.auto().then((res) => {setidList(res.data)}).catch((err)=>console.log(err));
    // axios.get("http://localhost:2244/Autopop").then((response) => {
      // console.log(res.data);
      // setidList(response.data);
    }; loadUsers();
  }, []);

  const onSubmit = async (e) => {
    console.log(id);
    e.preventDefault();
    await Employee.fetch(id).then((response) => {
    // await axios.get(`http://localhost:2244/users/${id}`).then((response) => {
      console.log(response.data);
      setUser(response.data);
  });
  };

  
  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 bg-light  border rounded p-4 mt-5 shadow">
          <h4 className="text-center m-4">SEARCH USER</h4>
          <form onSubmit={onSubmit}>
            <select
              required
              value={id}
              onChange={(e) => setId(e.target.value)}
              className="form-select"
            >
              <option value="">Choose ID</option>
              {idList.map((id) => (
                <option key={id}>{id}</option>
              ))}
            </select>
            <button type="submit" className="btn btn-success mx-2 mt-4">
              Fetch
            </button>

            <Link className="btn btn-dark mt-4" to={"/"}>
              Back
            </Link>
            <table className="table  mt-3">
              <thead>
                <tr>
                  <th>User Id</th>
                  <th>User Name</th>
                  <th>UserName </th>
                  <th>User Email</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td> {user.id}</td>
                  <td> {user.name}</td>
                  <td> {user.username}</td>
                  <td> {user.email}</td>
                </tr>
              </tbody>
            </table>
          </form>
        </div>
      </div>
    </div>
  );
}


