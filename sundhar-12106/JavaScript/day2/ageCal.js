

let date  = "2000-11-11"
function age(date) {
   return Math.floor((new Date() - new Date(date)) / 3.15576e+10);//

}
console.log(age(date));