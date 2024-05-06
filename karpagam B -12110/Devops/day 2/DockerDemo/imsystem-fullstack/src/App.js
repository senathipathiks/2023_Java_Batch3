import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Login from './pages/Login';


import './App.css';
import './index.css';
import AddPet from './pages/AddPet';
import AddUser from './pages/AddUser';
import PetHome from './index/PetHome';
import UserHome from './index/UserHome';
import AppointmentHome from './index/AppointmentHome';


function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route exact path="/" element={<Login />}></Route>

          <Route exact path="/home" element={<PetHome />}></Route>
          <Route exact path="/user" element={<UserHome />}></Route>

          <Route exact path="/app" element={<AppointmentHome/>}></Route>

          <Route exact path="/addpet" element={<AddPet />}></Route>
          <Route exact path="/addbrand" element={<AddUser/>}></Route>






        </Routes>
      </Router>

    </div>
  );
}

export default App;
