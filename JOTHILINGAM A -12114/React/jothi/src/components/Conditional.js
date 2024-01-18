import React, { Component } from 'react'

export class Conditional extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         flag: false
      }
    }
    
  render() {
      
    // first type
        if(this.state.flag)   
         return (<div>welcome abi ,hema and alll </div>)
         else
         return (<div> welcome guest</div>)

        //  second type
        // //  return(this.state.flag)? <div>>welcome abi ,hema and alll</div> : <div> welcome guest</div> 

    //     third type
    //     const trueEle=<div>welcome abi ,hema and alll </div>
    //     const falseEle=<div> welcome guest </div>

    //     if(this.state.flag) 
    //     return(trueEle) 
    // else
    // return(falseEle)

        
   
  }
}

export default Conditional
