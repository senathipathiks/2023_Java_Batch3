import React, { useState } from 'react';
import axios from "axios";
import { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import BookServices from '../Services/BookServices';
// import "./Home.css";
function Home() {

  const {bookId} = useParams();

  const [count, setCount] = useState(0);
  const [lib, setLib] = useState([]);

  useEffect(() => {

    loadUsers();

  }, []);

  // const loadUsers = async () => {
  //   const result = await axios.get("http://localhost:8001/GetAll");
  //   console.log(result.data)
  //   setVehic(result.data)
  // }


  const loadUsers = (e)  =>{
    BookServices.GetAll().then((result)=>
    {
      setLib(result.data)
    }).catch((err)=>{console.error(err)})
  }


  // const deleteUser = async (vehicleId) => {
  //   await axios.delete(`http://localhost:8001/Delete/${vehicleId}`)
  //   loadUsers()
  // }

  const deleteUser = async(bookId)=>
  {
    BookServices.DeleteBook(bookId);
        alert('Deleted Successfully')
        loadUsers()
  }


  return (
    <div>
      <div id="page" className='py-4'>
        <div id="table">
          <table className="table table-dark border-radius: 10px">
            <thead>
              <tr>
                <th scope="col">Book ID</th>
                <th scope="col">Book Name</th>
                <th scope="col">Author Name</th>
                <th scope="col">Book Price</th>
                <th scope="col">Book Type</th>
                <th scope="col">Edit</th>
                <th scope="col">Remove</th>

              </tr>
            </thead>
            <tbody>

              {
                lib.map((library, index) => (
                  <tr>

                    <td>{library.bookId}</td>
                    <td>{library.bookName}</td>
                    <td>{library.authorName}</td>
                    <td>{library.bookPrice}</td>
                    <td>{library.bookType}</td>
                    <td><Link type="submit" to={`/EditUser/${library.bookId}`} className='btn btn-outline-primary'>Edit</Link></td>
                    <td><button type="submit" onClick={() => deleteUser(library.bookId)} className='btn btn-outline-danger'>Remove</button></td>

                  </tr>
                ))

              }



            </tbody>
          </table>

        </div>
      </div>
    </div>
  )
}



export default Home