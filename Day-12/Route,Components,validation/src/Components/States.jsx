import React, { Component } from 'react'

export class States extends Component {
    
        constructor(props) {
          super(props);
          this.state = {
            color: "red",
            
          };
        }
        changeColor = () => {
          this.setState({color: "blue"});
        }
        render() {
          return (
            <div>
              <h3>*****************States in Class Component*********************</h3>
              <h1>My color is below</h1>
              <p>
                It is a {this.state.color}
                
              </p>
              <button
                type="button"
                onClick={this.changeColor}
                // onClick={this.changeColor()}
              >Change color</button>


             



            
            </div>
          );
        }
      }

export default States
