// window.onload=function(){
//     if (document.cookie !=0 ) {
//        console.log(document.cookie); 
       
//         var arr=document.cookie.split(";");
//         var arr1,arr2;
//         arr.forEach(e=> {
//             arr1=e.split("=")
//             console.log(arr1);
//         });
    
//     //    arr.forEach(e => {
//     //     arr1=e.split("=");
//     //      console.log(arr1);
//     //     arr1.forEach(e1 => {
//     //       console.log(e1); 
//     //      });
//     //    });
        
//         document.getElementById("tb1").value=arr[1];
//         document.getElementById("tb2").value=arr1[2];            
//     }
// }

function Validation()
        {
            var usernameRegEx ='^[a-zA-Z0-9]{5,16}$'; 
            var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
            // var fname = document.getElementById("fname").value;
            // var lname = document.getElementById("lname").value;
            var username = document.getElementById("tb1").value;
            var password = document.getElementById("tb2").value;
            if(username == ""){
                alert("User name can not be empty");
            }
            else if(! username.match(usernameRegEx)){
                alert("Enter valid username")
            }
        
            else if(password == ""){
                alert("Password is must");
            }
            else if(password.length <6 && ! password.match(passwordRegEx)){
                alert("Enter Valid Password!")
            }
            else{
                alert("Login Successfull")
               
            document.cookie="tb1=" + username ;
            document.cookie="tb2=" + password ;
            }

    
}
    