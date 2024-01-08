import React, { Component } from 'react'

export class MyClsApp extends Component {
  render() {
    return (
      <div>
        <br/>this is my first hello {this.props.name}
        <br />
        {this.props.children}
      </div>
    )
  }
}

export default MyClsApp
