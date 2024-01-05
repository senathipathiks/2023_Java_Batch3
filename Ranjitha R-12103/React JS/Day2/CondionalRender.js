import React, { Component } from 'react'

export default class CondionalRender extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         flag:true
      }
    }
    
  render() {
    const trueEle=<div>Welcome Ranjitha</div>
    const falseEle=<div>Welcome guest</div>
    if(this.state.flag)
    return (trueEle)
    else
    return(falseEle)
    // if(this.state.flag)
    // return (<div>Welcome Ranjitha</div>)
    //     else
    //     return(<div>Welcome guest</div>)

        // return(this.state.flag)? <div> Welcome Ranjitha</div>:<div>Welcome Guest</div>
  }
}
