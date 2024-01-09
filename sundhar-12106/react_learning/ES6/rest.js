// function display() {
//     console.log(message);
//     for (let i in arguments) {
//         console.log(arguments[i]);
//     }
// }
// let message = "list of colors";
// display(message,"red");
// display(message,"red","blue","yellow");


function display(message,...colors) {
  console.log(message);
  for (let i in colors) {
    console.log(colors[i]);
  }
}
let message = "list of colors";
display(message,"red");
display(message,"red","blue","yellow");