import React, { useState } from 'react'
// import './style.css'

const NewsUppdate = ({ news, onUpdate }) => {
    const[updatedenews , setupdatednews] =useState(news);

  const handleInputChange = (e) => {
    const {  info, value } = e.target
    setupdatednews((prevState) => ({ ...prevState, [info]: value }))
  }

  const handleUpdate = () => {
    onUpdate(updatedenews)
  }

  return (
    <>
      <input 
        type="text"
        name="name"
        value={updatedenews.id}
        onChange={handleInputChange}
      />
       <input 
        type="text"
        name="position"
        value={updatedenews.info}
        onChange={handleInputChange}
      /> 

<input 
        type="text"
        name="phone"
        value={updatedenews.source}
        onChange={handleInputChange}
      /> 
      <button className="btn btn-success" onClick={handleUpdate}>
        submit
      </button>
    </>
  )
}

export default NewsUppdate