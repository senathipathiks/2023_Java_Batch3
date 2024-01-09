import {connect} from 'react-redux';
import { Component } from 'react';

const mapStateToProps = state =>{
    return{
        count : state
    }
};

const mapDispatchToProps = dispatch => {
    return{
        handleDecrementclick: () => dispatch({type: 'Increment'}),
        handleIncrementclick: () => dispatch({type : 'Decrement'})}
};
export const Container1 = connect(mapStateToProps ,mapDispatchToProps)(Component);