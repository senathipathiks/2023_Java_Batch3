import "./App.css";

import { BrowserRouter, Route, Routes } from "react-router-dom";

import Header from "./Component/Header";
import Shop from "./Component/Shop";
import Customer from "./Component/Customer";

function App() {
  return (
    <div className="App"  >
      <div className="img-fluid" style={{position:"absolute"}}>
        <img
        className="img-fluid"
        style={{height:"100vh", backgroundPosition:"cover"}}
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYX-7CWpwALp4QUy-1dpLU_5-xGsDl5b8mRrb6nQR9iQ&s"
          alt=""
        />
      </div>
      <div  style={{position:"relative"}}>
        <BrowserRouter>
          <Header />
          <Routes>
            <Route path="/" element={<Customer />}></Route>
            <Route path="/customer" element={<Customer />}></Route>
            <Route path="/shop" element={<Shop />}></Route>
          </Routes>
        </BrowserRouter>
      </div>
    </div>
  );
}

export default App;
