import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import AddEmployeeComponent from "./components/AddEmployeeComponent";
import FindEmployeeComponent from "./components/FindEmployeeComponent";
import UpdateEmployeeComponent from "./components/UpdateEmployeeComponent";
import MyComponent from "./components/MyComponent";

function App() {
  return (
    <div>
      <HeaderComponent />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<ListEmployeeComponent />}></Route>
          <Route path="/employees" element={<ListEmployeeComponent />}></Route>
          <Route
            path="/add-employee"
            element={<AddEmployeeComponent />}
          ></Route>
          <Route
            path="/edit-employee/:id"
            element={<AddEmployeeComponent />}
          ></Route>
          <Route
            path="/find-employee"
            element={<FindEmployeeComponent />}
          ></Route>
          <Route
            path="/update-employee"
            element={<UpdateEmployeeComponent />}
          ></Route>
          <Route path="/My-Component" element={<MyComponent />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
