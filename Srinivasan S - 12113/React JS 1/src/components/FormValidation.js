function Validation(){
    var firstnameRegEx ='^[a-zA-Z]{3,5}$'; 
    var lastnameRegEx = '^[a-zA-Z0-9]{5,10}$'; 
    var emailRegEx = '^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$';
    var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
    var ContactRegEx = '^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$';

    var firstname= document.querySelector("#firstname").value;
    var lastname=document.querySelector('#lastname').value;
    var email=document.querySelector('#email').value;
    var password=document.querySelector('#password').value;

    if (username == "") {
        alert("First name should not be empty")
    }
    

}