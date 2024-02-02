let arr = [1,2,3,4];

let [one,two,three,four]= arr;

console.log(arr)
console.log("After Destructing : ")
console.log("One : "+one+"\nTwo : "+two+"\nThree : "+three+"\nFour : "+four);

const obj = {
    name: "John",
    age: 30
};

const { name: name, age: age} = obj;
console.log(`${name} is ${age}`);