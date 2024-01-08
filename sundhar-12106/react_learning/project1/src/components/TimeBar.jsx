import React, { Component } from 'react'

export class TimeBar extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         date: new Date()
      }
    }
    
  render() {
    return (
      <div>
        this is the my class Component for {this.props.name}
        <br />
        Current time is {this.state.date.toLocaleTimeString()}
      </div>
    )
  }
}

export default TimeBar
