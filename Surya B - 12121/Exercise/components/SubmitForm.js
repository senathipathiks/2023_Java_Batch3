import React, { Component } from 'react'

export class SubmitForm extends Component {

    constructor(props) {
      super(props)
    
      this.state = {firstName: ""};
         
      }
      
      formHandler = (event) => {
      this.setState({firstName: event.target.value});
    }
      submithandle =(event) =>{
        event.preventDefault();
        window.alert("You submitted" + this.state.function);
      }
      validate =() => {
        if(this.target.firstName == ""){
            window.alert("Enter the First Name");
        }
      }
      
    
  render() {
    return (
      <div>
        <form onSubmit={this.submithandle}>
            <p>Enter your name: {this.state.firstName}</p>
            <input onChange={this.formHandler} type="text" name= "firstname"></input>
            <input onChange={this.formHandler} type='submit' ></input>
        </form>
      </div>
    )
  }
}

export default SubmitForm
