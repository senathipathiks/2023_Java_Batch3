
import React, { useState } from 'react'

const Button = () => {

    const [name, setName] = useState('erik')

    const handleClick = () => alert('Click')
    const handleBlur  = () => alert('Blur')
    const handleName  = e  => setName(e.target.value)

    return (
        <>
            <button onClick  = {handleClick}>Click me</button>
            <input  
                onBlur   = {handleBlur}
                onChange = {handleName} 
                value    = {name}
            />
        </>
    )

}

export default Button