import React, { Component } from 'react'

export class Conditionalrenderclass extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         show: true
      }
    }
    
  render() {
    //(if statemt)
    // if(this.state.show)
    // return (<div>Welcome kiruba </div>)
    // else
    // return(<div>Go out kiruba</div>)

    //(Ternary operator)
     return (this.state.show) ? <div> welcome kiruba </div>  :<div> go out kiruba </div> 

     //(Element handler)
     //const tr=<div>Welcome kiruba </div>
    // const fs=<div>go out kiruba  </div>
     // if(this.state.show)
    // return (tr)
    // else
    // return(fs)
    
  }
}

export default Conditionalrenderclass
