import React, { Component } from 'react';

export class Counter extends Component {
    constructor(props) {
        super(props)
        this.state={
            count: 0
        }
    }
    func=() =>{
        this.setState({
            count: this.state.count+1
        });
    }
    render() {
        return (
        <div className='counter'>
            <div id="display">Count : {this.state.count}</div>
            <button type='submit' onClick={this.func}>Start</button>
        </div>
        );
    }
}

export default Counter;