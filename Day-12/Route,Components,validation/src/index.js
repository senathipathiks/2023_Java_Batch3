import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import Lg from './Components/Lg';
// import App from './App';
import reportWebVitals from './reportWebVitals';
// import Myform from './Components/Myform';
// import LoginHander from './Components/LoginHander';
// import ListFunction from './Components/ListFunction';
// import FormClass from './Components/FormClass';
// import HandlingFrom from './Components/HandlingFrom';
// import JsonForm from './Components/JsonForm';
// import NewFormHandling from './Components/NewFormHandling';
// import RouterExample from './Components/RouterExample';
// import ResponsiveForm from './Components/ResponsiveForm';
// import ResForm from './Components/ResForm';
// import PropsFile from './Components/PropsFile';
// import States from './Components/States';
// import ComInCom from './Components/ComInCom';
// import States2 from './Components/States2';
// import Counter from './Components/Counter';
// import CounterFun from './Components/CounterFun';
// import Welcome from './Components/Welcome';
// import FunWelcome from './Components/FunWelcome';
// import ClickHand from './Components/ClickHand';
// import ConditionalRender from './Components/ConditionalRender';
// import Ternary from './Components/Ternary';
// import Myform from './Components/Myform';
// import memoReact from './Components/MemoFunc';
import MemoFunc from './Components/MemoFunc';

const root = ReactDOM.createRoot(document.getElementById('root'));
// const cars =["Ford","Audi","Rolls Roys"];
root.render(
  <React.StrictMode>
    {/* <PropsFile  color="red" FontSize="24px"
    >

      <p><b>This is another child Element, like a Props children</b></p>
    </PropsFile> */}
    
    {/* <PropsFile/> */}
    {/* <States/> */}
    {/* <ComInCom Name="Prashanth" Age ="21"/> */}

    {/* <States2/> */}
    {/* <Counter/>
    <CounterFun/> */}
    {/* <Welcome/>
    <FunWelcome/> */}
    {/* <ClickHand/> */}
    {/* <ConditionalRender/> */}
    {/* <Ternary/> */}
    {/* <Lg cars={cars}></Lg> */}
    {/* <Myform/> */}
     {/* <LoginHander/> */}
    {/* <ListFunction/>  */}
    {/* <FormClass/> */}
    {/* <HandlingFrom/> */}
    {/* <JsonForm/> */}
    {/* <NewFormHandling/> */}
    {/* <RouterExample/> */}
    {/* <ResponsiveForm/> */}
    {/* <ResForm/> */}
    <MemoFunc/>
    
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
