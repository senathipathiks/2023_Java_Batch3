var input=document.querySelector("#inputText");
var tasklist=document.querySelector("#list");

function addTask(){
    if(input.value==""){
        alert("add your task");
    }
    else{
        let lis=document.createElement("lis");
        lis.innerHTML=input.value;
        tasklist.appendChild(lis);
        
    }
    
}