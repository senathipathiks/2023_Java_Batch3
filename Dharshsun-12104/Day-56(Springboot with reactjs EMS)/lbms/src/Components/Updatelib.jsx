import React from 'react'
import Allservices from '../Service/Allservices';
import { useParams,useNavigate,Link } from "react-router-dom";
import { useEffect } from 'react';


export default function Updatelib() {
  let navigate = useNavigate();
  const {lid}=useParams();
  const [libr, setLibr] = React.useState({
    bname: "",
    price: "",
    
  });

  const { bname,price } = libr;

  useEffect(()=>{

    Allservices.findLib(lid).then((res)=>{  
        console.log(res.data)
        setLibr(res.data);        
     }).catch((err)=>console.log(err))  
 },[])

  const handleChange = (e) => {
    setLibr({ ...libr, [e.target.name]: e.target.value });
  };

  const onsubmit = async (e) => {
    e.preventDefault();
    await Allservices.Addlib(libr);
    alert('Data inserted successfully');
    navigate("/homelib");
  };

    
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
              <form onSubmit={onsubmit}>
                <div className="form-group row">
                  <label for="colFormLabelSm" className="col-sm-3 col-form-label col-form-label-sm">Name</label>
                  <div className="col-sm-9">
                    <input type="text" className="form-control form-control-sm"
                      id="colFormLabelSm"
                      placeholder="Enter bookname"
                      name='bname'
                      value={bname}
                      onChange={handleChange}
                    />
                  </div>
                </div>
                <div className="form-group row">
                  <label for="colFormLabel" className="col-sm-3 col-form-label">Price</label>
                  <div className="col-sm-9">
                    <input type="number" className="form-control" id="colFormLabel"
                      name='price'
                      value={price}
                      onChange={handleChange}
                      required
                      placeholder="Enter price"
                    />
                  </div>
                </div>
                
               
                <div className="form-group row">
                  <div className="col-sm-9 offset-sm-3">
                    <input type='submit' value="Update"  className="btn btn-primary p-1 m-2 "/>
                    <Link to="/homelib">    <button className="btn btn-warning p-1 m-2 ">Back</button></Link>  
                  </div>
                  <div className="col-sm-9 offset-sm-3">
                  
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
