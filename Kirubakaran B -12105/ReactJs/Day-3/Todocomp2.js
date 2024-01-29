import React, { useState } from 'react'
import Todocomponent from './Todocomponent';
export default function Todocomp2() {
    // const[todoname,settodoname]=useState("");
    const[list,setlist]=useState(["kiruba","karan"]);
    /*  const handletodoclick=()=>{
      alert('hello');
      }; */
      const addtodo=(name)=>{
        setlist([...list, name]);
        }
    // const updatetodoname =(e)=>{
    //     settodoname(e.target.value);
    // }
    // const addtodo=(e)=> {
    //     e.preventDefault();
    //     setlist([...list,
    //         todoname]);
    //     settodoname("");
    //     // console.log('The todo name is ',todoname)
    //     };
    const onDone=(item)=>
    {
        console.log(item);
    }
  return (
    <div>
        {/* <h3>Todo list</h3>
      <input type='text'
       placeholder='add your task'
        value={todoname}
      onChange={updatetodoname} /> */}
       

      
      <br/><br/>
      {
        list.map(item =><Todocomponent obj={item} onDone={onDone}/>)
        }
        {/* <button onClick={addtodo}>Add Task</button> */}
        </div>
        )
      }