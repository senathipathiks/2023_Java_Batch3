import {createStore} from 'redux';
import {countReducer} from './counter/reducer.jsx';

export const store = createStore(countReducer);