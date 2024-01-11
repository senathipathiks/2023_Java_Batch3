import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from "./reportWebVitals";

// import Myclasscounter from './components/Myclasscounter';
// import Functioncounter from './components/Functioncounter';
// import Conditionalrender from './components/Conditionalrender';
// import Welcomeclass from './components/Welcomeclass';
// import Form from './components/Form';
// import Eventbindclass from './components/Eventbindclass';
//import Functioncounter from './components/Functioncounter';
//import Validation from './components/Validation';
// import Listrender from './components/Listrender';
// import SubmitForm from './components/SubmitForm';
//import User from './components/User';
//import YupValidation from './components/YupValidation';
//import ValidationForm from './components/Validationform';
//import RouterExample from './components/RouterExample';
import Responsiveform from './components/Responsiveform';
import Parentmemo from './components/Parentmemo';
import App from '../../client/src/App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
