import React, { Component } from 'react'

export class Formsubmitting extends Component {
    constructor(){
        super();
        this.state ={ firstName: " "};
        }
        formHandler = (event) => {
            this.setState({ firstName:event.target.value});
        };
        submitHandler = (event) => {
            event.preventDefault();
            window.alert("You Submitted " + this.state.firstName);

        }
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            <p>Enter Your sweet Name : </p>
            <input onChange={this.formHandler} type="text" name="firsName" />
            <input onChange={this.formHandler} type="submit" />


        </form>
        
      </div>
    )
  }
}

export default Formsubmitting
