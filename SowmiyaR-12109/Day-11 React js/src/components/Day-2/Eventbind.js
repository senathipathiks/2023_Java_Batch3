import React, { Component } from 'react'

class Eventbind extends Component {
    constructor(props) {
        super(props);

        this.state={
            message:"Hai All"
        } }
        clickhandler=()=>{
            this.setState({
                message: "Welcome All"
            })
        }
        render() {
            return (
                <div>
                    <h1>{this.state.message}</h1>
                    <button onClick={this.clickhandler}>Click Me</button>
                    </div>
            )
        }
    }
 


export default Eventbind
