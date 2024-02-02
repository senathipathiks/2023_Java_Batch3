export const addTodo = text => ({
    type: 'ADD_TODO',
    id: Math.random(),
    text,
});

export const toggleTodo = id => ({
type: 'TOGGLE_TODO',
id,
});