import React, { Component } from 'react'

export class Submitform extends Component {
    constructor(props) {
        super(props)
      
        this.state = { firstname: ""};
      }
      foralhandler=(e)=>{
          this.setState({firstname: e.target.value});
      };
      submithandler =(e)=> {
        e.preventDefault();
        window.alert("You Submitted " +this.state.firstname)
      };
      
    render() {
      return (
        <div>
          <form onSubmit={this.submithandler}>
              <p>Enter the name: {this.state.firstname} </p>
              <input type='text' name='firstname' onChange={this.foralhandler}></input>
              <input type='Submit' onChange={this.foralhandler}></input>
          </form>
        </div>
      )
    }
}

export default Submitform
