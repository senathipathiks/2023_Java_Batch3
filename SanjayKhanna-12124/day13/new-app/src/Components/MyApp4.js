import { Component } from "react";

class MyApp4 extends Component{
    constructor(props) {
        super(props);
        this.state = {date:new Date()}
}

render(){
    return (
        <div>
            <h1>Current time : {this.state.date.toLocaleTimeString()}</h1>
        </div>
    );
    }
}

export default MyApp4