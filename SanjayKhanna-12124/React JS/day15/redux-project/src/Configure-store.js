import { createStore } from 'redux';
import Reducer from './Counter/Reducer';


export const store = createStore(Reducer);