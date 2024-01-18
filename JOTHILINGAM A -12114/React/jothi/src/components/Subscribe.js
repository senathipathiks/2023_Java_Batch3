import React, { Component } from 'react'

export class subscribe extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         email: 'welcome to my page'
      }
    }
    changetext(){
        this.setState({email:'you have subscribed successfully!'})
    }

    
  render() {
    return (
      <div>
         {this.state.email}
       
       <button onClick={()=>this.changetext()}>subscribe</button>
        
      </div>
    )
  }
}

export default subscribe
