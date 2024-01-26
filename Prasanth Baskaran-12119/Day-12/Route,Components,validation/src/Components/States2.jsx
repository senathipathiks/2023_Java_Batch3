import React, { Component } from 'react'

export class States2 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {

        date :new Date()
         
      }
    }
    
  render() {
    return (
      <div>
        <h1>The current time is :{this.state.date.toLocaleTimeString()}</h1>
      </div>
    )
  }
}

export default States2
