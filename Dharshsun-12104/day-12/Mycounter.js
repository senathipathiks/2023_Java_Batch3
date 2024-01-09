import React, { Component } from 'react'
// import PropTypes from 'prop-types'

 class Mycounter extends Component {
  constructor() {
    super();
    this.state = {
       count: 0
    }
  }
  changecount(){
this.setState(
    {
        count:this.state.count+1
    }
)
  }

  render() {
    return (
      <div class="div2">
        {this.state.count}
        <button onClick={()=>this.changecount()}>Clickme!!!</button>
      </div>
    )
  }
}

export default Mycounter
