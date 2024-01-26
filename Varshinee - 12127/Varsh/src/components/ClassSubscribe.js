import React, { Component } from 'react'

export default class ClassSubscribe extends Component {
 constructor(props) {
   super(props)
 
   this.state = {
      message:"",
   }
 }
 show(){
    this.setState({
        message:"Thanks for subscribe",
    })
 }
 
  render() {
    return (
      <div>
        <h1>Welcome</h1>
        <button onClick={()=>this.show()}>
            Subscribe
        </button>
        <h1>{this.state.message}</h1>
      </div>
    )
  }
}