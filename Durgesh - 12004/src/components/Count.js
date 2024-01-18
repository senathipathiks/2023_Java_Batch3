import React, { Component } from 'react'
import"./Style.css"

export class Count extends Component {
    constructor() {
        super();
        this.state = { count : 0 
        }
      } 
      Changecount(){
        this.setState(
            {
                count: this.state.count+1
            }
        )
      }
  render() {
    return (
      <div>
        {this.state.count} <br></br>
        <button onClick={()=>this.Changecount()}> Click Me</button>    
      </div>
    )
  }
}

export default Count
