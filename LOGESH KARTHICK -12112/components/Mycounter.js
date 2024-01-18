import React, { Component } from 'react'
import "./Mystyle.css"

export class Mycounter extends Component {
    constructor(){
        super();
        this.state ={
            count: 0
            };
    }
    changecount()
    {
        this.setState(
        {
            count : this.state.count +1
         })
    }
      render() {
    return (
      <div class ="div2">
        {this.state.count}
        <button onClick={()=>this.changecount()} id="myButton">Click me</button>
        
      </div>
    )
  }
}

export default Mycounter
