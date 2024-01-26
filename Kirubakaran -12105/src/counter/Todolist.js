import React from 'react';
import { connect } from 'react-redux';
import { addTodo,removeTodo } from './action';
import "./todo.css"

const Todolist = ({ todos, addTodo, removeTodo }) => {
  const handleAddTodo = () => {
    const text =  <textarea rows={3} column={8}>
    
    </textarea>
    if (text) {
      addTodo(text);
    }
  };

  return (
    <body>
    <div>
      <button id="button1" onClick={handleAddTodo}>Add Todo</button>
      <ul>
        {todos.map((todo) => (
          <li key={todo.id}>
            {todo.text}
            <button onClick={() => removeTodo(todo.id)}>Remove</button>
          </li>
        ))}
      </ul>
    </div>
    </body>
  );
};

const mapStateToProps = (state) => ({
  todos: state.todos,
});

const mapDispatchToProps = {
  addTodo,
  removeTodo,
};

export default connect(mapStateToProps, mapDispatchToProps)(Todolist);