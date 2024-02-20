import React from 'react';
import { connect } from 'react-redux';
import TodoForm from './TodoForm';
import TodoList from './TodoList';
import { addTodo, toggleTodo } from './actions';

class TodoApp extends React.Component {
render() {
return (
        <div>
        <h1>Todo List</h1>
        <TodoList todos={this.props.todos} onToggle={this.props.onToggle} />
        <TodoForm onSubmit={this.props.onAddTodo} />
        </div>
    );
}
}

const mapStateToProps = state => ({todos: state,});

const mapDispatchToProps = dispatch => ({
onAddTodo: text => dispatch(addTodo(text)),
onToggle: id => dispatch(toggleTodo(id)),
});

export default connect(mapStateToProps,mapDispatchToProps)(TodoApp);
