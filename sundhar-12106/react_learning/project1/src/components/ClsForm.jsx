import React, { Component } from 'react'

class ClsForm extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
         name: '',
      }
    }
    handleName=(e)=>{
       this.setState({ name: e.target.value });
    }
  render() {
    return (
      <div>
        <form action="">
            Name:<br />
            <input type="text" value={this.state.name} onChange={this.handleName}/><br />
        </form>
      </div>
    )
  }
}

export default ClsForm
