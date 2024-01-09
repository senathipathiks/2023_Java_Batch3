import React, { Component } from 'react'

export class Formhandling extends Component {
    constructor() {
      super()
    
      this.state = {
         firstName:""
      };
    }
    formHandler=(event)=>{this.setState({firstName:event.target.value});
}
  render() {
    return (
      <div>
        <form>
            <p>Enter the name:{this.state.firstName}</p>
            <input type="text" onChange={this.formHandler} name="firstName"/>
            <input type="submit"/>
        </form>
      </div>
    )
  }
}

export default Formhandling
