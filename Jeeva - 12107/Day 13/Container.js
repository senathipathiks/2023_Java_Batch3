import  {connect} from 'react-redux'
import { Component } from './Component'

const mapStateToProps = state => {
    return {
        count: state
    }
}

const mapDispatchToProps = dispatch => {
    return {
        handleIncrementClick: () => dispatch({type: 'INCREMENT'}),
        handleDecrementClick: () => dispatch({type: 'DECREMENT'})
    }
}
export const Container = connect(mapStateToProps,mapDispatchToProps)(Component);