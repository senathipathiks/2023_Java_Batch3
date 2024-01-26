import {createStore} from 'redux';
import { countReducer } from './counter/reducer.js';

export const store = createStore(countReducer);