import React, { Component } from 'react'

export class ClassSubscribe extends Component {
    constructor(){
        super();
        this.state={
            msg:"Welcome"
        }
    }

    changevalue(){
        this.setState({
            msg:this.state.msg="Thanks for Subscribe"
        })
    }
  render() {
    return (
      <div className='div2'>
        {this.state.msg}
        <button onClick={()=>this.changevalue()}>Subscribe</button>
      </div>
    )
  }
}

export default ClassSubscribe

