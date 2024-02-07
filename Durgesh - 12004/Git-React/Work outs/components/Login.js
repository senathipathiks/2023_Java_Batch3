import React, { Component } from 'react'

export class Login extends Component {
  render() {
    return (
      <div>
        <center>
            <table className='Table'>
                <tr>
                    <td> <b>Email ID:</b></td>
                    <td><input className='txtstyle' type='text' /></td>
                </tr>
                <tr>
                    <td> <b>Password:</b></td>
                    <td><input className='txtstyle' type='text' /></td>
                </tr>
                <tr align='center'>
                    <td><input className='submit' type='Submit' /> </td>
                    <td><a className='astyle' href='Registration Page'>New User Sign-up here</a></td>
                </tr>
            </table>
        </center>
      </div>
    )
  }
}
export default Login
