import React, { Component } from 'react'

export class Subform extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         firstname: ''
      }
    }
    formHandler = (event)=>{
        this.setState({firstname:event.target.value})
    };
    submitHandler = (event) =>{
        event.preventDefault()
        window.alert("You Submitted " + this.state.firstname)
    }
    
  render() {
    return (
      <div >
        <form onSubmit={this.submitHandler}>
            <p>Enter Your Name:{this.state.firstname}</p>
            <input onChange={this.formHandler} type='text' name='firstname'></input>
            <input type='submit' onChange={this.formHandler}></input>

        </form>
      </div>
    )
  }
}

export default Subform
