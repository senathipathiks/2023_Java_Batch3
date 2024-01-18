import React, { Component } from 'react'

export class Classclick extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         msg:"Welcome"
      }
    }
    change(){
        this.setState({
            msg: "Thanks for subscribng!"
        })
    }
    
  render() {
    return (
      <div>
        {this.state.msg}
        <button onClick={()=>this.change()}>
            click to subscribe
            </button>
      </div>
    )
  }
}
// change=()=>{
//     this.setState({
//         msg: "Thanks for subscribng!"
//     })
// }
// render() {
//     return (
//       <div>
//         {this.state.msg}
//         <button onClick={this.change}>
//             click to subscribe
//             </button>
//       </div>
//     )
//   }
// }

export default Classclick
