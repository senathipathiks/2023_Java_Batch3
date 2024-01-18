import { createStore } from "redux";
import { countReducer } from "./counter/Reducer1";

export const store =createStore(countReducer);
