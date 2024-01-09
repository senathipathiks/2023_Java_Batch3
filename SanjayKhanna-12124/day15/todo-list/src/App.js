import { Provider } from 'react-redux';
import './App.css';
import TodoApp from './Component/TodoApp';
import store from './configure-store';

function App() {
  return (
    <div> 
    <Provider store={store}>
    <TodoApp />
  </Provider>
  </div>
   
  );
}

export default App;
