import React from 'react';
import ReactDOM from 'react-dom/client';
// import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
// import Myapp from './components/day1/Myapp';
// import Class from './components/day1/Class';
// import Mylogin from './components/day1/Mylogin';
// import Myapp1 from './components/Day2/Myapp1';
// import MyCounter from './components/Day2/MyCounter';
// import Myfuncounter from './components/Day2/Myfuncounter';
// import ClassSubscribe from './components/Day2/ClassSubscribe';
// import FunctSubscribe from './components/Day2/FunctSubscribe';
// import Mydestrcture from './components/Day2/Mydestrcture';
// import Eventbind from './components/Day2/Eventbind';
// import CondionalRender from './components/Day2/CondionalRender';
// import ListRender from './components/Day3/ListRender';
// import TextField from './components/Day3/TextField';
// import SubmitForm from './components/Day3/SubmitForm';
// import UserJson from './components/Day3/UserJson';
// import ValidationForm from './components/Day3/ValidationForm';
// import RouterEx from './components/Day3/RouterEx';
// import FormEx1 from './components/Day3/FormEx1';
// import NavHome from './components/Day3/NavHome';
import NavBar from './components/nav-bar/src/NavBar';
import Memo from './components/Day4/Memo';
// import New from './components/Day3/New'


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
      {/* <App/> */}
      {/* <Myapp1/> */}

      {/* <Class/>
      <Myapp/>
      <Mylogin/>
      <Myapp1 name="Ram" topic="React">
      <p>Hello All</p>
      </Myapp1>
      <MyCounter/>
      <Myfuncounter/>  
      <ClassSubscribe/> 
      <FunctSubscribe/>
      <Mydestrcture/>
      <Eventbind/>
      <CondionalRender/> */}

      {/* <ListRender/>
      <TextField/>
      <SubmitForm/>
      <UserJson/>
      <ValidationForm/>
      <RouterEx/> */}
      {/* <FormEx1/> */}
      {/* <New/> */}
      {/* <NavHome/> */}
      {/* <NavBar/> */}
      <Memo/>
  </React.StrictMode>
  
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
