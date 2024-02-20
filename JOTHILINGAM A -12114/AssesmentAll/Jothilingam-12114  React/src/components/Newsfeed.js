import React, { useState, useEffect } from "react";
import axios from "axios";
// import EmpUpdate from "./empUpdate";
// import { Button, Modal, Form } from "react-bootstrap";
// import { Button , Modal ,Form} from "react-bootstrap";
import NewsUppdate from "./NewsUppdate";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min";

function Newsfeed() {
    const [Newsfeeds, setNewsfeeds] = useState([]);
    const [newNewsfeeds , setnewNewsfeeds] =useState({
        id: "",
        info: "",
        source: " ", 
        Verifiedby:" " ,
         ApprovedBy:" ",
         PostedOn : " ",
    });
    const[updatedenews , setupdatednews] =useState(null);

    useEffect(() =>{
        fetchnews();
    }, []);


    // crd op

    const fetchnews =() =>{
        axios.get("http://localhost:3003/news")
        .then((response)=> setNewsfeeds(response.data))
        .catch((error)=> console.log("erroe frtching data",error));
    };

    const addNews = () => {
        axios
          .post("http://localhost:3003/news", newNewsfeeds)
          .then(() => {
            fetchnews();
            setnewNewsfeeds({  
            id: "",
            info: "",
            source: "", 
            Verifiedby:" " ,
             ApprovedBy:" ",
             PostedOn : " ", });
          })
          .catch((error) => console.error("Error adding news:", error));
      };
      const updatenews = (id, updatedData) => {
        axios
          .put(`http://localhost:3003/news/${id}`, updatedData)
          .then(() => fetchnews())
          .catch((error) => console.error("Error updating employee:", error));
      };

      const deleteNews = (id) =>{
        axios
      .delete(`http://localhost:3003/news/${id}`)
      .then(() => fetchnews())
      .catch((error) => console.error("Error deleting employee:", error));
      }

      const handleUpdateClick=(news) =>{
        setupdatednews(Newsfeeds);
      }

      const handleUpdateSubmit =(updatedenews) => {
        updatenews(updatedenews.id ,updatedenews);

      };



    

  return (
    <div className="container mt-4 ">
        <div className="container">
            <h1 class="text-center text-primary fw-bold fs-
            2">Newsfeed System</h1>
         <div className="mb-3 ">
          <label className="col g-8 ">id:</label>
          <input
          className=" "
            type="text"
            value={newNewsfeeds.id}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, id: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label className="col g-8 ">Newsinfo</label>
          <input
          className=""
            type="text"
            value={newNewsfeeds.info}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, info: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label className="col g-8 ">Source</label>
          <input
          className=""
            type="text"
            value={newNewsfeeds.source}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, source: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label className="col g-8 ">VerifiedBy</label>
          <input
          className=""
            type="text"
            value={newNewsfeeds.Verifiedby}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, Verifiedby: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label className="col g-8 ">ApprovedBy</label>
          <input
          className=""
            type="text"
            value={newNewsfeeds.ApprovedBy}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, ApprovedBy: e.target.value })
            }
          />
        </div>

        <div className="mb-3 ">
          <label className="col g-8 ">PostedOn</label>
          <input
          className=""
            type="text"
            value={newNewsfeeds.PostedOn}
            onChange={(e) =>
                setnewNewsfeeds({ ...newNewsfeeds, PostedOn: e.target.value })
            }
          />
        </div>

        <center>

        <button className="btn btn-primary mr-2" onClick={addNews}>
          Add News
        </button> </center>
            </div>
            <table className="table table-info mt-4">
        <thead>
          <tr>
            <th>ID</th>
            <th>News Info</th>
            <th>Source</th>
            <th>Verifiedby</th>
            <th>ApprovedBy</th>
            <th>PostedOn</th>
            <th>Actions</th>
           
          </tr>
        </thead>
        <tbody>
          {Newsfeeds.map((news) => (
            <tr key={news.id}>
              <td>{news.id}</td>
              <td>{news.info}</td>
              <td>{news.source}</td>
              <td>{news.Verifiedby}</td>
              <td>{news.ApprovedBy}</td>
              <td>{news.PostedOn}</td>
              

              <td>
                <button
                  className="btn btn-warning   "
                  onClick={() => handleUpdateClick(news)}
                >
                  Update
                </button>
                <button
                  className="btn btn-danger ms-3"
                  onClick={() => deleteNews(news.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
{updatedenews&&(
<NewsUppdate news={updatedenews} onUpdate={handleUpdateSubmit}/>
        
)} 


       
    
    </div>
  );
};

export default Newsfeed
