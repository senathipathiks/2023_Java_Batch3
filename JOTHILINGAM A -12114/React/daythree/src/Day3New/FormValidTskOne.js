import React from 'react'
import './style.css'
function FormValidTskOne() {
  return (
    <div>
      <div class="container">
      <form className=''>
        <div class="form1">
        <div class="row ">
            <div class="col-6 ">
        <input id="empass1" type="text" placeholder="Email" className="username mt-5 "></input>
        </div>
        <div class="col-6 ">
        <input id="empass1" type="text" placeholder="password" class="password mt-5 "></input>
        </div>
        </div>
        <div class="row col-lg-auto ">
        <input  type="text" placeholder="address" class="address mt-5 "></input>
        </div>

        <div class="row ">
            <div class="col-6">
            <input type="text" placeholder="city" class="city mt-5 "></input>
            </div>
            <div class="col-3 mt-5 ">
                <select>
                    <option>tamilnadu</option>
                    <option>tamilnadu</option>
                    <option>tamilnadu</option>
                </select>

            </div>
            <div class ="col-3">
            <input type="text" placeholder="pincode" class="pincode"></input>
            </div>
            <div>
                <button>signin</button>
            </div>
        </div>

        </div>
      </form>
    </div>
    </div>
  )
}

export default FormValidTskOne
