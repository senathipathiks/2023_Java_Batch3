import React from 'react'

function MyApp(props) {
  const{name,topic}=props
  return (
    <div>
      <p>this is my first compoenet created by {name} for the topic of {topic}</p>
    </div>
  )
}

export default MyApp
