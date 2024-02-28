import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Myapp from './components/Myapp';
import List from './components/List';
import { Mylogin } from './components/Mylogin'
import Mycounter from './components/Mycounter';
import MyfuncCounter from './components/MyfuncCounter';
import ClassSubscribe from './components/ClassSubscribe';
import FuncSubscribe from './components/FuncSubscribe';
import { Evenbind } from './components/Evenbind';
import Conditionalren from './components/Conditionalren';
import Listrender from './components/Listrender';
import Textfieldformhandler from './components/Textfieldformhandler';
import Submitform from './components/Submitform';
import Sena from './components/Userdefault';
import Loginvalidation from './components/Loginvalidation';
import RouterExample from './components/RouterExample';
import ParentComponent from '../../newapplication/src/Components/ParentComponent';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <Myapp name="Arun" topic="React" /> 
    <MyfuncCounter />
    <ClassSubscribe />
    <FuncSubscribe /> 
    <Evenbind />
    <Conditionalren />
    <Listrender />
    <Textfieldformhandler />
    <Submitform />
    <Sena /> */}
    {/* <Loginvalidation /> */}
    <ParentComponent />
    {/* <RouterExample /> */}



  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
