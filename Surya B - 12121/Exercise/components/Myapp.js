import React, { Component } from 'react'

export class Myapp extends Component {

  render() {
    return (
      <div>
        <p id = "p1">This is also my First Component {this.prop.name} and created in this {this.props.topic}</p>
        {this.props.children}
      </div>
    )
  }
}

export default Myapp;
