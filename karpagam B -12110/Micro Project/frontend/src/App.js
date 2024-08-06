import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"

import Home from './Home';
import UserLogin from './UserLogin';
import AdminLogin from './AdminLogin';
import UserRegister from './UserRegister';
import AdminHome from './AdminHome';
import PendingBooking from './Admin/PendingBooking';
import Imageslid from './Imageslid';
import AddBooking from './User/AddBooking';
import ViewBookings from './User/ViewBookings';
import UserEdit from './User/UserEdit';

import AddTourPack from './Admin/AddTourPack';
import RejectedBooking from './Admin/RejectedBooking';
import PaymentBookings from './Admin/PaymentBookings';
import AdminPaymentcheck from './Admin/AdminPaymentcheck';


import ApprovedBookings from './Admin/ApprovedBookings';
import Userho from './User/Userho';
import AdminView from './Admin/AdminView';
import UserProfilePage from './User/UserProfilePage';
import EditTour from './Admin/EditTour';
import Payment from './User/Payment';
import UserTourEdit from './User/UserTourEdit';
import UserViewHome from './User/UserViewHome';







function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route exact path="/" element={<Home />}></Route>
          <Route exact path="/user" element={<UserLogin />}></Route>
          <Route exact path="/admin" element={<AdminLogin />}></Route>
          <Route exact path="/register" element={<UserRegister/>}></Route>
          <Route exact path="/adminhome" element={<AdminHome />}></Route>
          <Route exact path="/addpackage" element={<AddTourPack/>}></Route>
          <Route exact path="/viewtour" element={<Userho/>}></Route>
          <Route exact path="/userhome" element={<Imageslid/>}></Route>

          <Route exact path="/pendingbook" element={<PendingBooking/>}></Route>
          <Route exact path="/userbook/:packageId" element={<AddBooking/>}></Route>
          <Route exact path="/userbookcheck" element={<ViewBookings/>}></Route>
          <Route exact path="/rejectedRequest" element={<RejectedBooking/>}></Route>
          <Route exact path="/approvedRequest" element={<ApprovedBookings/>}></Route>
          <Route exact path="/paymentRequest" element={<PaymentBookings/>}></Route>
          <Route exact path="/adminPay/:bookingId" element={<AdminPaymentcheck/>}></Route>


          <Route exact path="/adminViewTour" element={<AdminView/>}></Route>
          <Route exact path="/userprofile" element={<UserProfilePage/>}></Route>
          <Route exact path="/useredit/:userId" element={<UserEdit/>}></Route>
          <Route exact path="/adminedit/:packageId" element={<EditTour/>}></Route>
          <Route exact path="/payment/:bookingId" element={<Payment/>}></Route>
          <Route exact path="/editTour/:bookingId" element={<UserTourEdit/>}></Route>
          <Route exact path="/userview/:bookingId" element={<UserViewHome/>}></Route>










          </Routes>
      </Router>
    </div>
  );
}

export default App;
