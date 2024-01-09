import logo from './logo.svg';
// import './App.css';

import { store } from './configure-store';
import {Container} from './counter/Container';
import { Provider } from 'react-redux';

function App() {
  return (
    <div >
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
   <Provider store={store}>
    <Container></Container>
   </Provider>

    </div>
  );
}

export default App;
