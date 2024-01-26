import React from 'react'
import { connect } from 'react-redux'

import {Component} from './Component';

const mapStateToProps = state => {
    return{
        count : state
    };
};

const mapDispatchToprops = dispatch => {
    return {
        incrementClick: ()=>dispatch({type: 'Increase'}),
        decrementClick: ()=>dispatch({type: 'Decrease'})
    }
}

export const Container= connect(mapStateToProps, mapDispatchToprops)(Component)


