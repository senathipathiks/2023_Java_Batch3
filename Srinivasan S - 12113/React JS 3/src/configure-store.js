import { createStore } from "@reduxjs/toolkit";
import { reducer } from "./counter/reducer";

export const store= createStore  (reducer);