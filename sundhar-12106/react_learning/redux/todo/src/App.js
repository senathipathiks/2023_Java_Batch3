// import logo from './logo.svg';
// import './App.css';
import { Provider } from "react-redux";
import store from "./Confi-store";
import TodoList from "./TodoList";

function App() {
  return (
    <Provider store={store}>
       <TodoList /> 
    </Provider>
  );
}

export default App;
