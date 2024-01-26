import React, { PureComponent } from 'react'

export default class Submitform extends PureComponent {
    constructor(props) {
        super(props);
        this.state={firstName: ""};
    }
    formHandler = (event) => {
        this.setState({ Firstname: event.target.value});
    };
    submitHandler = (event) => {
        event.preventDefault();
        window.alert("You submitted"+ this.state.firstName);
    };
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p> Enter your name: {this.state.firstName} </p>
            <input onChange={this.formHandler} type="text" name="firstname"/>
            <input onChange={this.formHandler} type="Submit"/>
        </form>
        
      </div>
    )
  }
}
