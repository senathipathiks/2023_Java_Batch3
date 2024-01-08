import React from 'react'

function Nav() {
  let p = H1Function();
  return (
    <div class='container-fluid bg-info  '>
      <div class="container">
        <ul class='list list-group-horizontal list-unstyled m-0  row'>
            <li className='col-4'>list1</li>
            <li className='col-2'>list2</li>
            <li className='col-2'>list3</li>
            <li className='col-2'>list4</li>
            <li className='col-2'>list5</li>
        </ul>
      </div>
    </div>
    
  )

  function H1Function() {
    return <h1>hello</h1>;
  }
}

export default Nav
