import React, { Component } from 'react'
// import "./MyStyle.css";
//rconst

export class Myclassapp extends Component {
constructor(props) {
  super(props);
  this.state = {date:new Date()}
}
  render() {
    return (
      <div class="div2">
        This is my class components{this.props.name}
        <br/>Current Time is{this.state.date.toLocalTimeString()}
      </div>
    )
  }
}

export default Myclassapp;
