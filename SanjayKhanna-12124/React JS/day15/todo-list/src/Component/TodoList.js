import React from 'react';

const TodoList = ({ todos, onToggle }) => (
<ul>
{todos.map(todo => (
    <li key={todo.id} onClick={() => onToggle(todo.id)}>
    {todo.text}
    </li>
))}
</ul>
);

export default TodoList;