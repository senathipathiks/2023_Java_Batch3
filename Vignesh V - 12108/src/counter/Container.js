import{connect} from 'react-redux';
import { Component } from './Component';

const mapStateTopros = state =>{
    return {
        count:state
};
};
const mapDispatchToprops = dispatch =>{
    return {
        handleIncrementClick:()=> dispatch({type: 'INCREMENT'}),
        handleDecrementClick:()=>dispatch({ type:'DECREMENT'})
    }
}

export const Container = connect(mapStateTopros,mapDispatchToprops)(Component);