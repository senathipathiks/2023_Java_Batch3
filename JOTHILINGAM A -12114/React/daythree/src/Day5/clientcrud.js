import "./App.css";
import { useEffect, useState } from "react";
import Axios from "axios";

function clientcrud() {
  const [users, setUsers] = useState([]);
  const [id, setId] = useState("");
  const [name, setName] = useState("");
  const [updated, setUpdated] = useState({ id: "", name: "" });


  // Hooks
  useEffect(() => {
    loadData();
  }, []);

  //get user from API

  const loadData = async () => {
    const response = await Axios.get("http://localhost:3000/users");
    console.log(response.data);

    setUsers(response.data);
  };

  // Add user

  const AddUser = (e) => {
    e.preventDefault();
    console.log(id, name);

    Axios.post("http://localhost:3000/users", {
      id,
      name,
    })
      .then(() => {
        setId("");
        setName("");
      })
      .catch((err) => {
        console.log(err);
      });

    setTimeout(() => {
      loadData();
    }, 500);
  };

  //Delete user
  const deleteUser = (id) => {
    console.log(id);

    Axios.delete(`http://localhost:3000/users/${id}`);

    setTimeout(() => {
      loadData();
    }, 500);
  };

  //Update User

  const updateUser = () => {
    console.log(updated.id, updated.name);

    Axios.put(`http://localhost:3000/users/${updated.id}`, {
      // id: updated.id,
      name: updated.name,
    })
    .then((response) => {
      console.log(response);
    })
    .catch((error)=>{
      console.log(error);
    })
    setTimeout(() => {
      loadData();
    }, 500);
  };

  return (
    <div className="App">
      <h1>JSON CRUD</h1>
      <div>

        {/* Add user buttons */}
        <input type="text"
          placeholder="Enter Id ...."
          value={id}
          onChange={(e) => setId(e.target.value)}
        />
        <input type="text"
          placeholder="Enter name ...."
          value={name}
          onChange={(e) => setName(e.target.value)}
        />

        <button onClick={AddUser}>Add</button>

       {/* delete user buttons */}
        {users.map((e) => (
          <div key={e.id} className="box">
            <div className="box-1">
              name : {e.name} <br />
              ID : {e.id}
            </div>
            <button
              onClick={() => {
                deleteUser(e.id);
              }}
            >
              Delete
            </button>


            {/* Update user buttons */}
            <div>
              <div className="box-2">
                <input
                  onChange={(e) =>
                    setUpdated({ ...updated, id: e.target.value })
                  }
                />
                <input
                  onChange={(e) =>
                    setUpdated({ ...updated, name: e.target.value })
                  }
                />

                <button onClick={updateUser}>Update</button>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default clientcrud;