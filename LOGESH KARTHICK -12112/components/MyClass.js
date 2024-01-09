import React, { Component } from 'react';
import "./Mystyle.css";
class MyClass extends Component
// var MyClass = () => {
//   return (
//     <div id="one">
//       <h1> cdMY LOGIN PAGE </h1>
//     </div>
//   )
// }
{
  constructor(props){
    super(props);
    this.state={date:new Date()}
}

render ()
{
  return(
  <div class="div2">
  this is my class component{this.props.name}
  <br/>
  the current date and time is:{this.state.date.toLocaleTimeString()}
    </div>
    );
}
}
export default MyClass
