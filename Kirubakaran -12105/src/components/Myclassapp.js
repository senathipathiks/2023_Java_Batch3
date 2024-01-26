import React, { Component } from 'react'
import "./Myclassapp.css"
export class Myclassapp extends Component {
  
  render() {
    return (
      <div>
        <p id="p1">This is my first class Component! {this.props.name} and created in {this.props.topic}</p>
        {this.props.children}
        
      </div>
    )
  }
}

export default Myclassapp;
