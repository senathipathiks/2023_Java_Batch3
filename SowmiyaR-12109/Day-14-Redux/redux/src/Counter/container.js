import{connect} from 'react-redux';
import {component} from './component';
const mapStateToPros=state=>{
    return{
        count:state
    };
};
const mapDispatchToProps = dispatch=>{
    return{
        handleIncrementClick:()=>dispatch({type:'INCREMENT'}),
        handleDecrementClick:()=>dispatch({type:'DECREMENT'})

    }
};

export const Container=connect(mapStateToPros,mapDispatchToProps)(component);
