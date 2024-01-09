import React, { Component } from 'react'

class SubmitForm extends Component {
    constructor(props){
        super(props);
        this.state={firstName: ""};
    }
    formHandler=(event)=>{
        this.setState({firstName: event.target.value});
    };
    submitHandler=(event)=>{
        event.preventDefault();
        window.alert("you are submitted as:"+this.state.firstName);
    };
  render() {
    return (
      <div>
      <form onSubmit={this.submitHandler}>
        <p>Enter your Name:{this.state.firstName}</p>
<input onChange={this.formHandler}type="text" name="firstName" />
<input onChange={this.formHandler} type="submit" />
        </form>  
      </div>
    )
  }
}

export default SubmitForm
