import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
import "./Style.css"


const EmpDetail = () => {
    const { empid } = useParams();

    const [empdata, empdatachange] = useState({});

    useEffect(() => {
        fetch("http://localhost:8000/employee/" + empid).then((res) => {
            return res.json();
        }).then((resp) => {
            empdatachange(resp);
        }).catch((err) => {
            console.log(err.message);
        })
    }, []);
    return (
        <body>
        <div className="mainD">
            

               <div className="container">
                
            <div className="card row" style={{ "textAlign": "left" }}>
                <div className="card-title">
                    <h2 style={{textAlign:"center"}}>Details About Trainer</h2>
                </div>
                <div className="card-body"></div>

                {empdata &&
                    <div>
                        

                        <h3>Working Details About the Trainer</h3>
                        <h2>The Trainer ID :<b>{empdata.cd}</b> </h2>
                        <h2>The Trainer name : <b>{empdata.name}</b></h2>

                        <h5>Taken Batch : {empdata.batch}</h5>
                        <h5>Working Hours per Day : {empdata.ph}</h5>
                        <h5>Working Hours per Week : {empdata.pw}</h5>
                        <Link className="btn btn-danger" to="/">Back to Listing</Link>
                    </div>
                }
            </div>
            </div>
            {/* </div>
            </div> */}
        </div >
        </body>
    );
}

export default EmpDetail;