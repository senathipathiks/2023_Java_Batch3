import React, { Component, useState } from 'react'

export class Subclass extends Component {
    constructor() {
      super()
    
      this.state = {
         message : 'Welcome'
      }
    }
    // constructor() {
    //   super()
    
    //   this.state = {
    //      message2 : 'Thanks for Subscribing'
    //   }
    // }
    
    Addmessage(){
        this.setState(
            {
                message:'Thanks for Subscribing'
            }
        )
    }

    
  render() {
    return (
      <div>
        {this.state.message} <br></br>
        <button onClick={()=>this.Addmessage()}>Subscribe</button>
      </div>
    )
  }
}

export default Subclass
