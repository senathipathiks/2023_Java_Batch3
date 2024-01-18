import React, { Component } from 'react'

export default class Subscribe extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         message:"Welcome"
      }
    }
    
    clickthis = ()=>{
        this.setState(
           { message:"Thanks for subscribing"}
    )
     }
  render() {
    return (
      <div>
        <h1>{this.state.message}</h1><br/>
        <button type="button" onClick={
            ()=>this.clickthis()
            }>Subscribe</button>
      </div>
    )
  }
}
