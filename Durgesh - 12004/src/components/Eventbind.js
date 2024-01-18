import React, { Component } from 'react'

export class Eventbind extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         info : "Tamil Nadu"
      }
      this.clickhandler=this.clickhandler.bind(this);
    
    }
    // clickhandler(){
    //     this.setState({
    //         info : "Tamil Nadu Welcomes you with warm heart"
    //     })
    // }
    // clickhandler=()=>{
    //     this.setState({
    //         info : "Tamil Nadu Welcomes you with warm heart"
    //     })
    // }
    
  render() {
    return (
      <div>
        <h1> {this.state.info} </h1>
        <button onClick={()=>this.clickhandler()}> Click !!</button>
        {/* <button onClick={this.clickhandler}>Click !!</button> */}
      </div>
    )
  }
}

export default Eventbind
