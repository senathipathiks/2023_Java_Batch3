import React, { Component } from 'react';

class EventBinding extends Component {
    constructor(props) {
        super(props)
        
        this.state = {
            msg:"Hello All"
        }
        this.clickHandler = this.clickHandler.bind(this);
    }
    clickHandler() {
        this.setState({msg: "Welcome"});
        }

    // clickHandler = () =>{
    //     this.setState({
    //         msg:"Welcome"
    //     })
    // }

    render() {
        return (
        <div>
            {this.state.msg}<br/>
            <button onClick={this.clickHandler}>Click Me!</button>
        </div>
        );
    }
}

export default EventBinding;