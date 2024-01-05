import React, { Component } from 'react'
import "./Mystyle.css";
 class Counter extends Component {
    constructor() {
        super();
        this.state = { 
            count: 0
         }
        }
        changecount(){
            this.setState(
                {
                    count:this.state.count+1
                }
            )
        }
  render() {
    return (
      <div class="div1">
        {this.state.count}
  <button onClick ={()=> this.changecount()}>Click Here</button>
        
      </div>
    )
  }
}

export default Counter;
