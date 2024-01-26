let arr = [90,1,2,4,6,75.45];
let sum =0;

console.log(sumArr(arr));
function sumArr(arr) {
    arr.forEach(element => {
        sum +=element;
    });
    return Math.abs(sum)
}