import React, { Component } from 'react'

export default class Formtextfield extends Component {
    constructor(){
        super();
        this.state ={firstname: ""};
    }
    formHandler = (event) => {
        this.setState({ Firstname: event.target.value});
    };
  render() {
    return (
      <div>
        <form>
            <p>Enter your name: {this.state.firstname}</p>
            <input type="text" onChange={this.formHandler} name="firstname"/>
            <input type="Submit"/>
        </form>
      </div>
    )
  }
}
