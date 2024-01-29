function display(message,...colors){
    console.log(message);
    for( let i in colors)
    console.log(colors[i]);
}
let message="list of colors";
display(message,"red");
display(message,"red","green",);
display(message,"red","green", "blue");
