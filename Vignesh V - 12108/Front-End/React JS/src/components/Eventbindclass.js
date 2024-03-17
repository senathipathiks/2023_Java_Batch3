import React, { Component } from 'react'

export class Eventbindclass extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         message:"hai all"
      }
     // this.clickhandler=this.clickhandler.bind(this);
    }
    

    clickhandler(){
        this.setState({message : "Hello World!"})
        }

        // clickhandler=()=>
        // this.setState({
        //     message:"welcome all"
        // }
        // )
  render() {
    return (
      <div>
        <br/>
        <h1>{this.state.message}</h1>
        <button onClick={()=>this.clickhandler()}>Click me</button>
      </div>
    )
  }
}


export default Eventbindclass
