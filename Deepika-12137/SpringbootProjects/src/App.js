import "./App.css";

import { BrowserRouter, Route, Routes } from "react-router-dom";
import Brand from "./Component/Brand";
import Inventory from "./Component/Inventory";
import Header from "./Component/Header";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <Routes>
          <Route path="/" element={<Brand />}></Route>
          <Route path="/brand" element={<Brand/>}></Route>
          <Route path="/inventory" element={<Inventory />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
