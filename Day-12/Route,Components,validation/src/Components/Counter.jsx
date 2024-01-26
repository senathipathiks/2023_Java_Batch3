import React, { Component } from 'react'

export class Counter extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         count: 0
      }
    }
    
counting =()=>{
     this.setState({
        count :this.state.count +1

     });
      
    
}
incre=()=>{
    var i = 0;
    return () =>i++;
}

  render() {
    return (
      <div>
        <p>The count value is : {this.state.count}</p>
        <h1>It is count incresing button below</h1>
        <button
                type="button"
                onClick={this.counting}
                // onClick={this.changeColor()}
              >increse</button>
      </div>
    )
  }
}

export default Counter
