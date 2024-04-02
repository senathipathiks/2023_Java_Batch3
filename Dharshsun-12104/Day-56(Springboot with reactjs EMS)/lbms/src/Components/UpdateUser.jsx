import React from 'react'
import { useState } from 'react'
import { useParams,useNavigate,Link } from "react-router-dom";
import { useEffect } from 'react';
import Allservices from '../Service/Allservices';

export default function UpdateUser() {

    let navigate=useNavigate();
    const {uid}=useParams();
    const[user,setUser]=useState({

        uname:"",
        uage:"",
        lib: { lid: "",bname:" ",price:" " }
    })


    useEffect(()=>{
        loaduser();
        Allservices.finduser(uid).then((res)=>{  
            setUser(res.data);        
         }).catch((err)=>console.log(err))  
     },[])
     const[idList,setidList]=React.useState([]);
    

     console.log(user)
        
    const{uname,uage}=user;

    const loaduser=async()=>{

        await Allservices.FindallId().then((response)=>{
            console.log(response.data);
            setidList(response.data);});  
    }

    const handleChange=(e)=>{
            if(e.target.name === 'lid'){
              setUser({...user,lib:{lid:e.target.value}})}
              else{
        setUser({...user,[e.target.name]:e.target.value})
              }
    }

    const submitevent=async(e)=>{
        e.preventDefault();
        await Allservices.Updateuser(user);
        alert("record updated sucessfully");
        navigate("/");
        
    }

  return (
    <div>
         <div className="container mt-5">
        <div className="row justify-content-center">
          <div className="col-md-6">
            <div className="card">
              <div className="card-header">
                <h5 className="card-title">Add Student</h5>
              </div>
              <div className="card-body">
                <form onSubmit={submitevent}>
                  <div className="form-group row">
                    <label
                      for="colFormLabel"
                      className="col-sm-3 col-form-label"
                    >
                      Name
                    </label>
                    <div className="col-sm-9">
                      <input
                        type="text"
                        className="form-control"
                        id="colFormLabel"
                        name="uname"
                        value={uname}
                        onChange={handleChange}
                        required
                        placeholder="Enter name"
                      />
                    </div>
                  </div>
                  <div className="form-group row">
                    <label
                      for="colFormLabelLg"
                      className="col-sm-3 col-form-label col-form-label-lg"
                    >
                      Age
                    </label>
                    <div className="col-sm-9">
                      <input
                        type="number"
                        className="form-control form-control-lg"
                        id="colFormLabelLg"
                        name="uage"
                        value={uage}
                        required
                        onChange={handleChange}
                        placeholder="Enter age"
                      />
                    </div>
                    <br></br>
                    &nbsp;
                    <div className="form-group row">
                      <label
                        for="colFormLabelLg"
                        className="col-sm-3 col-form-label col-form-label-lg"
                      >
                        Dept ID
                      </label>
                      <div className="col-sm-9">
                        <select
                        name="lid"
                        style={{width:"410px",height:"30px"}}
                        className="form-control form-control-lg"
                        value={user.lib.lid}
                        required
                        onChange={handleChange}
                          class="form-select"
                          aria-label="Default select example"
                        >
                          {
                            idList.map((id)=>
                            <option key={id}>{id}</option>
       
                            )}
                          
                        </select>
                      </div>
                    </div>
                    <div className="form-group row">
                      <div className="col-sm-9 offset-sm-3">
                        <input
                          type="submit"
                          value="Update"
                          className="btn btn-primary p-1 m-2 "
                        />
                        <Link to="/">
                          {" "}
                          <button className="btn btn-warning p-1 m-2 ">
                            Back
                          </button>
                        </Link>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
      
    </div>
  )
}
