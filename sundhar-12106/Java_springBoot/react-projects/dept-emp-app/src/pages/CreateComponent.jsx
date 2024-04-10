import React, { useEffect, useState } from "react";
import { fetchById, save } from "../service/EmployeeService";
import { useNavigate } from "react-router-dom";
import { fetchDepartment, fetchIdList } from "../service/DepartmentService";

const CreateComponent = () => {
  const navigate = useNavigate();
  const [employee, setEmployee] = useState({
    id: "",
    name: "",
    gender: "male",
    email: "",
    phoneNo: "",
    address: "",
    salary: 0.0,
    department: {},
  });

  const [departmentList, setDepartmentList] = useState([]);

  useEffect(() => {
    fetchIdList()
      .then((res) => {
        console.log(res);
        setDepartmentList(res.data);
      })
      .catch((err) => console.log(err));
  }, []);

  const handleChange = (e) => {
    console.log(e.target.name + ": " + e.target.value);
    if (e.target.name === "department") {
      console.log("hello" + employee.department);
      if (!isNaN(e.target.value)) {
        // console.log("inside");
        fetchById(Number(e.target.value))
          .then((response) => {
            console.log(response.data);
            // employee.department = response.data;
            setEmployee({ ...employee, [e.target.name]: response.data });
          })
          .catch((error) => console.log(error));
      } else {
        alert("please select department id");
      }
    } else {
      console.log(e.target.name);
      setEmployee({ ...employee, [e.target.name]: e.target.value });
    }
  };

  console.log(employee);
  const submitForm = (e) => {
    e.preventDefault();
    console.log(employee);
    save(employee)
      .then((data) => {
        alert(`Data for ${employee.name} is saved..!`);
        navigate("/");
      })
      .catch(() => {
        alert("Error while saving data");
      });
  };

  const handleCancel = () => {
    navigate("/");
  };

  return (
    <div className="d-flex justify-content-center">
      <div className="container-fluid row d-flex  justify-content-center gap-3 mt-4 mb-4">
        {departmentList.length > 0 ? (
          <form
            action=""
            onSubmit={submitForm}
            className="form-floating col-6 border rounded pb-3  d-flex gap-3 flex-column mt-3"
          >
            <h4 className="text-center mt-2">Add Employee</h4>
            <div className="container pe-2 ">
              <label htmlFor="name">Name : </label>
              <input
                type="text"
                name="name"
                value={employee.name}
                onChange={(e) => {
                  handleChange(e);
                }}
                className="form-control"
              />
            </div>
            <div className="container row p-0 m-0">
              <div className="container col-3">
                <label htmlFor="name">Gender : </label>
                <select
                  className="form-select "
                  value={employee.gender}
                  name="gender"
                  onChange={(e) => {
                    handleChange(e);
                  }}
                >
                  <option value="male">Male</option>
                  <option value="female">female</option>
                </select>
              </div>

              <div className="conatiner pe-2 col-9">
                <label htmlFor="phone">phone : </label>
                <input
                  type="tel"
                  name="phoneNo"
                  value={employee.phoneNo}
                  onChange={(e) => {
                    handleChange(e);
                  }}
                  className="form-control "
                  id="phone"
                  required
                />
              </div>
            </div>
            <div className="conatiner">
              <label htmlFor="email">email : </label>
              <input
                type="email"
                name="email"
                value={employee.email}
                onChange={(e) => {
                  handleChange(e);
                }}
                className="form-control "
                id="email"
                required
              />
            </div>

            <div className="container m-0 p-0">
              <label htmlFor="address">address : </label>
              <textarea
                className="form-control"
                name="address"
                value={employee.address}
                onChange={(e) => {
                  handleChange(e);
                }}
                rows={3}
                cols={20}
              ></textarea>
            </div>
            <div className="conatiner">
              <label htmlFor="salary">salary : </label>
              <input
                type="text"
                name="salary"
                onChange={(e) => {
                  handleChange(e);
                }}
                className="form-control"
                id="salary"
                required
              />
            </div>
            <h4>Department Information : </h4>
            <div className="conatiner">
              <label htmlFor="deptname">dept ID : </label>
              <select
                className="form-select"
                name="department"
                value={employee.department.deptId}
                onChange={(e) => handleChange(e)}
                id=""
              >
                <option defaultValue={"select"}>select</option>
                {departmentList.map((dept) => (
                  <option value={dept.deptId} key={dept}>
                    {dept}
                  </option>
                ))}
              </select>
            </div>
            <div className="container">
              <button type="submit" className="btn btn-info">
                Save
              </button>
              <button onClick={handleCancel} className="btn btn-danger  ms-2">
                Cancel
              </button>
            </div>
          </form>
        ) : null}

        <div className="col-5 mt-3">
          <img
            className="object-fit-cover w-100 h-100 mt-0 rounded border "
            src="https://etimg.etb2bimg.com/thumb/msid-98506380,imgsize-435129,width-1200,height=765,overlay-ethr/workplace-4-0/learning-and-development/sacked-women-tech-employees-need-to-upskill-stay-relevant-experts.jpg"
            alt="employee"
          />
        </div>
      </div>
    </div>
  );
};

export default CreateComponent;
