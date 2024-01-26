import  Container  from './counter/Container';
import {store } from './Configure-store'
import { Provider } from 'react-redux';

function App() {
  return (
    <div className="App">
      <Provider store={store}>
        <Container/>
      </Provider>
    </div>
  );
}

export default App;
