import React from 'react';

class TodoForm extends React.Component {
state = {
text: '',
};

handleChange = e => {
this.setState({ text: e.target.value });
};

handleSubmit = e => {
e.preventDefault();
this.props.onSubmit(this.state.text);
this.setState({ text: '' });
};

render() {
return (
    <form onSubmit={this.handleSubmit}>
    <input
        type="text"
        value={this.state.text}
        onChange={this.handleChange}
    />
    <button type="submit">Add Todo</button>
    </form>
);
}
}

export default TodoForm;