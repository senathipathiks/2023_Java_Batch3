import React, { Component } from 'react'

class Conditionalrend extends Component {
    constructor(props) {
        super(props);
        this.state = {
            flag: true
            };
        }
  render() {
    if (this.state.flag){
        return <div>I am shown when the flag is true.</div>;
        } 
        else {
            return (<div>Welcome varsh</div>);
            }
//    return(this.state.flag)? <div> Welcome sowmi </div> :<div>Welcome guest</div>
  }
}
export default Conditionalrend
