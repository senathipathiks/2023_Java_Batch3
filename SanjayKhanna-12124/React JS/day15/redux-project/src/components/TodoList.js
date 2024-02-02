import React, { useState } from 'react';
import AddTodoForm from './AddTodoForm';
import TodoItem from './TodoItem';
import TotalCompleteItems from './TotalCompleteItems';

const TodoList = () => {
	const [todos, setTodos] = useState([]);

	const addTodo = (todo) => {
		setTodos([...todos, todo]);
	};

	const toggleComplete = (id) => {
		setTodos(
			todos.map((todo) => {
				if (todo.id === id) {
					return { ...todo, completed: !todo.completed };
				}
				return todo;
			})
		);
	};

	const deleteTodo = (id) => {
		setTodos(todos.filter((todo) => todo.id !== id));
	};

	const totalCompleteItems = todos.filter((todo) => todo.completed).length;

	return (
		<div className='container'>
			<h1 className='my-3'>Todo List</h1>
			<AddTodoForm onSubmit={addTodo} />
			<div className='mt-5'>
				<h2>My Todos:</h2>
				{todos.map((todo) => (
					<TodoItem key={todo.id} todo={todo} onToggleComplete={toggleComplete} onDelete={deleteTodo} />
				))}
			</div>
			<TotalCompleteItems totalCompleteItems={totalCompleteItems} />
		</div>
	);
};

export default TodoList;