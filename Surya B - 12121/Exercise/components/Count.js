import React, { Component } from 'react'

export class Count extends Component {
    constructor(){
        super();
        this.state={
            count:0
        }
    }

  render() {
    return (
      <div>
        {this.state.count}
        <button onClick={()=>{
            this.setState(
                {count: this.state.count+1}
            )
        }}>
            Click</button>
      </div>
    )
  }
}

export default Count
