import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

const LaptopCreate = () => {

    const[id]=useState("");
    const[brand,brandChange]=useState("");
    const[configure,configureChange]=useState("");
    const[allocated_user,userChange]=useState("");
    const[allocated_on,timeChange]=useState("");
    const[allocation_period,periodChange]=useState("");
    const[validation,valChange]=useState(false);


    const navigate=useNavigate();

    const handlesubmit=(e)=>{
      e.preventDefault();
      const lapData={brand,configure,allocated_user,allocated_on,allocation_period};
      

      fetch("http://localhost:8000/laptop/",{
        method:"POST",
        headers:{"content-type":"application/json"},
        body:JSON.stringify(lapData)
      }).then((res)=>{
        alert('Saved successfully.')
        navigate('/laptop/listing');
      }).catch((err)=>{
        console.log(err.message)
      })


    }

    return (
        <div>

            <div className="row">
                <div className="offset-lg-3 col-lg-6">
                    <form className="container" onSubmit={handlesubmit}>

                        <div className="card" style={{"textAlign":"left"}}>
                            <div className="card-title">
                                <h2>Create Record</h2>
                            </div>
                            <div className="card-body">

                                <div className="row">

                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                            <label>ID</label>
                                            <input value={id} disabled="disabled" className="form-control"></input>
                                        </div>
                                    </div>

                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                            <label>Laptop Make</label>
                                            <input required value={brand} onBlur={e=>valChange(true)} onChange={e=>brandChange(e.target.value)} className="form-control"></input>
                                        {brand.length===0 && validation && <span className="text-danger">Brand Name is mandatory</span>}
                                        
                                        </div>
                                    </div>
                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                            <label>Configure</label>
                                            <input value={configure} onBlur={e=>valChange(true)} onChange={e=>configureChange(e.target.value)} className="form-control"></input>
                                            {configure.length===0 && validation &&  <span className="text-danger">Configure details  is mandatory</span>}
                                        </div>
                                    </div>
                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                            <label>Allocated user</label>
                                            <input value={allocated_user} onBlur={e=>valChange(true)} onChange={e=>userChange(e.target.value)} className="form-control"></input>
                                            {allocated_user.length===0 && validation &&  <span className="text-danger">Allocated user details  is mandatory</span>}
                                        </div>
                                    </div>
                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                        <label>Allocated on</label>
                                            <input value={allocated_on} onBlur={e=>valChange(true)} onChange={e=>timeChange(e.target.value)} className="form-control"></input>
                                            {allocated_on.length===0 && validation &&  <span className="text-danger">Allocated on details  is mandatory</span>}
                                        </div>
                                    </div>
                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                        <label>Allocation Period</label>
                                            <input value={allocation_period} onBlur={e=>valChange(true)} onChange={e=>periodChange(e.target.value)} className="form-control"></input>
                                            {allocation_period.length===0 && validation &&  <span className="text-danger">Allocation Period details  is mandatory</span>}
                                        </div>
                                    </div>

                                    <div className="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div className="form-group">
                                            <button className="btn btn-success" type="submit">Save</button>
                                            <Link to="/laptop/listing" className="btn btn-danger">Back</Link>
                                        </div>
                                    </div>

                                </div>

                            </div>

                        </div>

                    </form>

                </div>
            </div>
        </div>
    );
}

export default LaptopCreate;