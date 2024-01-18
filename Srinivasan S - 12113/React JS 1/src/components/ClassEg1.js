import React, { Component } from 'react'

export class ClassEg1 extends Component {
  render() {
    return (
      <div id="d1">
        <b>Hii..This is {this.props.name},{this.props.desig}</b>
        <p>{this.props.children}</p>
        
      </div>
    )
  }
}

export default ClassEg1
