let date  = "08-20-2000"
function age(date) {
   return Math.floor((new Date() - new Date(date)) / 3.15576e+10);//

}
console.log(age(date));