let form=document.querySelector("form");
let inp_value=document.querySelector("#new_task");
let tasks=document.querySelector("#tasks");

form.addEventListener("submit",e=>{
    e.preventDefault();
   const task=inp_value.value;
   console.log(task)
   window.localStorage.setItem("todo",task);
   if(!task){
    alert("Please Add a Task")
   }else{
    let task_el=document.createElement("div");
   task_el.classList.add("task");

// !content block
   const task_content_el=document.createElement("div");
   task_content_el.classList.add("content");
   const task_input_el=document.createElement("input");
   task_input_el.setAttribute("type","text");
   task_input_el.setAttribute("readonly","readonly");
   task_input_el.value=task;
   task_content_el.appendChild(task_input_el);

   task_el.appendChild(task_content_el)

//    !action block
const input_action_el=document.createElement("div");
input_action_el.classList.add("actions");

const input_edit_btn=document.createElement("button");
input_edit_btn.innerText="Edit"
input_edit_btn.classList.add("edit");

const input_delete_btn=document.createElement("button");
input_delete_btn.innerText="Delete";
input_delete_btn.classList.add("delete")

input_action_el.appendChild(input_edit_btn)
input_action_el.appendChild(input_delete_btn)
task_el.appendChild(input_action_el);

tasks.append(task_el);
inp_value.value="";

// !for editing the values
input_edit_btn.addEventListener("click",_=>{
    if(input_edit_btn.innerText.toLowerCase()=="edit"){
        task_input_el.removeAttribute("readonly")
        task_input_el.focus();
        input_edit_btn.innerText="Save"
    }else{
        task_input_el.setAttribute("readonly","readonly");
        input_edit_btn.innerText="Edit"
    }
});

// ! deleting the element
input_delete_btn.addEventListener("click",_=>{
    tasks.removeChild(task_el)
})
   }

   


});
