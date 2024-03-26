import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import AddInvent from './invents/AddInvent';
import EditInvent from './invents/EditInvent';
import ViewInvent from './invents/ViewInvent';
import DeleteInvent from './invents/DeleteInvent';
import Registration from './invents/Registration';
import Login from './invents/Login';

function App() {
  return (
    <div className="App">
      <Router>
      {/* <Navbar/> */}
      <Routes>
      <Route exact path="/" element={<Login/>}></Route>

        <Route exact path="/home" element={<Home/>}></Route>
        <Route exact path="/addinvent" element={<AddInvent/>}></Route>
        <Route exact path="/deleteinvents" element={<DeleteInvent/>}></Route>
        <Route exact path="/Register" element={<Registration/>}></Route>

        <Route exact path="/editinvent/:itemId" element={<EditInvent/>}></Route>
        <Route exact path="/viewinvent/:itemId" element={<ViewInvent/>}></Route>


      </Routes>

      </Router>
    </div>
  );
}

export default App;
