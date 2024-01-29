import { useState } from "react";

export default function Todocomponent(props) {
  const [todoname, settodoname] = useState("");
  const [list, setlist] = useState(["kiruba", "karan"]);
  const[todotask,settodotask]=useState("");
  //add task to list
  const handleSubmit=(e)=>{
    let newList=[...list,todotask];
    newList.push({ name: todoname, task: todotask });
    document.write(newList);
    settodotask("")
    settodoname("")
    setlist(newList);
    e.preventDefault();
    if (!todoname || !todotask) return;
    
    };
    
  const updatetodoname = (e) => {
    settodoname(e.target.value);
  };
  const onDone = (item) => {
    console.log(item);
  };
  const addtodo = (e) => {
    // e.preventDefault();
    // if (!todoname || !todotask) return;
    // let newList = list;
    // newList.push({ name: todoname, task: todotask });
    // settodoname("");
    // settodotask("");
    // setlist(newList);
    };
    return (
      <div>
        <form onSubmit={handleSubmit}>
          <input type="text" placeholder="Todo Name" value={todoname} 
          onChange={updatetodoname} />
          <br/>
          <textarea rows="4" cols="50" placeholder="Add Task" 
          value={todotask} onChange={(e)=>{settodotask(e.target.value)}}
          ></textarea><br/><br/>
          <button type="submit">ADD TODO</button>
          </form>
          <ul>
            {list.map((item, index) => (
              <li key={index}></li>
              ))}
              </ul>
              
              </div>
              );
              }





         
        
    //   </div>
    // )
  //   setlist([
  //     ...list,
  //     {
  //       name: todoname,
  //       completed: false,
  //     },
  //   ]);
  //   settodoname("");
  //   document.write("The todo name is ", todoname);
  // };
  // return (
  //   <div>
  //     <h3>Todo list</h3>
  //     <input
  //       type="text"
  //       placeholder="add your task"
  //       value={todoname}
  //       onChange={updatetodoname}
  //     />
  //     <button onClick={addtodo}>Add task</button>
  //     <p value={todotask}>{props.name}</p>
  //     <br />
  //     <br />
  //     <button onClick={() => props.onDone(props.obj)}>Mark as done</button>
  //     <button>Delete</button>
  //   </div>
//   );
// }
