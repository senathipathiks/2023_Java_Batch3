import { Provider } from "react-redux";
import { store } from "./Configure-stor";
import Container from "./Counter/Container";


function App() {
  return (
    <div className="App">
     <Provider store={store}>
        <Container></Container>
      </Provider>
    </div>
  );
}

export default App;