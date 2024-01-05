import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
import Myapp from './components/Myapp';
import Myapps from './components/Myapps';
import Mylogin from './components/Mylogin';
import MyClassapp from './components/MyClassapp';
import Count from './components/Count';
import Myfunccounter from './components/Myfunccounter';
import Subscribe from './components/Subscribe';
import Eventbind from './components/Eventbind';
import Conditionalrend from './components/Conditionalrend';
import ClassSubscribe from './components/ClassSubscribe';




const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    <Myapp/>
    <Myapp name="Arun" topic="React"></Myapp>
    <p>Hello Alll</p>
    <Myapps/>
    <MyClassapp/>
    <Mylogin/>
    <Count/>
    <Myfunccounter/>
    <Subscribe/>
    <Eventbind/>
    <Conditionalrend/>
    <ClassSubscribe/>
    
    
    
   
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
