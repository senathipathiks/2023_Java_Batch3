import React, { Component } from 'react'

export class Myclassapp extends Component {
  constructor(props) {
    super(props);
  
    this.state ={Date:new Date()}
    }
    render() {
      return (
        <div>
          <h5> this is my class component{this.props.name}</h5>
          Currrent date : {this.state.Date.toLocaleTimeString()}
        </div>
      );
    }
  
  }
  
  



export default Myclassapp
