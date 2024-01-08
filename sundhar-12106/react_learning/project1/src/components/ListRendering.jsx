import React from 'react'

function ListRendering() {
    const nameArr = ["sundhar","raj","srini"];
    const ele=(
        <ul>
            <li key="1">First item</li>
            <li key="2">Second Item</li>
            <li key="3">Third Item</li>
        </ul>
    )
    const newArr = nameArr.map(e => <h1 key={e}>{e}</h1>)
  return (
    <div>
      {ele}
      {newArr}
    </div>
  )
}

export default ListRendering
