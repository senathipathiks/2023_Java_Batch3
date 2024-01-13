import React, { Component } from 'react'

export class Conditional extends Component {

   constructor(props) {
     super(props)
   
     this.state = {
        flag:false
     }
   }
   
  render() {
    if(this.state.flag)
        return(<div>Welcome Kiruba</div>)
    else
    return(<div>Welcome Guest</div>)
  }
}

export default Conditional
