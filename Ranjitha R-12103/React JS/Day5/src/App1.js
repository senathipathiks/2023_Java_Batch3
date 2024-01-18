import './App1.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import navbar from "./components/nav-bar/src/App1";

function App1() {
  return (
    <Router>
      <navbar />
      <Switch>
        <Route path='/' exact component={NavHome} />
       
    
      </Switch>
    </Router>
  );
}

export default App1;
