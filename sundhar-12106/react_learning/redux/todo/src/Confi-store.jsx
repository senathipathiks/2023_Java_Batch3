import { configureStore } from '@reduxjs/toolkit';
import todoReducer from './component/Todo';

const store = configureStore({
 reducer: {
 todos: todoReducer,
 },
});

export default store;