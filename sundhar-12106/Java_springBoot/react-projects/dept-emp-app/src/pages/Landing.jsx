import React from "react";
import { useNavigate } from "react-router-dom";

const Landing = () => {
  const navigate = useNavigate();
  return (
    <div className="container d-flex justify-content-center vh-100 align-items-center">
      <div className="container border shadow rounded p-3 d-flex gap-3 justify-content-center ">
        <button
          className="btn btn-primary "
          onClick={() => {
            navigate("/employee");
          }}
        >
          Employee
        </button>
        <button
          className="btn btn-primary "
          onClick={() => {
            navigate("/department");
          }}
        >
          Department
        </button>
      </div>
    </div>
  );
};

export default Landing;
