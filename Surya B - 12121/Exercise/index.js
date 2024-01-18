import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
// import Myclassapp from './components/Myclassapp';
// import Count from './components/Count';
// import Listrender from './Listrender';
// import TextField from './TextField';
//import SubmitForm from './components/SubmitForm';
// import LoginForm from './components/LoginForm';
// import User from './components/LoginForm';
// import Welcome from './components/Welcome'; 
// import Myapp from './components/Myapp';
import Home from './WEB/Home';
// import RouterExample from './components/RouterExample';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
{/*    
    <Welcome name="Arun" topic="React" >
    <p>Hello All</p>
    </Welcome>
    <Myapp name = "Surya" topic = "Webpage">
      <p>Hello World</p>
    </Myapp> */}

    {/* <ValidationForm></ValidationForm> */}
  {/* <Myclassapp name = "Don">

  </Myclassapp>
  
  <Count></Count> */}
  {/* <SubmitForm></SubmitForm> */}
  {/* <Listrender></Listrender>
  <TextField></TextField>
  <SubmitForm></SubmitForm> */}
 {/* <User></User> */}
 
 <Home></Home>
{/* <RouterExample></RouterExample> */}
  </React.StrictMode>
);
  



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
