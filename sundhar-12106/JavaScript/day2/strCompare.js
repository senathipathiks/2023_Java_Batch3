//!14. you will be given two strings a and b and your task is to return the characters 
//!that are not common in the two strings.

// let a = "arun";
// let b = "huawei";

// for (let index = 0; index < b.length; index++) {
    
    
// }

function validatecreditNo(params)
{
    var re16digit = /^\d{15,16}$/
    if (!re16digit.test(params))
        console.log("Please enter your 16 digit credit card numbers");
    else
        console.log("entered number is valid");
}

validatecreditNo(78004523764529);