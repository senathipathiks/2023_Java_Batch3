import React, { Component } from 'react'

export class Eventbind extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         msg:"Welcome"
      }
    }

    change(){
        this.setState({msg:"thanks for subs"})
    }
    
    
  render() {
    return (
      <div>
        {this.state.msg}
        <button onClick = {()=>this.change()} >Subscribe</button>
      </div>
    )
  }
}

export default Eventbind
