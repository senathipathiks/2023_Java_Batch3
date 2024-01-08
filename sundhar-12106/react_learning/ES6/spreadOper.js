"use strict"
function display(message, ...colors) {
  console.log(message);
  for (let i in colors) {
    console.log(colors[i]);
  }
}
let message = "list of colors"
let colArray = ["red", "green", "orange"];
display(message,...colArray);
