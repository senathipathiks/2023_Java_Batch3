import {connect} from 'react-redux';
import { Component2 } from './Component2';

const mapStateToProps = state =>{
    return{
        count : state
    };
};

const mapDispatchToProps = dispatch => {
    return{
        handleDecrementclick: () => dispatch({type: 'Increment'}),
        handleIncrementclick: () => dispatch({type : 'Decrement'})}
};
export const Container = connect(mapStateToProps ,mapDispatchToProps)(Component2);