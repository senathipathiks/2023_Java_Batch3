import React, { useState } from 'react'
import './style.css'

const EmpUpdate = ({ employee, onUpdate }) => {
  const [updatedEmployee, setUpdatedEmployee] = useState(employee)

  const handleInputChange = (e) => {
    const { name, value } = e.target
    setUpdatedEmployee((prevState) => ({ ...prevState, [name]: value }))
  }

  const handleUpdate = () => {
    onUpdate(updatedEmployee)
  }

  return (
    <>
      <input 
        type="text"
        name="name"
        value={updatedEmployee.name}
        onChange={handleInputChange}
      />
      <input 
        type="text"
        name="position"
        value={updatedEmployee.position}
        onChange={handleInputChange}
      />

<input 
        type="text"
        name="phone"
        value={updatedEmployee.phone}
        onChange={handleInputChange}
      />
      <button className="btn btn-success" onClick={handleUpdate}>
        submit
      </button>
    </>
  )
}

export default EmpUpdate