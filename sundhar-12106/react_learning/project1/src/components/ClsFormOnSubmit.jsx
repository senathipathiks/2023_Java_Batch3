import React, { Component } from 'react'

class ClsFormOnSubmit extends Component {
  constructor(props) {
    super(props);

    this.state = {
      name: "",
    };
  }

  handleName = (e) => {
    this.setState({ name: e.target.value });
  };

  submitHandler = (e)=>{
    e.preventDefault();
    alert("Your Name is "+this.state.name);
  };

  render() {
    return (
      <div>
        <form action="" onSubmit={this.submitHandler}>
          <p>Name:</p>
          <br />
          <input
            type="text"
            value={this.state.name}
            onChange={this.handleName}
          />
          <br />
          <input type="submit" value="Submit" />
        </form>
      </div>
    );
  }
}

export default ClsFormOnSubmit
