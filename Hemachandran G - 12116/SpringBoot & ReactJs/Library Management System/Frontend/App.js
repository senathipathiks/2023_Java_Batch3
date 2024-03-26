import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Router,Routes, Route  } from 'react-router-dom';
import Home from './Component/Home';
// import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import EditUser from './Component/EditUser';
import Navbar from './Component/Navbar';
import AddUser from './Component/AddUser';

function App() {
  return (
    <div>

  
      <BrowserRouter>
      {/* <Router> */}
      <Navbar/>
      <Routes>
          <Route exact path='/' element = {<Home />} />
          <Route exact path='/AddUser' element={<AddUser/>}/>
          <Route exact path='/EditUser/:vehicleId' element = {<EditUser />} />

      </Routes>
      {/* </Router> */}
      </BrowserRouter>
     
      
    </div>
  );
}

export default App;
