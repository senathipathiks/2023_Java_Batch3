import React from 'react'

export default function ListItem() {
  return (
    <div className={props.obj.completed && "completed"}>
      <p>{props.obj.name}</p>
      <button onClick={() => props.onDone
    (props.obj)}>Mark as done</button>
      <button>Delete</button>
    </div>
  );
}
