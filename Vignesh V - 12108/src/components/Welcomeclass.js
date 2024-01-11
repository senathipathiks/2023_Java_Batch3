import React, { Component } from 'react'

export class Welcomeclass extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
        text: 'welcome'
         
      }
      this.change = this.change.bind(this) 
    }
    change(){
        this.setState({text: 'thank for subscribers'})
    }
    //change = () =>{
       // this.setState(
           // {text: 'thank for subscribers'}

   // )

    //}

    
  render() {
    return (
      <div>
        <h1>Class component </h1>
        <span>{this.state.text}</span>
        <button onClick={this.change()}>Subscribe!!</button>
      </div>
    )
  }
}

export default Welcomeclass

