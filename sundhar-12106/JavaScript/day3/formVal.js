function validate() {
    let firstname = document.getElementById('fir').value;
    let lastname = document.getElementById('last').value;
    let mail = document.getElementById('mail').value;
    let pass = document.getElementById('pass').value;
    let mail_pat = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/;
    let pass_pat = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;

    if (firstname == "") {
        alert("first name cannot be null");
    } else if(lastname==""){
        alert("last name cannot be null");
    }else if(mail == ""){
        alert("please enter mail id");
    }else if (!mail_pat.test(mail)) {
        alert("please enter valid mail address");
    } else if (pass == "") {
        alert("password cannot be null")
    } else if(!pass_pat.test(pass)){
     alert("enter password in the criteria")   
    }else{
        // console.log("hello");
       let result = document.querySelector('.res');
       result.innerHTML="validated successfully"; 
       result.style.color='green';
       result.style.bacgroundcolor ='red';
       result.style.height='25px';
       result.style.width='100px';
       result.style.border ="2px solid black";


          
    }
}