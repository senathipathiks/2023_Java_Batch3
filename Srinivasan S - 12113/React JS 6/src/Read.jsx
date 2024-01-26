import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import {  useParams } from "react-router-dom";
import axios from "axios";

function Read() {
  const [data, setData] = useState(null);
  const { id } = useParams();

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get(`http://localhost:3000/users/${id}`);
        setData(response.data);
      } catch (error) {
        console.error("Error fetching data:", error);
      }
    };

    fetchData();
  }, [id]);

  if (!data) {
    return <div>Loading...</div>;
  }

  return (
    <div className="d-flex flex-column  justify-content-center align-items-center  bg-light  vh-100 ">
      <div className="w-50 border bg-white  shadow px-5 pb-5 rounded ">
        <h1>Detail of user</h1>
        <p>ID: {data.id}</p>
        <p>Name: {data.name}</p>
        <p>Email: {data.email}</p>
      </div>
    </div>
  );
}
export default Read;
