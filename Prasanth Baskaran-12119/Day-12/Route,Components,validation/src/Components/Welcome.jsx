import React, { Component } from 'react'

export class Welcome extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
        initial:"Welcome"
        
       
         
      }
    }
    change =()=>{
        this.setState({
            initial:"Thanks for subscribing!!!"
        })
    }
  render() {
    return (
      <div>
        <h1>{this.state.initial}</h1>
        <button type='button' onClick={this.change}>Subscribe</button>
      </div>
    )
  }
}

export default Welcome
