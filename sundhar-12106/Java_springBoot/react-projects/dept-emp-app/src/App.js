import { useEffect } from "react";
import LandingPage from "./components/LandingPage";
import { fetchAll } from "./service/EmployeeService";
import Home from "./pages/Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import CreateComponent from "./pages/CreateComponent";
import Landing from "./pages/Landing";
import DeptCreate from "./pages/DeptCreate";
import ImageUploader from "./pages/ImageUploader";
import SignIn from "./components/Signin";

function App() {
  return (
    <div className="App">
      {/* <Router>
        <Routes>
          <Route path="/" Component={Landing} />
          <Route path="/department" Component={DeptCreate} />
          <Route path="/employee" Component={Home} />
          <Route path="/add" Component={CreateComponent} />
        </Routes>
      </Router> */}
      {/* <ImageUploader /> */}
      <SignIn />
    </div>
  );
}

export default App;
