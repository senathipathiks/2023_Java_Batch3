import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Home from './Home';
import Create from './Create';
import Update from './Update';
import Read from './Read';
import "bootstrap/dist/css/bootstrap.min.css"

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/create" element={<Create />}/>
      <Route path="/update/:id" element={<Update/>} />
      <Route path="/Read/:id"element ={<Read/>}></Route>
    </Routes>
    </BrowserRouter>
     );
}

export default App;
