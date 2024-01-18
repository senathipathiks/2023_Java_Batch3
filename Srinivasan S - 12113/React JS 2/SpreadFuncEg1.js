function display(){
    console.log(message);
    for(let i in arguments)
    console.log(arguments[i]);
}

let message="List of Colors";
display(message,"Red");
display(message,"Red","Green");
display(message,"Red","Green","Blue");
