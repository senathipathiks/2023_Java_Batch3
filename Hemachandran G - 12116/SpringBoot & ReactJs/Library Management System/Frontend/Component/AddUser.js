import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import BookServices from '../Services/BookServices';

function AddUser() {

    const navigate = useNavigate();
    const [lib, setLib] = useState({
        bookName:"",
        authorName:"",
        bookPrice:"",
        bookType:""
    })

    // const { bookName, authorName, bookPrice,
    //     bookType} = lib;

    const onInputChange = (e) => {
        setLib({ ...lib, [e.target.name]: e.target.value });

    }

    // const onPost = async (e) => {
    //     e.preventDefault()
    //     console.log(vehi);
    //     await axios.post("http://localhost:8001/Create", vehi)
    //     window.alert("Record Created Succesfully !")
    //     navigate("/")

    // }

    const onPost = async (e) =>{
        // e.preventDefault();
        console.log(lib)
        BookServices.CreateBook(lib)
        
        alert("Added Successfully !")
        navigate("/")
        
    }

    

    return (

        <div className='container'>

            <div className='row d-flex align-items-center justify-content-center'>
                <div className='col-md-6 dark-md-3 border rounded p-4 mt-2 shadow'>
                    <h2 className="text-center m-4">Insert Book Details</h2>
                    <form onSubmit={(e) => onPost(e)}>
                        <div className='mb-3'>
                            <label htmlFor='bookName' className='form-label'>Book Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Book Name'  name='bookName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='authorName' className='form-label'>Author Name: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Author Name'  name='authorName' required onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='bookPrice' className='form-label'>Book Price: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Price'  name='bookPrice'required  onChange={(e) => onInputChange(e)} />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='bookType' className='form-label'>Book Type: </label>
                            <input type={"text"} className='form-control' placeholder='Enter Book Type'  name='bookType' required onChange={(e) => onInputChange(e)} />
                        </div>
                        
                        <button type="submit" className='btn btn-outline-primary'>Submit</button>
                        <Link type="submit" to="/" className='btn btn-outline-danger mx-2'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default AddUser