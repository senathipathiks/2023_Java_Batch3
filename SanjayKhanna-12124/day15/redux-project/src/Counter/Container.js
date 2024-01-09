import { connect } from "react-redux";
import Component from "./Component";

const mapStateToPros = state =>{
    return {
        count : state 
    };
};

const mapDispatchToProps = dispatch =>{
    return {
        handleIncrementClick: () =>dispatch({type:'INCREMENT'}),
        handleDecrementClick: () => dispatch({type: 'DECREMENT'})
    }
};

export const Container = connect(mapStateToPros,mapDispatchToProps)(Component);