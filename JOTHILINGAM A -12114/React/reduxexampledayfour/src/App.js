import logo from './logo.svg';
import './App.css';
// import { Provider } from 'react';
import { Provider } from 'react-redux';
import { store } from './Configure-store';
import {Container1} from './counter/Container1'
function App() {
  return (
    <div className="App">
      <Provider store={store}>/
        <Container1/>
      </Provider>
    </div>
  );
}

export default App;
