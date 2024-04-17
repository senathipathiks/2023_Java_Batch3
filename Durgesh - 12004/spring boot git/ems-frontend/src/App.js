import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from './layout/Navbar';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import AddEmployee from './employee/AddEmployee';
import EditEmployee from './employee/EditEmployee';
import ViewEmployee from './employee/ViewEmployee';
// import UpdateEmployee from './employee/UpdateEmployee';


function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>

        <Routes>
          <Route exact path="/" element={<Home/>}/>
          <Route exact path="/add" element={<AddEmployee/>}/>
          {/* <Route exact path="/update/:id" element={<UpdateEmployee/>}/> */}
          <Route exact path="/edit/:id" element={<EditEmployee/>}/>
          <Route exact path="/view/:id" element={<ViewEmployee/>}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
