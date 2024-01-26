import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import App2 from "./App2";
import Add from "./Add";
import Edit from "./Edit"

function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<App2 />} />
        <Route path="/create" element={<Add />} />
        <Route path="/update/:id" element={<Edit/>} />
        <Route path="/delete" element={<Add />} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
