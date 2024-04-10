
// import './App.css';
import './App.css';
import Home from './Home';
import StudentsView from './component/student/StudentsView';
import NavBar from "./component/common/NavBar";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddStudents from './component/student/AddStudents';
import EditStudent from './component/student/EditStudent';
import StudentProfile from './component/student/StudentProfile';
import DepartmentsView from './component/student/DepartmentsView';
import AddDepartments from './component/student/AddDepartments';
import EditDepartment from './component/student/EditDepartment';
import DepartmentProfile from './component/student/DepartmentProfile';
// import AddStudents from "./component/student/AddStudents";
// import AddStudents from './student/AddStudents';
// // import EditStudent from "./component/student/EditStudent";
// import EditStudent from './student/EditStudent';
// // import StudentProfile from "./component/student/StudentProfile";
// import StudentProfile from './student/StudentProfile';
// // import DepartmentsView from "./component/student/DepartmentsView";
// import DepartmentsView from './student/DepartmentsView';
// // import AddDepartments from "./component/student/AddDepartments";
// import AddDepartments from './student/AddDepartments';
// // import EditDepartment from "./component/student/EditDepartment";
// import EditDepartment from './student/EditDepartment';
// // import DepartmentProfile from "./component/student/DepartmentProfile";
// import DepartmentProfile from './student/DepartmentProfile';


function App() {
  return (
    <main className="container mt-5">
      <Router>
        <NavBar />
        <Routes>
          <Route
            exact
            path="/"
            element={<Home />}></Route>
          <Route
            exact
            path="/view-students"
            element={<StudentsView />}></Route>
          <Route
            exact
            path="/add-students"
            element={<AddStudents />}></Route>
          <Route
            exact
            path="/edit-student/:id"
            element={<EditStudent />}></Route>
          <Route
            exact
            path="/student-profile/:id"
            element={<StudentProfile />}></Route>
          <Route
            exact
            path="/view-departments"
            element={<DepartmentsView />}></Route>
          <Route
            exact
            path="/add-departments"
            element={<AddDepartments />}></Route>
          <Route
            exact
            path="/edit-department/:id"
            element={<EditDepartment />}></Route>
          <Route
            exact
            path="/department-profile/:id"
            element={<DepartmentProfile />}></Route>


        </Routes>
      </Router>
    </main>
  );
}

export default App;