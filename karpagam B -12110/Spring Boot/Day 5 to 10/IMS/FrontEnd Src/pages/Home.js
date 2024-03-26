import React, { useEffect, useState } from 'react'
import axios  from 'axios'
import { Await, Link,useParams } from 'react-router-dom'

export default function Home() {

    const [invents,setInvents]=useState([])
    const [search, setSearch] = useState("");
    const [inventsearch,setInventsearch]=useState([]);

    const handleSubmit = (e) => {
      setSearch(e.target.value);
      onSearch();
    };
   
    const onSearch = async () => {
      await axios
        .get("http://localhost:8080/getStudentName?studentName=" + inventsearch)
        .then((result) => {
          console.log(result.status);
          setInventsearch(result.data);
        })
        .catch((err) => console.log(err));
    };

    //to pass the itemid we are creating useparams
    const {itemId}=useParams()


    //to load the information everytime the page loaded
    useEffect(()=>{
        // console.log("This is the react code by kavi")
        loadInvents();
        //if we didn't give array means it will run n time
    },[]);
    //async is to wait for the function and to execute the code line by line
    const loadInvents= async()=>{
        const result=await axios.get("http://localhost:8080/invents");
        setInvents(result.data);
    };

    const deleteInvent= async (itemId)=>{
      await axios.delete(`http://localhost:8080/invent/${itemId}`)
      loadInvents()
    }
  return (

    <><nav className="navbar navbar-expand-lg navbar-dark bg-secondary"
      id='navbar-custom'>
      <div className="container-fluid">
        <Link className="navbar-brand" to={"/"}><h4><i><b>INVENTORY MANAGEMENT SYSTEM</b></i></h4></Link>
        <button className="navbar-toggler" type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse mx " id="navbarSupportedContent">

          <Link className="btn btn-outline-light mx" to="/addinvent"><b>Insert Record</b></Link><br />

          <Link className="btn btn-outline-light" to="/deleteinvents" id="tbn"><b>Delete Record by Id</b></Link>
          <Link className="btn btn-outline-light mx" to="/Register" id="tbn"><b>Sign Up</b></Link>
          <Link className="btn btn-outline-light mx" to="/" id="tbn" ><b>Log Out</b></Link>  


        </div>
      </div>
    </nav><div className='container '>
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Enter Item Name to Search.."
          aria-label="Search"
          id="search"
          onChange={(e) => handleSubmit(e)} />


        <div className='py-4'><table className="table border shadow table table-success table-striped " id="main">
          <thead className="table-dark">
            <tr>
              <th scope="col">Item id</th>
              <th scope="col">Item Name</th>
              <th scope="col">price</th>
              <th scope="col">Quantity</th>
              <th scope="col">Actions</th>

            </tr>
          </thead>
          <tbody>
            {invents.filter((index) => {
              return search.toLowerCase() === ""
                ? index
                : index.itemName.toLowerCase().includes(search);
            })
              .map((invent, index) => (

                <tr>
                  <th scope="row" key={index}>{invent.itemId}</th>
                  <td>{invent.itemName}</td>
                  <td>{invent.price}</td>
                  <td>{invent.quant}</td>
                  <td><Link className="btn btn-primary mx-1" to={`/Viewinvent/${invent.itemId}`}>View</Link>
                    <Link className="btn btn-warning mx-1" to={`/Editinvent/${invent.itemId}`}>Edit</Link>
                    <button className="btn btn-danger mx-1" onClick={() => deleteInvent(invent.itemId)}>Delete</button></td>

                </tr>
              ))}

          </tbody>
        </table>
        </div>
      </div></>
  );
}

