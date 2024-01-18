import React, { Component } from 'react'
import "./Style.css"

export class Class extends Component {
  constructor(props) {
    super(props)
  
    this.state = { date: new Date()}
  }
  
  render() {
    return (
      <div className='one'>
        <p>There are four essential elements that an effective paragraph <br/>
          {this.props.place} <br />
        </p>
        {this.props.children}
        Current Time is {this.state.date.toLocaleTimeString()}
      
      </div>
    )
  }
}

export default Class
