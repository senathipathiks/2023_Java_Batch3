var num = prompt("enter a number ");
// console.log(typeof(Number(num)));

var n = Number(num);

// console.log(isNaN(n));

// document.write(n);
check(n)

function check(n) {

    if (n%2 == 0 & n%3 == 0) {
        document.writeln(`<h1>Fizz Buzz</h1>`);
    } else if(n%3 == 0){
        document.writeln(`<h1>Buzz</h1>`);
    }else if(n%2 == 0){
        document.writeln(`<h1>Fizz</h1>`);
    }else if(isNaN(n)){
        document.writeln("this not a number");    
    }else{
        document.writeln("this method only check 2,3 and not anumber");
    }
}
