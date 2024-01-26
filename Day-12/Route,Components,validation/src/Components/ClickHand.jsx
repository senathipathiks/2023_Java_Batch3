import React, { Component } from 'react'

export class ClickHand extends Component {
    constructor(props) {
        super(props)
      
        this.state = {
           msg : "Click Hander and Bind Method"
        }
        this.clickhandler = this.clickhandler.bind(this);
      }
      clickhandler(){
          this.setState({
              msg:`The msg is updated!!!!`
          })
      }
      
    render() {
      return (
        <div>
  
          <h1>{this.state.msg}</h1>
          <input type='button' value={"Message"} onClick={this.clickhandler}></input>
          
        </div>
      )
    }
}

export default ClickHand
