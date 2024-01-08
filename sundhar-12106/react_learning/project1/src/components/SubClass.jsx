import React, { Component } from 'react'

export class SubClass extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         msg:"Welcome"
      }
    //   this.click=this.click.bind(this);
    }

    // click(){
    //     this.setState({
    //                 msg: "Thanks for Subscribing!"
    //             })
    // }
    click = ()=>{
        this.setState({
          msg: "Thanks for Subscribing!",
        });
    }
    
  render() {
    return (
      <div>
        <h1>{this.state.msg}</h1>
        <button 
            onClick={this.click}
        >
            Subscribe
        </button>
      </div>
    )
  }
}

export default SubClass
