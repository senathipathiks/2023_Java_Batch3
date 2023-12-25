
let name = "sundhar s"

let arr1 = name.split("");


arr1[0] = arr1[0].toUpperCase();
arr1[arr1.length-1] = arr1[arr1.length-1].toUpperCase();

// console.log(arr1[0]);
// console.log(arr1[arr1.length-1]);

name = arr1.join("");
console.log(name);