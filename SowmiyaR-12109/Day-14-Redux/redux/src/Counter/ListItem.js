import { useState } from "react";


export default function ListItem(props) {
    const[todoname,settodoname]=useState("");
    const[list,setlist]=useState(["Sowmi","Sowmiya"]);
    const updatetodoname =(e)=>{
        settodoname(e.target.value);
    }
    const addtodo=(e)=> {
        e.preventDefault();
        setlist([...list,todoname]);
        settodoname("");
        document.write('The todo name is ',todoname)
        };
  return (
    <div>
      
        <p>{props.name}</p>
        <h3>Todo list</h3>
      <input type='text'
       placeholder='add your task'
        value={todoname}
      onChange={updatetodoname} />
      <button onClick={addtodo}>Add task</button><br/><br/>
        <button >Mark as done</button>
        <button >Delete</button>

    
    </div>
  );
}