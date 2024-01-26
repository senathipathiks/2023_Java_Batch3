import React, { Component } from 'react'



 class ComInCom extends Component {
    constructor(props){
        super(props);
        this.Name = this.props.Name;
        this.Age = this.props.Age;
    
    }
    render() {
      return (
        <div>
          <ParentFile/>
            <h3>*****************Class Inside Class Component with Props***********</h3>
          <h1>Hello this child</h1>
          <p><b>My Name is :{this.Name} <br/>And My age is : {this.Age}</b></p>

        
        </div>
      )
    }
  }
  class ParentFile extends Component {
    render() {
      return (
        <div>
            <h3>******************** Inside class in class Component************</h3>
            <h1>Hello this is parent</h1>
               
        </div>
      )
    }
}

export default ComInCom


