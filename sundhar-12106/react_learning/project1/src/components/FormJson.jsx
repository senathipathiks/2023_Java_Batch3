import React, { useState } from "react";

function FormJson() {
  let submitHander = (e) => {
    e.preventDefault();
    const user = {
      username: enterName,
      age: Number(enterAge),
      hobby: selectHobby,
    };
    alert(JSON.stringify(user));
  };

  const Dummy_hobbies = [
    "Select",
    "Cricket",
    "Volley Ball",
    "batmiton",
    "Carrom",
  ];

  const [enterName, setUserName] = useState("");
  const [enterAge, setAge] = useState("");
  const [selectHobby, setHobby] = useState("select");

  return (
    <div className="container-fluid d-flex justify-content-center">
      <form action="" onSubmit={submitHander} className="border p-5 ">
        <h1 className="text-primary ">Register</h1>
        username:
        <br />
        <input
          type="text"
          name="name"
          value={enterName}
          onChange={(e) => {
            setUserName(e.target.value);
          }}
        />
        <br />
        age(years):
        <br />
        <input
          type="number"
          name="age"
          value={enterAge}
          onChange={(e) => setAge(Number(e.target.value))}
        />
        <br />
        Hobby:
        <br />
        <select
          name="hobby"
          id=""
          value={selectHobby}
          onChange={(e) => {
            setHobby(e.target.value);
          }}
        >
          {Dummy_hobbies.map((item, index) => (
            <option key={index + 1}>{item}</option>
          ))}
        </select>
        <br />
        <br />
        <input type="submit" className="btn btn-primary text-center" value="Submit" />
      </form>
    </div>
  );
}

export default FormJson;
