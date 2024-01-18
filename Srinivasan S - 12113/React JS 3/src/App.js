// import logo from './logo.svg';
// import './App.css';
import { Provider } from 'react-redux';
import {store} from './configure-store'
import {component} from './configure-store'

function App() {
  return (
      <Provider store={store}>
        <container/>
      </Provider>
  );
}

export default App;
