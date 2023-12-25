

// let date  = "01-12-13";
let form = document.getElementById("btn").addEventListener("click",e=>{
   e.preventDefault();
   // console.log("hello");
   let date = document.getElementById("dob").value;
   // console.log(date);
   let ag = age(date)
   if (isNaN(ag)) {
      document.getElementById('res').innerHTML="please enter valid data";
   } else {
      document.getElementById('res').innerHTML="your age is : "+ag;  
   }
});
// console.log(form);
// form.

function age(date) {
   return Math.floor((new Date() - new Date(date)) / 3.15576e+10);//

}
// console.log(age(date));