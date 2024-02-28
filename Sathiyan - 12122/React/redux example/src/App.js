import logo from './logo.svg';
import './App.css';
import { Provider } from 'react-redux';
import { store } from './configure-store';
import { Container } from './counter/container';


function App() {
  return (
    <div>
      <Provider store={store}>
        <Container />
      </Provider>
    </div>
  );
}

export default App;
