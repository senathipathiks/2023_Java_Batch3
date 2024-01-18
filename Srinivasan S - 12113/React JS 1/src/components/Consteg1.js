import React, { Component } from 'react'

export class Consteg1 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {date:new Date()}
      }
    
    
  render() {
    return (
      <div id="d1">
          <p>{this.props.name} is the object which stores properties of {this.props.topic}</p><br></br>
          <p>Current time is {this.state.date.toLocaleTimeString()}</p>
      </div>
    )
  }
}


export default Consteg1
