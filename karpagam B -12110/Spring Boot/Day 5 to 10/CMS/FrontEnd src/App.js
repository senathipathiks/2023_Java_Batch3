import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Login from './pages/Login';


import './App.css';
import './index.css';
import AddCourse from './pages/AddCourse';
import AddStudent from './pages/AddStudent';
import DeleteCourse from './pages/DeleteCourse';
import DeleteStudent from './pages/DeleteStudent';
import EditCourse from './pages/EditCourse';
import EditStudent from './pages/EditStudent';
import CourseHome from './index/CourseHome';
import StudentHome from './index/StudentHome';


function App() {
  return (
    <div className="App">
     <Router>
      <Routes>
      <Route exact path="/" element={<Login/>}></Route>

        <Route exact path="/home" element={<StudentHome/>}></Route>
        <Route exact path="/course" element={<CourseHome/>}></Route>

        <Route exact path="/addinvent" element={<AddStudent/>}></Route>
        <Route exact path="/addbrand" element={<AddCourse/>}></Route>

        <Route exact path="/deleteinvents" element={<DeleteStudent/>}></Route>
        <Route exact path="/deletebrands" element={<DeleteCourse/>}></Route>

       
        <Route exact path="/editinvent/:studentId" element={<EditStudent/>}></Route>
        <Route exact path="/editbrand/:id" element={<EditCourse/>}></Route>



      </Routes>
      </Router>

    </div>
  );
}

export default App;
