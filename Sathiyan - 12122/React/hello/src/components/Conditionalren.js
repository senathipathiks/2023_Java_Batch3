import React, { Component } from 'react'

export class Conditionalren extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         flg:true
      }
    }

    render(){
        const treuelement=<div>Welcome sathya</div>
        const falseelement=<div>Welcome Deepika</div>

        if(this.state.flag)
            return(treuelement)
            else
            return(falseelement)
    }
    
//   render() {
//     if(this.state.flag)
//     return (<div>Welcome Sathya</div> )
    
//     else return
//       (<div>
//             Welcome deepika
//       </div>
//     )
//   }
}

export default Conditionalren