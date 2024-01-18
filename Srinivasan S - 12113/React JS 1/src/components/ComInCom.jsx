import React, { Component } from 'react'

export class ComInCom extends Component {
  render() {
    return (
      <div>
        <h1>This is Child File</h1>
        <Parent/>
        
      </div>
    )
  }
}


export class Parent extends Component {
  render() {
    return (
      <div>
        <h1>This is parent file</h1>
      </div>
    )
  }
}




export default ComInCom

