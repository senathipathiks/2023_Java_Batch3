import React, { Component } from 'react'
import "./Mystyle.css";
 class Count extends Component {
    constructor() {
        super();
        this.state = { 
            message: 'welcome'
         }
        }
        changemessage(){
            this.setState(
                {
                    message:this.state={
                        message:'you clicked the button'
                    }
                }
            )
        }
  render() {
    return (
      <div class="div1">
        {this.state.message}
  <button onClick ={()=>this.changemessage()}>click me</button>
        
      </div>
    )
  }
}

export default Count;