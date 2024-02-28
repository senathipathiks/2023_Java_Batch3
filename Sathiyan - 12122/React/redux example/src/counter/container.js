import {connect} from 'react-redux';
import { Component } from './component';

const mapStoreToPros = state => {
    return {
        count: state
    };
};
const mapDispatchToProps = dispatch => {
    return {
        handleIncrementClick: () => dispatch ({type: "Increment"}),
        handleDecrementClick: () => dispatch ({type: "Decrement"}),
    }
};
export const Container = connect(mapStoreToPros,mapDispatchToProps)(Component);