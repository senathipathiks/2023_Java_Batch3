import { createStore } from "@reduxjs/toolkit";
import { reducer } from "./reducer";

export const store = createStore(reducer);
