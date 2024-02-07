import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
// import reportWebVitals from './reportWebVitals';
// import First from './components/First';
// import Class from './components/Class';
// import Login from './components/Login';
// import Count from './components/Count';
// import Countfunc from './components/Countfunc';
// import Subclass from './components/Subclass';
// import Subfunc from './components/Subfunc';
// import Destructpros from './components/Destructpros';
// import Eventbind from './components/Eventbind';
// import Conditional from './components/Conditional';
// import Textfield from './components/Textfield';
// import Submitform from './components/Submitform';
// import Listrender from './components/Listrender';
// import User from './components/User';
// import Validationfunc from './components/Validationfunc';
// import Responsiveapp from './components/Responsiveapp';
// import Appone from './components/Appone';
import Router from './components/Router'
import Memo from './components/ParentComponent';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <First place="Theni" clg="CIT" >
      <p>Self information</p>
      </First> */}
    
    {/* <Class place="Coimbatore">
      <p>This is a paragraph</p>
      </Class>  */}
    {/* <Login /> */}
    {/* <Count /> */}
    {/* <Countfunc /> */}
    {/* <Subclass /> */}
    {/* <Subfunc /> */}
    {/* <Destructpros place='Theni' clg='CIT' /> */}
    {/* <Eventbind /> */}
    {/* <Conditional /> */}
    {/* <Textfield /> */}
    {/* <Submitform /> */}
    {/* <Listrender/> */}
    {/* <User /> */}
    {/* <Validationfunc /> */}
    {/* <Router/> */}
    {/* <Responsiveapp /> */}
    {/* <Appone /> */}
    <Memo />

  </React.StrictMode>
  
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();
