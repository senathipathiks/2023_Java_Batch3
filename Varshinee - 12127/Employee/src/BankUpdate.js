import React, { useState } from 'react'
import './style.css'


const BankUpdate = ({ transaction, onUpdate }) => {
  const [updatedTransaction, setUpdatedTransaction] = useState(transaction)

  const handleInputChange = (e) => {
    const { name, value } = e.target
    setUpdatedTransaction((prevState) => ({ ...prevState, [name]: value }))
  }

  const handleUpdate = () => {
    onUpdate(updatedTransaction)
  }

  return (
    <>
    <input 
        type="text"
        name="tranid"
        value={updatedTransaction.transid}
        onChange={handleInputChange}
      />
      <input 
        type="text"
        name="transname"
        value={updatedTransaction.transname}
        onChange={handleInputChange}
      />
      <input 
        type="text"
        name="transdescription"
        value={updatedTransaction.transdescription}
        onChange={handleInputChange}
      />
      

      <input 
        type="text"
        name="transmode"
        value={updatedTransaction.transmode}
        onChange={handleInputChange}
      />
      <button className="btn btn-success" onClick={handleUpdate}>
        submit
      </button>
    </>
  )
}

export default BankUpdate