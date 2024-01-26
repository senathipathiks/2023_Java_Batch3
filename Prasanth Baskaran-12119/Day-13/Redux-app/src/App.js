import React from  'react';
// import {Provider} from 'react-redux';
// import {store}from './configure-store'
// import{Container} from './counter/container'
import { Provider } from "react-redux";
import store from "./redux/store";
import DisplayTodos from './COmponents/DisplayTodos';
import TodoItem from './COmponents/TodoItem';
import Todos from './COmponents/Todos';
import "./main.css";



function App() {
  return (
    <div className="App">
      {/* <Provider store ={store}>
        <Container/>
      </Provider> */}
<h1
        initial={{ y: -200 }}
        animate={{ y: 0 }}
        transition={{ type: "spring", duration: 0.5 }}
        whileHover={{ scale: 1.1 }}
      >
        Todo App
      </h1>
      <div
        initial={{ y: 1000 }}
        animate={{ y: 0 }}
        transition={{ type: "spring", duration: 1 }}
      ></div>
<Provider store={store}>
     <DisplayTodos/>
     
     <Todos/>
     
    </Provider>
      
    </div>
  );
}

export default App;
