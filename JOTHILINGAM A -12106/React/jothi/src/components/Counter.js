import React, { Component } from 'react'

export class Counter extends Component {
    constructor(props) {
      super(props)
    
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
      <div>

        {this.state.count}
       
        <button onClick={()=>this.changecount()}>CLICK ME!!!</button>
        
      </div>
    )
  }
}

export default Counter
