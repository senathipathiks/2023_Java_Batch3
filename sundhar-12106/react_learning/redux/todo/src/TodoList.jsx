import React, { useState } from "react";
import { useSelector, useDispatch } from "react-redux";
import { addTodo, toggleComplete, deleteTodo } from "./component/Todo";

const TodoList = () => {
  const [text, setText] = useState("");
  const todos = useSelector((state) => state.todos);
  const dispatch = useDispatch();

  const handleInputChange = (e) => {
    setText(e.target.value);
  };

  const handleAddTodo = () => {
    if (text) {
      dispatch(addTodo(text));
      setText("");
    }
  };

  const handleToggleComplete = (id) => {
    dispatch(toggleComplete(id));
  };

  const handleDeleteTodo = (id) => {
    dispatch(deleteTodo(id));
  };

  return (
    <div className="d-flex justify-content-center align-items-center">
      <div className="container bg-gradient d-flex flex-column  justify-content-center align-items-center h-100">
        <h1 className="text-primary opacity-100 ">Todo List</h1>
        <div className="d-flex">
          <input
            type="text"
            value={text}
            className="me-3 border-primary rounded"
            onChange={handleInputChange}
          />
          <button className="btn btn-outline-primary" onClick={handleAddTodo}>
            Add Todo
          </button>
        </div>
        <div className="d-flex justify-content-center mt-5">
          <ul className="list-unstyled ">
            {todos.map((todo) => (
              <li
                key={todo.id}
                // className="me-3 mt-4 text-center"
                className={
                  todo.completed
                    ? "text-danger me-3 mt-4 text-center"
                    : "text-primary me-3 mt-4 text-center"
                }
                style={{
                  textDecoration: todo.completed ? "line-through" : "none",
                  color: todo.completed ? "red" : "",
                }}
              >
                <div className="conatiner">{todo.text} </div>
                <div className="container mt-2 ">
                  <button
                    className="btn btn-primary me-2 "
                    onClick={() => handleToggleComplete(todo.id)}
                  >
                    {todo.completed ? "Mark Incomplete" : "Mark Complete"}
                  </button>
                  <button
                    className="btn btn-primary"
                    onClick={() => handleDeleteTodo(todo.id)}
                  >
                    Delete
                  </button>
                </div>
              </li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
};

export default TodoList;
