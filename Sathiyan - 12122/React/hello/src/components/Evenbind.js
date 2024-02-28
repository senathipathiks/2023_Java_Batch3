import React, { Component } from 'react'

export class Evenbind extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         message:"Hai All"
      }
      //this.clickhandler=this.clickhandler.bind(this);
    }
    // clickhandler(){
    //     this.setState({
    //         message:"Welcome All"
    //     })
    // }

    clickhandler=()=>{
        this.setState({
            message:"Welcome all"
        })
    }
    
  render() {
    return (
      <div>
        <br />
        <h1>{this.state.message}</h1>
        <button onClick={this.clickhandler}>Click me !!!</button>
      </div>
    )
  }
}
