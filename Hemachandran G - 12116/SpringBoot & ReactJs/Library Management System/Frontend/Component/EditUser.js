import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import BookServices from '../Services/BookServices';

function EditUser() {

    const { bookId } = useParams()

    const navigate = useNavigate();
    const [lib, setLib] = useState({
        bookName: "",
        authorName: "",
        bookPrice: "",
        bookType: ""
    })

    const { bookName, authorName, bookPrice,
        bookType } = lib;



    const onInputChange = (e) => {
        setLib({ ...lib, [e.target.name]: e.target.value });

    }

    useEffect(() => {
        loadUser()
        // window.alert("load user executed");
    }, []);



    // const onPost = async (e) => {
    //     e.preventDefault()
    //     console.log(vehic);
    //     await axios.put(`http://localhost:8001/Update/${vehicleId}`, vehic)
    //     window.alert(" Details Updated  Succesfully !")
    //     navigate("/")

    // }

    const onPost = (e) => {
        e.preventDefault();
        BookServices.UpdateBook(bookId, lib)
        alert("Update Successfull !")
        navigate("/")

    }


    const loadUser = async () => {

        const result = await axios.get(`http://localhost:5001/GetById/${bookId}`);
        // window.alert("its load user");
        setLib(result.data)

    }



    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3  border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Edit Book</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='bookName' className='form-label'>Book Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Book Name' value={bookName} name='bookName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='authorName' className='form-label'>Author Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Author Name' value={authorName} name='authorName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='bookPrice' className='form-label'>Book Price: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Price' value={bookPrice} name='bookPrice' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='bookType' className='form-label'>Book Type: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Fuel Entity' value={bookType} name='bookType' required onChange={(e) => onInputChange(e)} />
                        </div>

                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default EditUser