import { createStore } from 'redux';
import todos from './Component/reducers';

const store = createStore(todos);

export default store;
