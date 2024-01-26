import React, { Component } from 'react';
import "./Mystyle.css";
export class Myclassapp extends Component {

constructor(props){
  super(props)

  this.state = {
     date:new Date()}
  }


  render() {
    return (

      <div class="div1">
        
        This is my Component class {this.props.name}
        <br/>Current time is {this.state.date.toLocaleTimeString()}
       
      </div>
    )
  }
}

export default Myclassapp

