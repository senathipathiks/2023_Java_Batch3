import React, { Component } from 'react'

 class Conditionalrender extends Component {
    constructor(props) {
        super(props)
        
        this.state = {
            flag:true
        }
    }
    render() {
        // const trueElement = <div><p>This is Sanjay Khanna</p></div>;
        // const falseElement = <div><p>Guest</p></div>;

        // if(this.state.flag){
        //     return (trueElement);
        // }
        // else{
        //     return(falseElement);
        // }

        if(this.state.flag){
            return (<div><i>This is vignesh </i></div>);
        }
        else{
            return(<div><i>This is Guest</i></div>);
        }
        
        // return (this.state.flag)? <div><i>This is vignesh </i></div>: <div><i>This is Guest</i></div>;
    }
}

export default Conditionalrender;

