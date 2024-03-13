import React from 'react'

function Myjio(props) {
  return (
    <div>
      <h4> welcome to login {props.name}</h4>
      {props.children}
    </div>
  )
}

export default Myjio
