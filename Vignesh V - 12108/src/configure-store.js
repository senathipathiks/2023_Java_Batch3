import { createStore } from '@reduxjs/toolkit';
import { countReducer } from './counter/reducer.js';

export const store = createStore(countReducer);