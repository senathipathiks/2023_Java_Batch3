import React, { Component } from 'react'
import PropTypes from 'prop-types'
export class Myclassapp extends Component {

constructor(props){
    super(props);
    this.state={date:new Date()}
}
  render() {
    return (
      <div class = "div1">
        This is Kiruba Component {this.props.name}
        Current time is{this.state.date.toLocaleTimeString()}
      </div>
    )
  }
}

export default Myclassapp
