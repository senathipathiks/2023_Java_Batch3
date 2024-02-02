import React, { Component } from 'react';

class DIsplayClass extends Component {
    constructor(props) {
        super(props)
        
        this.state = {
            str : "Guess My Name"
        }
    }
    render() {
        return (
        <div>
            {this.state.str}<br/>
            <button onClick={()=>{this.setState({str:"Sanjay Khanna"})}}>Quess?</button>
        </div>
        );
    }
    }

export default DIsplayClass;
