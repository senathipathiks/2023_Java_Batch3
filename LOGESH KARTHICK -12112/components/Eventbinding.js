import React, { Component } from 'react'

export default class Eventbinding extends Component {
    
    clickhandler=()=>{
        this.setState({
            message:"welcome all"
        })
    }
  render() {
    return (
      <div>
        <br/>
        <h1>{this.state.message}</h1>
        <button onClick={this.clickhandler}>Click me</button><br/><br/>
      </div>
    )
  }
}
