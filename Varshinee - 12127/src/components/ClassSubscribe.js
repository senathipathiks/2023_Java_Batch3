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
        <p>Welcome</p>
        <button onClick={()=>this.show()}>
            Subscribe
        </button>
        <p>{this.state.message}</p>
      </div>
    )
  }
}