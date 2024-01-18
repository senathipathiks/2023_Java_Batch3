function display(message,...colors){//rest operator
    console.log(message);
    for(let i in colors)
    console.log(colors[i]);
}

let message="List of Colors";
display(message,"Red");
display(message,"Red","Green");
display(message,"Red","Green","Blue");
