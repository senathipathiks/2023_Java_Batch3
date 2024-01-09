import React, { useState } from 'react';
import { v4 as uuidv4 } from 'uuid';

const AddTodoForm = ({ onSubmit }) => {
	const [title, setTitle] = useState('');

	const handleSubmit = (e) => {
		e.preventDefault();
		if (title.trim()) {
			onSubmit({ id: uuidv4(), title, completed: false });
			setTitle('');
		}
	};

	return (
		<form onSubmit={handleSubmit}>
			<input
				type='text'
				className='form-control'
				placeholder='Enter a new todo item'
				value={title}
				onChange={(e) => setTitle(e.target.value)}
			/>
			<button type='submit' className='btn btn-primary mt-3'>
				Add Todo
			</button>
		</form>
	);
};

export default AddTodoForm;