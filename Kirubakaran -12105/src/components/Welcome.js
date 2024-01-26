import React from 'react'

function Welcome(props) {
  const{name,topic}=props
  return (

    <div class="div1">
      <p>This is my first component {name} created usinng {topic}</p>
      {props.children}
      

    </div>
  )
}

export default Welcome
