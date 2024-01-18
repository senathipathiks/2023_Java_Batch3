import React, { Component } from 'react'

export class Conditional extends Component {
    constructor(props) {
        super(props);
        this.state = {
            flag: true
            };
        }
    
  render() {
    if(this.state.flag) {
        return (
            <div> 
              Green
            </div>
        )
    }
        else {
            return(
                <div>
                    Red
                </div>
            );
        }
    }
    // return(
    //     (this.state.flag)?
    //     <div>Blue</div> : <div>Black</div>
    // )
    
  }


export default Conditional
