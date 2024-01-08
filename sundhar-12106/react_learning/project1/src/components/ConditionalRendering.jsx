import React, { Component } from 'react'

export class ConditionalRendering extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         show: false
      }
    }
    
  render() {
    let ele1 = <div>Welcome sundhar raj</div>
    let ele2 = <div>Welcome Guest</div>
    //   if (this.state.show) {
    //     return( <div>
    //     <h1>Welcome Sundhar Raj</h1>
    //   </div>)
    //   } else {
    //     return( <div>
    //     <h1>Welcome guest</h1>
    //   </div>)
    //   }
    // return (this.state.show)?<h1>hello Sundhar Raj</h1>:<h1>hello guest</h1>;
    return(this.state.show)?ele1:ele2
  }
}

export default ConditionalRendering
