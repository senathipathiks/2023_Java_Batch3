import React from 'react';

const TodoItem = ({ todo, onToggleComplete, onDelete }) => {
	return (
		<div className='card mt-3'>
			<div className='card-body'>
				<h5 className='card-title'>{todo.title}</h5>
				<div className='form-check'>
					<input
						type='checkbox'
						className='form-check-input'
						checked={todo.completed}
						onChange={() => onToggleComplete(todo.id)}
					/>
					<label className='form-check-label'>{todo.completed ? 'Complete' : 'Incomplete'}</label>
				</div>
				<button className='btn btn-danger mt-3' onClick={() => onDelete(todo.id)}>
					Delete
				</button>
			</div>
		</div>
	);
};

export default TodoItem;