import React, { Component } from 'react'
import "./Myclassapp.css";
class Myclassapp extends Component {
  constructor(props) {
    super(props)
  
    this.state = {date:new Date()
       
    }
  }
  
  render() {
    return (
      <div >
        <center>
        <h2 id="div1">This is a heading</h2>
        <p id="para">Jothi is innocent and good boy</p>
        
       this is my class component {this.props.name}<br />
       current time is {this.state.date.toLocaleTimeString()} 

       </center>
        
        
      </div>
    )
  }
}

export default Myclassapp
