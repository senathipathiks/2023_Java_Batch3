import React from 'react'
import './Style1.css'
function TodoList() {
  return (
    
    <div id='bac'>
    <div className='container  p-4 col-4 '>
        <center><form className=''>
           <div className="col-6 col-md-8 col-sm-8">
            <div className='row'>
            <h2> TodoList</h2>
            <div  >
            <input id ="inp" className='mr-40px' type="text" placeholder="Add Your Task!!"/> 
            <span><button id ='btn'>Add</button></span>
            </div>
            </div>
            </div>
            </form>
            </center> 
    </div>
    </div>
  )
}

export default TodoList
