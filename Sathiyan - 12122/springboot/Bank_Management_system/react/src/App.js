import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import Transaction from "./component/Transaction";
import User from "./component/User";
import Header from "./component/Header";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Header />
        <Routes>
          <Route path="/" element={<Transaction />}></Route>
          <Route path="/transaction" element={<Transaction />}></Route>
          <Route path="/user" element={<User />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
