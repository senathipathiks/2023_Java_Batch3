import React, { Component } from 'react';
import PropTypes from 'prop-types';
import "./Mystyle.css";

export class Mylogin extends Component {
  static propTypes = {

  }

  render() {
    return (
        <div className="Mydivclass">
            <center>
                <table>
                    <tr>
                        <td className='name'>Name</td>
                        <td ><input className='namebox' type="text"></input></td>
                    </tr>

                    <tr>
                        <td className='pass'>Password</td>
                        <td ><input className='passbox' type="password"></input></td>
                    </tr>
                    
                    <tr align='center'>
                        <td><input className='subbutton' type="submit"></input></td>
                        <td> <a className='link'>New User Signup?</a> </td>
                    </tr>

                </table>
            </center>
        </div>
    )    
}
}