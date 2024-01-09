import React, { Component } from 'react'

export default class TextField extends Component {
    constructor() {
      super()
      this.state = {firstName:""}
    }
      formHandler=(event)=>{
        this.setState({firstName:event.target.value})
      
    }
    
  render() {
    return (
      <div>
        <form>
            <p>Enter your Name: {this.state.firstName}</p>
            <input type="text" onChange={this.formHandler} name="firstName"/>
            <input type="submit"/>
        </form>
      </div>
    )
  }
}
