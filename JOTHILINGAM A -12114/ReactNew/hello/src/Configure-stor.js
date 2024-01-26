import {createStore} from 'redux';
import { countReducer } from './Counter/Reducer';

export const store=createStore(countReducer);