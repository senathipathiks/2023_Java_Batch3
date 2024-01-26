import React from 'react'

function PropsFile(props) {

  const{FontSize,color} = props;
  return (
    <div>
      <h3>*****************Functional component using Props*******************</h3>
      {/* <h1>The color is : {props.color} : {props.FontSize}:{props.fontFamily}</h1> */}
      <h1>The color is : {color} : {FontSize}</h1>
       
       {props.children}
    </div>
  )
}

export default PropsFile
