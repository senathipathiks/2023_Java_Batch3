import React, { Component } from 'react'
// import { useState } from 'react';

export class Counter extends Component {
    constructor(props) {
        super(props);
        this.state = {
             count: 0,
            };
        }
  render() {
    return (
      <div className='border-bottom '>
        <span className='badge bg-primary m-5 '>{this.state.count}</span>
        <button 
        onClick={()=>{  
            this.setState({ count: this.state.count + 1 });
        }}
        className='btn btn-primary '>
            click
            </button>
      </div>
    )
  }

}

export default Counter
