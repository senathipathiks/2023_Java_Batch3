import logo from './logo.svg';
import { BrowserRouter, Router,Routes, Route  } from 'react-router-dom';

import './App.css';
import Home from './Component/Home';
import AddUser from './Component/AddUser';
import Navbar from './Component/Navbar';
import EditUser from './Component/EditUser';
import HomeAdmin from './Component/HomeAdmin';
import AddUserAdmin from './Component/AddUserAdmin';
import EditUserAdmin from './Component/EditUserAdmin';

function App() {
  return (
    <div className="App">
      

      
      <BrowserRouter> 
       
       <Navbar/>
      <Routes>
          <Route exact path='/' element = {<Home />} />
          <Route exact path='/AddUser' element={<AddUser/>}/>
          <Route exact path='/EditUser/:usersId' element = {<EditUser />} />

      </Routes> 
      
       </BrowserRouter>

{/* *********************************************************************************** */}



<BrowserRouter> 
       
       <Navbar/>
      <Routes>
          <Route exact path='/' element = {<HomeAdmin />} />
          <Route exact path='/AddUser' element={<AddUserAdmin/>}/>
          <Route exact path='/EditUserAdmin/:adminId' element = {<EditUserAdmin />} />

      </Routes> 
      
       </BrowserRouter>


    </div>
  );
}

export default App;
