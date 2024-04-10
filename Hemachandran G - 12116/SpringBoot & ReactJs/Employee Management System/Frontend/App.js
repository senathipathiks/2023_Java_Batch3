import React from 'react';
import './App.css';
import {BrowserRouter as Router, Route, Switch, Routes} from 'react-router-dom'
import ListEmployee from './Components/ListEmployee';
import Header from './Components/Header';
import Footer from './Components/Footer';
import CreateEmployee from './Components/CreateEmployee';
import ViewEmployee from './Components/ViewEmployee';

function App() {
  return (
    <div>
        <Router>
          
              <Header />
              <ListEmployee />
                <div className="container">
                <Routes>
                          <Route path = "/" exact component = {<ListEmployee />}></Route>
                          <Route path = "/employees" component = {<ListEmployee/>}></Route>
                          <Route path = "/add-employee/:id" component = {<CreateEmployee />}></Route>
                          <Route path = "/view-employee/:id" component = {<ViewEmployee />}></Route> 
                          {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
                </Routes>
                </div>
             
              
        </Router> 
    </div>
    
  );
}

export default App;
