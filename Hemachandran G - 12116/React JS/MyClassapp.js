import React, { Component } from 'react'

export class MyClassapp extends Component {
    constructor(props){
        super(props);
        this.state ={date:new Date()}
        
    }
  render() {
    return (<div class="div1">
        This is my class component {this.props.name}{this.props.topic}
        <br /> Current Time is : {this.state.date.toLocaleTimeString()}<br/>
        Current Date is : {this.state.date.toLocaleDateString()}
    </div>
    )
  }
}

export default MyClassapp