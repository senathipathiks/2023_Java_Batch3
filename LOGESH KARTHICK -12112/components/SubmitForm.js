import React, { Component } from 'react'

export class SubmitForm extends Component {
    constructor(props){
        super(props);
        this.state={firstName:" "};
    }
    formHandler =(event)=>{
        this.setState({firstName:event.target.value});
    };
    submitHandler =(event)=>{
        event.preventDefault();
        window.alert("you submitted" + this.state.firstName);
    };
    }
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>enter your name :{this.state.firstName}</p>
            <input onChange={this.formHandler}type="name"></input>
        </form>
        
      </div>
    )
  }
}

export default SubmitForm
