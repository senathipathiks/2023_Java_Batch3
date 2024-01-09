var speed = prompt("enter a bike speed");
// console.log(typeof(Number(num)));

var n = Number(speed);

check(speed)

function check(n) {

    if (n <= 50) {
        document.writeln(`<h1>Safe Driving</h1>`)
    } else if(n > 50 & n <= 60){
        document.writeln(`<h1>Drive Safely</h1>`)
    }else if(n > 60 & n <= 70){
        document.writeln(`<h1 style="color: yellow;">Speed Limit Crossed reduce the Speed !!!</h1>`);
    }else{
        document.writeln(`<h1 style="color:red;">Over Speed</h1>`);
    }
}