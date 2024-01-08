// import logo from './logo.svg';
import './App.css';
// import Component from '../counter/component';
import { store } from './configure-store';
import {Container} from './counter/container';
import { Provider } from 'react-redux';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      {/* <Component/> */}
      
      <Provider store={store}>
      <Container/>
      </Provider>

    </div>
  );
}

export default App;
