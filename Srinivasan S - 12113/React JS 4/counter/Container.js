
import {connect} from 'react-redux'
import component from './component'


const mapStateToPros =state => {
  return {
       count:state
  }
}
const mapDispatchToProps= dispatch=>{
    return{
        handleIncrementClick:()=>dispatch({type : 'Increment'}),
        handleDecrementClick:()=>dispatch({type:'Decrement'})
    }
}
export const Container=connect(mapStateToPros,mapDispatchToProps)(component);
