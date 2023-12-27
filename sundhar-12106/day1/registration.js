let submit = document.querySelector('.button');
// console.log(submit);
submit.addEventListener('click',e=>{
e.preventDefault()
 let pass = document.querySelector('#pass').value;
 let re_pass = document.querySelector('#re-pass').value;
p1 = validPass(pass);
p2 = validPass(re_pass);
// console.log("hello");
 if (p1) {
    // console.log("hello");
    if (p2) {
        if (p1 != p2){
            document.querySelector('.res').innerHTML="password missmatch";
        }else{
            // console.log("hello");
            numValidation();
            // document.createElement("a").setAttribute('href',"home.html");
            window.location.href="./login.html"
        }
    } else {
        document.querySelector('.res').innerHTML="please follow password criteria";
    }
 } else {
    // console.log("else");
    document.querySelector('.res').innerText="password follow criteria"  
 }
    
});

function validPass(pass) {

    let pattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/ ;
    // console.log(pass);
    // console.log(pattern.test(pass));
     return pattern.test(pass);
}

function numValidation() {
    let number = document.getElementById("mob").value;
    let res = "valid";
    if (isNaN(number) || number.length == 0 || number.length < 10) {
      res = "enter a valid number";
      alert("not a valid number");
    }
    
  }