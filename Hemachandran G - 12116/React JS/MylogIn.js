import React, { Component } from 'react'
import PropTypes from 'prop-types'

export class Mylogin extends Component {
  static propTypes = {

  }

  render() {
    return (
      <div>
        <table>
        <h1><u>Form</u></h1>

        <tr>
            <td><h4> Name: </h4></td>
            <td> <input class="Txtstyle" type="text" placeholder="enter your name"></input></td>
         </tr>
               
        <tr>
           <td> <h4> Email: </h4> </td>
           <td> <input class="Txtstyle" type="text" placeholder="enter your email"></input></td>
        </tr>
        <tr>
            <td><h4> Address: </h4></td>
            <td><textarea class="Txtstyle" name="text" id="" cols="30" rows="2" ></textarea></td>
        </tr>
        <tr>
            <td><input type="Reset" class="style"></input></td>
            <td><button>Send</button></td>
         </tr>
    </table>
      </div>
    )
  }
}

export default Mylogin