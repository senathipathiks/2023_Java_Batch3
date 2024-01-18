function display(message,...colors){
    console.log(message);
    for (let i in colors)
    console.log(colors[i]);
}
let message="List of colors";
let colorarray=["red","blue","green"];
display(message,...colorarray);