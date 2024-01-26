import React, { Component } from 'react'

export class FormClass extends Component {
constructor(props) {
  super(props)

  this.state = {
    firstname : ""
     
  }
}

formHandler =(e)=>{
    this.setState({firstname:e.target.value})
};




  render() {
    return (
      <div>
        <form action="">
            <label htmlFor='name'>Enter the user name :</label>
            <input type="text" onChange={this.formHandler} name='firstName' />
            <input type='submit'/>
        </form>
        
      </div>
    )
  }
}

export default FormClass
