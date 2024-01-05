import React, { Component } from 'react'

export class MyClass extends Component {
    constructor(props){
        super(props);
        this.state={date:new Date()}
    }
  render() {
    return (
      <div class="div1" align="center">
        This is my class component{this.props.name}
        <br />Current Time is{this.state.date.toLocaleTimeString()}
        
      </div>
    )
  }
}

export default MyClass
