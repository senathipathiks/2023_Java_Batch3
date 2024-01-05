import React, { Component } from 'react'

export default class Eventbind extends Component {
     constructor(props) {
       super(props)
     
       this.state = {
          message:"Hi All"
       }
     }

    //  clickhandler(){
    //     this.setState({
    //         message:"Welcome All"
    //     })

     clickhandler=()=>{
        this.setState({
            message:"Welcome All"
        })
     }
  render() {
    return (
      <div>
        <br/>
        <h1> {this.state.message}</h1>
        <button onClick={this.clickhandler}>
        Click Me!!!
            </button>
      </div>
    )
  }
}
