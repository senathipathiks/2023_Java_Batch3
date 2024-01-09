import { createStore } from "redux";
import { countReducer } from "./counter/Reducer";

export const store =createStore(countReducer);
