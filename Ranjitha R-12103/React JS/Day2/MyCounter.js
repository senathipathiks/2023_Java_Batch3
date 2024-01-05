import React, { Component } from 'react'

export class MyCounter extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         count:0
      }
    }
    
    changecount(){
        this.setState(
            {
                count:this.state
            }
        )
    }

  render() {
    return (
      <div cass="div2">
       <p> You Clicked {this.state.count} times </p>
        <button onClick={()=>this.changecount()}>
                Click Me!!!
            </button>
      </div>
    )
  }
}

export default MyCounter
