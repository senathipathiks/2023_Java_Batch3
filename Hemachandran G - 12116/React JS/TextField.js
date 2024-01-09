import React, { Component } from 'react'

export class TextField extends Component {
    constructor(){
        super();
        this.state ={ firstName: " "};
        }
        formHandler = (event) => {
            this.setState({ firstName:event.target.value});
        };
    
  render() {
    return (
      <div>
        <form>
            <p>Enter Your Name : {this.state.firstName}</p>
            <input type="text" onChange={this.formHandler} name="firsName"/>
            <input type="submit"/>
        </form>
        
      </div>
    )
  }
}

export default TextField
