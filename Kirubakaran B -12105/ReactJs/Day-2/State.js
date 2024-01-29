import React, { Component } from 'react'


export class State extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
        date: new Date()
         
      }
    }
    
 

  render() {
    return (
      <div>
        <p>this is my class component {this.props.name}</p><br />
        <b>  Current time is :{this.state.date.toLocaleTimeString()}</b>

      </div>
    )
  }
}

export default State
