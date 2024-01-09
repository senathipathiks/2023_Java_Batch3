import {createStore} from 'redux';
import {countReducer} from './Counter/reducer';

export const store=createStore(countReducer);