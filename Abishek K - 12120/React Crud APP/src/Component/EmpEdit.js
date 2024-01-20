import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";
import "./Style.css"

const EmpEdit = () => {
    const { empid } = useParams();

    //const [empdata, empdatachange] = useState({});

    useEffect(() => {
        fetch("http://localhost:8000/employee/" + empid).then((res) => {
            return res.json();
        }).then((resp) => {
            cdchange(resp.cd);
            namechange(resp.name);
            batchchange(resp.batch);
            phchange(resp.ph);
            pwchange(resp.pw);
            activechange(resp.isactive);
        }).catch((err) => {
            console.log(err.message);
        })
    }, []);

    const[cd,cdchange]=useState("");
    const[name,namechange]=useState("");
    const[batch,batchchange]=useState("");
    const[ph,phchange]=useState("");
    const[pw,pwchange]=useState("");
    const[active,activechange]=useState(true);
    const[validation,valchange]=useState(false);


    const navigate=useNavigate();

    const handlesubmit=(e)=>{
      e.preventDefault();
      const empdata={cd,name,batch,ph,pw,active};
      

      fetch("http://localhost:8000/employee/"+empid,{
        method:"PUT",
        headers:{"content-type":"application/json"},
        body:JSON.stringify(empdata)
      }).then((res)=>{
        alert('Saved successfully.')
        navigate('/');
      }).catch((err)=>{
        console.log(err.message)
      })

    }
    return ( 
        <body>
        <div className="mainE">

        <div className="row">
            <div className="offset-lg-3 col-lg-6">
                <form className="container" onSubmit={handlesubmit}>

                    <div className="card" style={{"textAlign":"left"}}>
                        <div className="card-title">
                            <h2 style={{textAlign:"center"}}>Edit Details</h2>
                        </div>
                        <div className="card-body">

                            <div className="row">

                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>ID</label>
                                        <input value={cd} onMouseDown={e=>valchange(true)} onChange={e=>cdchange(e.target.value)}  className="form-control"></input>
                                        {cd.length==0 && validation && <span className="text-danger">Please Enter the ID</span>}
                                    </div>
                                </div>

                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>Name</label>
                                        <input required value={name} onMouseDown={e=>valchange(true)} onChange={e=>namechange(e.target.value)} className="form-control"></input>
                                    {name.length==0 && validation && <span className="text-danger">Please Enter the name</span>}
                                    </div>
                                </div>

                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>Enter Batch Details</label>
                                        <input value={batch} onChange={e=>batchchange(e.target.value)} className="form-control"></input>
                                        {batch.length==0 && validation && <span className="text-danger">Please Enter the Batch</span>}
                                    </div>
                                </div>

                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>Working Hours per Day</label>
                                        <input value={ph} onChange={e=>phchange(e.target.value)} className="form-control"></input>
                                        {ph.length==0 && validation && <span className="text-danger">Enter the Hours</span>}
                                    </div>
                                </div>
                                <div className="col-lg-12">
                                    <div className="form-group">
                                        <label>Working Hours per Week</label>
                                        <input value={pw} onChange={e=>pwchange(e.target.value)} className="form-control"></input>
                                        {pw.length==0 && validation && <span className="text-danger">Enter the Hours</span>}
                                    </div>
                                </div>

                                <div className="col-lg-12">
                                    <div className="form-check">
                                    <input checked={active} onChange={e=>activechange(e.target.checked)} type="checkbox" className="form-check-input"></input>
                                        <label  className="form-check-label">Is Active</label>
                                        
                                    </div>
                                </div>
                                <div className="col-lg-12">
                                    <div className="form-group">
                                       <button className="btn btn-success" type="submit">Save</button>
                                       <Link to="/" className="btn btn-danger">Back</Link>
                                    </div>
                                </div>

                            </div>

                        </div>

                    </div>

                </form>

            </div>
        </div>
    </div>
    </body>
     );
}
 
export default EmpEdit;