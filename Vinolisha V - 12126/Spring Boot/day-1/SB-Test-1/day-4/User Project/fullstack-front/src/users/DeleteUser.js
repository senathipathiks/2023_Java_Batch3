import axios from "axios";
import React, { useEffect } from "react";
import { Link, useNavigate } from "react-router-dom";
import Employee from "../Service/Employee";

export default function DeleteUser() {
    let navigate = useNavigate();

  const [id, setId] = React.useState(0);

  const [idList, setidList] = React.useState([]);

  

  useEffect(() => {
    const loadUsers = async ()=>{
      await Employee.auto().then ((res) => {setidList(res.data)}).catch((err)=>console.log("Error: "+ err));
    // const result = await axios.get("http://localhost:2244/Autopop");
      // console.log(result.data);
      // setidList(result.data);
    };loadUsers();
  }, []);

  const deleteUser = async (e) => {

    const confirmDelete = window.confirm("Are you sure you want to delete this Record")
    console.log(confirmDelete)
    if(confirmDelete){
      e.preventDefault()
    await Employee.dele(id);
    alert('Deleted Successfully');
    }
  else{
    alert('Cancelled');
  }
    window.location.reload()

  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 bg-light  border rounded p-4 mt-5 shadow">
          <h4 className="text-center m-4">DELETING USERS DETAILS USING ID</h4>
          <div>
          <select
            required
            value={id}
            onChange={(e) => setId(e.target.value)}
            className="form-select"
          >
            <option value="">select ID</option>
            {idList.map((id) => (
              <option key={id}>{id}</option>
            ))}
          </select>
          </div>

          <button
                    className="btn btn-success mx-2 mt-4"
                    onClick={(e) => deleteUser(e)}
                  >
                    Delete
                  </button>
          <Link className="btn btn-dark mt-4" to={"/"}>
            Back
          </Link>
        </div>
      </div>
    </div>
  );
}
