import React, { Component } from 'react'

export default class SubmitForm extends Component {
    constructor(props) {
      super(props);
      this.state = {firstName:""};
    }
      formHandler=(event)=>{
        this.setState({firstName:event.target.value});
    };
      submitHandler=(event)=>{
        event.preventDefault();
        window.alert("You submitted "+this.state.firstName);
    };
    
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>Enter your Name: {this.state.firstName}</p>
            <input type="text" onChange={this.formHandler} name="firstName"/>
            <input type="submit" on Change={this.formHandler}/>
        </form>
      </div>
    )
  }
}
