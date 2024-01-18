import React, { Component } from 'react'
import "./MyStyle.css"
export class Demo1 extends Component {
    constructor(props) {
      super(props)
      this.state = {
         count:0
      }

    //   changecount()
    //   {
    //     this.setState(
    //        { 
    //         count:this.state.count+1
    //        }
    //     )
    //     }
      
    }
    
  render() {
    return (
      <div id="d1">
        I'm from TamilNadu..belongs to dravidian stock
        
        <p>You clicked {this.state.count} times</p>
        {/* <button onClick={()=>this.changecount()}>click</button> */}
        <button onClick={()=>this.setState({count: this.state.count +1})}>Click here</button>
      </div>
    )
  }
}

export default Demo1;
