import React, { Component } from 'react'

export class Classform extends Component {
    constructor(props) {
      super(props)
    
      this.state = 
         { firstname:""}
      
    }
    formhand =(e)=>{
        this.setState({firstname: e.target.value})
    };
    sub =(e)=>{
        e.preventDefault();
        alert("Form Submitted Successfully with "+this.state.firstname);
    };
    
  render() {
    return (
      <div>
        <form onSubmit={this.sub}>
            <p> Enter your name :{this.state.firstname}</p>
            <input type="text" name='firstname' placeholder="Your Name" onChange={this.formhand}/><br/>
            <input onChange={this.formhand} type='submit'/>
        </form>
      </div>
    )
  }
}

export default Classform
