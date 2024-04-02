import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import HomeUser from './Components/HomeUser';
import Insert from './Components/Insert';
import Navbar from './Components/Navbar';
import Insertlib from './Components/Insertlib';
import UpdateUser from './Components/UpdateUser';
import HomeLib from './Components/HomeLib';
import Updatelib from './Components/Updatelib';

function App() {
  return (
    <div className="App">
     <Router>
      <Navbar/>
  <Routes>
  <Route exact path="/"element={<HomeUser/>}></Route>
     <Route exact path="/insertus"element={<Insert/>}></Route>
     <Route exact path="/insertlib"element={<Insertlib/>}></Route>
    <Route  exact path="/updates/:uid" element={<UpdateUser/>}></Route>
    <Route exact path="/homelib"element={<HomeLib/>}></Route>
    <Route  exact path="/updatess/:lid" element={<Updatelib/>}></Route>
    {/* <Route  exact path="/find/:sid" element={<Find/>}></Route>
    <Route  exact path="/view/:sid" element={<View/>}></Route>   */}


  </Routes>

    </Router>
    </div>
  );
}

export default App;
