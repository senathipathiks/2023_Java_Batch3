import React, { Component } from 'react'

export default class Conditionalrend extends Component {
    constructor(props){
        super(props)

        this.state = {
            flag:true
        }
    }
  render() {
    if(this.state.flag)
        return (<div>Welcome Heram</div>)
    else
    return (<div> Welcome Guest</div>)

    //return (this.state.flag)? <div> Welcome Varshinee </div> : <div> Welcome Guest </div>
    
  }
}