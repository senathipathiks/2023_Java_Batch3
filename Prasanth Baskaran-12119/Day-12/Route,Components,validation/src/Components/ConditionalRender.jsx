import React, { Component } from 'react'

export class ConditionalRender extends Component {

   constructor(props) {
     super(props)
   
     this.state = {
        show: false
     }
   }
   
   
  render() {
    
        if(this.state.show)
            return (<div>Welcome Conditional Elemrnt</div>)
        else
        return (<div>Go out</div>)

        


      
    
  }
}

export default ConditionalRender
