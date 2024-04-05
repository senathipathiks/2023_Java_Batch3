import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import Loading from '../UtilitiesComponents/Loading';

const Home = () => {

    const navigate = useNavigate();

    const[flag,setFlag] = useState();

    const handleClick = (e) =>{
        e.preventDefault();
        setFlag(true);
        setTimeout(()=>{navigate('/product')},2000)
    };

    return (
        <div id='home' className='container mt-5'>
            <div className='card w-75 shadow mx-auto'>
                <div className='card-title text-center  mt-5 mb-3'>
            <h1>Welcome to the home page!</h1></div>
            <div className='card-body ms-5 h5'>
            <p>This is a simple website created using HTML and CSS. The purpose of this site is to provide an example for beginners</p>
            <p>This is a simple application that showcases some of my skills in web development.  The main features include:</p>
            <p>This is a simple example of a Landing Page site built with React.js.</p> 
            <p>This is a Ssimple website for Inventory Management</p>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Facilis nihil sequi praesentium ratione nostrum exercitationem, sapiente odit temporibus, dicta enim mollitia cum vitae maxime unde laborum repudiandae quibusdam libero assumenda!</p>
            </div>
            <div className='card-footer border-0 text-center'>
            <button className="btn btn-primary" onClick={(e)=>handleClick(e)}>Get Started</button>
            </div>
            </div>
            <Loading  flag={flag}/>
        </div>
    );
}

export default Home;
