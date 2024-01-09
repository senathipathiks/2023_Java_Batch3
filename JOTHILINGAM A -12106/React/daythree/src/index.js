import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import FormValidTskOne from './Day3New/FormValidTskOne';
import ParentComponent from './DaY4/ParentComponent';
import TodoList from './DaY4/TodoList';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}

    {/* <FormValidTskOne></FormValidTskOne> */}
    <TodoList></TodoList>
    {/* <ParentComponent></ParentComponent> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
