import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Demo from './components/Demo';
import Demo1 from './components/Demo1';
import Login from './components/Login';
import Registration from './components/Registration';
import ClassEg1 from './components/ClassEg1';
import Consteg1 from './components/Consteg1';
import Funccounter from './components/Funccounter';
import Subscribe from './components/Subscribe';
import Subsfun from './components/Subsfun';
import Conditionalformating from './components/Conditionalformating';
import Props from './components/Props';
import ComInCom from './components/ComInCom';
import Car from './components/Car';
import BUs from './components/BUs';
import Logical from './components/Logical';
import MapEg1 from './components/MapEg1';
import MemoEg1 from './components/MemoEg1';
import Form from './components/Form';
import Button from './components/Button';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Demo/> */}
    {/* <Demo name="Srini" topic="React">
      <p>Hello this is react</p>
    </Demo> */}
    {/* <Demo1 /> */}

    {/* <Login/> */}

    {/* <Registration/> */}

    {/* <ClassEg1 name="Srini" desig="Working in Relevantz">
    <p>Hello..this is children</p> 
    </ClassEg1> */}

    {/* <Consteg1 name="State" topic="components" /> */}

    {/* <Funccounter/> */}

    {/* <Subscribe/> */}
    {/* <Subsfun/> */}
    {/* <Conditionalformating/> */}

    {/* <Car brand="Audi"/> */}
    <BUs title ="Leyland"/>
    {/* <ComInCom/> */}
    {/* <Logical/> */}
    {/* <MapEg1/> */}
    {/* <MemoEg1/> */}
    {/* <Form/> */}
    {/* <Button/> */}
    
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
