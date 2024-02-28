import React, { Component } from 'react'

export class Submitform extends Component {
    constructor(props) {
      super(props)
    
      this.state = {firstname:""};

      }
      
      formHandler =(Event)=>{
        this.setState({firstname:Event.target.value })
      };

      submitHandler=(Event)=>{
        Event.preventDefault();
        window.alert("You've Entered: " +this.state.firstname);
      };
    
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>Enter your name: {this.state.firstname}</p>
            <input onChange={this.formHandler} type='text' name='firstname' />
            <input onChange={this.formHandler} type='submit' />
        </form>
      </div>
    )
  }
}

export default Submitform
