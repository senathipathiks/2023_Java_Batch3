import React, { Component } from 'react'

export default class SubmitForm extends Component {
    constructor(props) {
      super(props)
      this.state = { firstName: ""};
         
      }
      formHandler =(Event)=>{
        this.setState({firstName:Event.target.value});
      };
      submitHandler=(Event)=>{
        Event.preventDefault();
        window.alert("you submited " + this.state.firstName);
      };
    
    
  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
            First Name:<br/>
            <input type="text" name="fname" value={this.state.firstName
            } onChange={this.formHandler} /><br/>
            Last Name:<br/>
            <input type="text" name="lname" /><br/>
            Email:<br/>
            <input type="email" name="email" /><br/>
            Date of Birth:<br/>
            <input type="date" name="dob"/><br/>
            <button type="submit">Submit</button>
            </form>
            </div>
            );
            }
        }
     
        
      
