import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Router,Routes, Route  } from 'react-router-dom';
import Home from './Component/Home';
// import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import EditUser from './Component/EditUser';
import Navbar from './Component/Navbar';
import NavbarCustomer from './Component/NavbarCustomer';

import AddUser from './Component/AddUser';
import HomeCustomer from './Component/HomeCustomer';
import AddUserCustomer from './Component/AddUserCustomer';
import EditUserCustomer from './Component/EditUserCustomer';

function App() {
  return (
    <div>

  
      <BrowserRouter> 
       
       <Navbar/>
      <Routes>
          <Route exact path='/' element = {<Home />} />
          <Route exact path='/AddUser' element={<AddUser/>}/>
          <Route exact path='/EditUser/:vehicleId' element = {<EditUser />} />

      </Routes> 
      
       </BrowserRouter>


{/* *********************************************************************************************************** */}


      {/* <BrowserRouter>
    
      <NavbarCustomer/>
      <Routes>
          <Route exact path='/' element = {<HomeCustomer />} />
          <Route exact path='/AddUserCustomer' element={<AddUserCustomer/>}/>
          <Route exact path='/EditUserCustomer/:customerId' element = {<EditUserCustomer />} />

      </Routes>
      
      </BrowserRouter> */}
     
      
    </div>
  );
}

export default App;
