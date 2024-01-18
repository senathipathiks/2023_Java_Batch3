import React from 'react'

function Myapp(props) {
  return (
    <div class="varsh">
      Hello This is Herammm!!! {props.name} Good Morning to all {props.role}
      <p>{props.children}</p>
    </div>
  )
}

export default Myapp