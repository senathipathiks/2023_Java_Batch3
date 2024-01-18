import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
import Responsiveform from './components/Responsiveform';

// import Myapp from './components/Myapp';
// import Myapps from './components/Myapps';
// import Mylogin from './components/Mylogin';
// import MyClassapp from './components/MyClassapp';
// import Count from './components/Count';
// import Myfunccounter from './components/Myfunccounter';
// import Subscribe from './components/Subscribe';
// import Eventbind from './components/Eventbind';
// import Conditionalrend from './components/Conditionalrend';
// import ClassSubscribe from './components/ClassSubscribe';
// import Listrender from './components/Listrender';
// import Formtextfield from './components/Formtextfield';
// import Submitform from './components/Submitform';
import User from './components/User';
import Memo from './components/Memo';
// import Responsiveform from './components/Responsiveform';




const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App />  */}
    {/* <Myapp/>
    <Myapp name="Arun" topic="React"></Myapp>
    <p>Hello Alll</p> */}
     {/* <Myapps/>
    <MyClassapp/>
    <Mylogin/>
    <Count/>
    <Myfunccounter/>
    <Subscribe/>
    <Eventbind/>
    <Conditionalrend/>
    <ClassSubscribe/>
    <Listrender/>
    <Formt
    // {<User/>
    {/* <ResponsiveLogin/> */}
    {/* <Submitform/> */}
   
    {/* <Responsiveform/> */}
    <Memo/>
    
    {/* <User/> */}
   
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
