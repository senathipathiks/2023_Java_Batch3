import React, { Component } from 'react';

export class MyApp1 extends Component {
    render() {
        return (
        <div>
            <p><i>This is My First Class Component {this.props.name} using {this.props.topic}</i></p>
        </div>
        );
    }
    }

export default MyApp1;
