import React, { Component } from 'react'
import "./Mystyle.css";
export class MyClassapp extends Component {
  // constructor(props) {
  //   super(props);
  //   this.state = {date:new Date()}
  // }
  
    constructor(props){
        super(props);
        this.state ={date:new Date()}
    }
  render() {
    return (<div class="div1">
        This is my class component {this.props.name}
        <br /> current time is {this.state.date.toLocaleTimeString()}
    </div>
    )
  }
}

export default MyClassapp
