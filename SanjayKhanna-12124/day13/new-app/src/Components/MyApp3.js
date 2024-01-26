import React, { Component } from 'react';

export class MyApp3 extends Component {
    render() {
        return (
        <div>
            <p><i>This is My First Class Component {this.props.name} using {this.props.topic}</i></p>
            {this.props.children}
        </div>
        );
    }
}

export default MyApp3;
