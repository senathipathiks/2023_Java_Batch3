
import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddUser from './users/AddUser';
import EditUser from './users/EditUser';
import ViewUser from './users/ViewUser';
import Search from './users/Search';
import DeleteUser from './users/DeleteUser';
import LoginSignup from './pages/LoginPage/LoginSignup';

function App() {
  return (
    <div className="App">
      <Router>
      <Navbar/>

      <Routes>
       
      <Route exact path="/" element={<Home/>} />
      <Route exact path="/adduser" element={<AddUser/>} />
      <Route exact path="/edituser/:id"  element={<EditUser />}/>
      <Route exact path="/viewuser/:id"  element={<ViewUser />}/>
      <Route exact path="/searchuser" element={<Search/>}></Route>
      <Route exact path="/deleteuser" element={<DeleteUser/>}></Route>
      <Route exact path="/userdetails" element={<Home/>}></Route>
      </Routes>
      </Router>
    
    </div>
  );
}

export default App;
