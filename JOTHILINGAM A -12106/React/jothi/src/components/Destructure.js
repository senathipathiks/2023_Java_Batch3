import React from 'react'

 function Destructure(props) {
    const { name, topic } = props;
  return (
    <div>
        <h1>this is  {name} and topic is{topic}</h1>
      
    </div>
  )
}
export default Destructure;
