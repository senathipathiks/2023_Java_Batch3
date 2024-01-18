import{createStore} from "redux";
import { countReducer } from "./counter/reducer.js";
import todoReducer from './counter/todoReducer.js';
export const store = createStore(todoReducer);