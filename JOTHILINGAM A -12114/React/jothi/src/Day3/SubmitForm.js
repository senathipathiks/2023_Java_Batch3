import React, { Component } from 'react'

export class SubmitForm extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         firstname:" "
      }
    }

    formHandler =(event)=>{
        this.setState({firstname : event.target.value});
       
    };
    submitHandler =(event) => {
        event.preventDefault();
        window.alert("you submitted" + this.state.firstname);
    }
   
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
        <p>Enter your name :{this.state.firstname}</p>
        <input onChange={this.formHandler} type='text' name='firstname' />
        <input onChange={this.formHandler} type='submit'/>

        </form>
      </div>

    )
  }
}

export default SubmitForm
