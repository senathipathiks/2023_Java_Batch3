import React, { Component } from 'react'
// import PropTypes from 'prop-types'

 class Condrend extends Component {
  constructor(props){
    super(props)
    this.state ={
        flag:false
  }
  }
  render(){

    const trueEle=<div>Welcome Dharshsun</div>
    const falseEle=<div>Welcome Guest</div>
    if(this.state.flag)
    return (trueEle);
      else
    return(falseEle);
    
  }
}
 
  export default Condrend
