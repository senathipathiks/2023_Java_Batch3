import React, { Component } from 'react'

export class HandlingFrom extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
        firstname : ""
     
         
      }
    }
    formHandler =(e)=>{
        this.setState({firstname:e.target.value})
    };

    submitHandler=(e)=>{
        e.preventDefault();
        // console.log("Submitted");
        alert("login successfully  :" + this.state.firstname)
    }
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <h1>Enter the firstName : {this.state.firstname}</h1>
            <input type="text" onChange={this.formHandler} name="firstName" />
            <input onChange={this.formHandler} type="submit"></input>
        </form>
        
      </div>
    )
  }
}

export default HandlingFrom
