import React, { Component } from 'react'

export class Textfield extends Component {
    constructor(props) {
      super(props)
    
      this.state = { firstname: ""};
    }
    foralhandler=(e)=>{
        this.setState({firstname: e.target.value});
    };
    
  render() {
    return (
      <div>
        <form>
            <p>Enter the name: {this.state.firstname} </p>
            <input type='text' onChange={this.foralhandler}></input>
            <input type='Submit'></input>
        </form>
      </div>
    )
  }
}

export default Textfield
