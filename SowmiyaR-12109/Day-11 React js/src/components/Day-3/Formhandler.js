import React, { Component } from 'react'

class Formhandler extends Component {
    constructor(){
        super();
        this.state={fistNmae: ""};
    }
    FormHandler=(event)=>{
        this.setState({firsName:event.target.value});
    };
  render() {
    return (
      <div>
      <form>
        <p>
           Enter your name:{this.state.firsName}</p>
            <input type="text" onChange={this.formHandler} name="firstName"/>
            <input type="submit"/>
            </form>  
      </div>
    )
  }
}

export default Formhandler
