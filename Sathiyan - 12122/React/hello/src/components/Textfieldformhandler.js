import React, { Component } from 'react'

export class Textfieldformhandler extends Component {
    constructor() {
      super();
      this.state = { firstname: "" };
    }
    formHandler =(event)=>{
        this.setState({firstname: event.target.value});
    };

  render() {
    return (
      <div>
        <form>
            <p>Enter your name: {this.state.firstname}</p>
            <input type='text' onChange={this.formHandler} name='firstname' />
            <input type='submit'/>
        </form>    
      </div>
    )
  }
}

export default Textfieldformhandler
