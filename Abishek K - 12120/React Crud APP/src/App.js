import logo from './logo.svg';
import './App.css';

import {BrowserRouter,Route,Routes} from 'react-router-dom'
import EmpCreate from './Component/EmpCreate';
import EmpDetail from './Component/EmpDetails';
import EmpEdit from './Component/EmpEdit';
import EmpListing from './Component/EmpListing';

function App() {
 
  return (
    <body>
    <div className="App">
      <h1>React JS CRUD Operations</h1>
      <div className='cont'>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<EmpListing />}></Route>
          <Route path='/employee/create' element={<EmpCreate />}></Route>

          <Route path='/employee/detail/:empid' element={<EmpDetail />}></Route>
          <Route path='/employee/edit/:empid' element={<EmpEdit />}></Route>
        </Routes>
      </BrowserRouter>
      </div>
    </div>
    </body>


  );
  
}

export default App;
