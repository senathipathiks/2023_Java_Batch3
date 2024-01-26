import React from 'react'

function Listrender() {
    const org = ['Frim', 'Grij', 'hiyg']
    const mylist =(
        <ul>
            <li>one</li>
            <li>two</li>
            <li>three</li>
        </ul>
    )
    const org1=org.map(e => <h1>{e}</h1>)
  return (
    <div>
      {mylist}
      {org1}
    </div>
  )
}

export default Listrender
