import React, { Component } from 'react'

export default class Conditionalformating extends Component {
    constructor(props) {
      super(props)
      this.state = {
         show:true
      }
    }
    
  render() {
    // if (this.state.show) {
    // return (
    //   <div>
    //     <h1>Srinivasan!!</h1>
    //   </div>
    // )
    // }
    // else{
    //     return(
    //         <div>
    //             <h1>Nitish!</h1>
    //         </div>
    //     )
    // }
    return(this.state.show) ? <div>Welcome Srini!!</div>: <div>Welcome guest!!</div>
  }
}
