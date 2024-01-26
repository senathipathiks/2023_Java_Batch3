import React, { Component } from 'react'

export class Conditional extends Component {
    constructor(props){
        super(props);
        this.state ={
            flag: false
    }
}
  render() {
    if(this.state.flag)
    return (
      <div>
        welcome loki
      </div>
    )
    else
    return (<div>welcome geust</div>)

  }
}

export default Conditional;
