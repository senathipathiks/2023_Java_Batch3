import React, { Component } from 'react'

export class Ternary extends Component {
    constructor(props) {
      super(props)
    
      this.state = {

        authorized : true
         
      }
    }
    
  render() {
    const good = <h1>This Message is Success</h1>
    const bad = <h1>This Message is Fail</h1>
    return (this.state.authorized)?good:bad
  }
}

export default Ternary
