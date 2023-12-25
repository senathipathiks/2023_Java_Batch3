//!14. you will be given two strings a and b and your task is to return the characters 
//!that are not common in the two strings.



function validate(params)
{
    // dat();
    let cNum = document.querySelector('#num').value;
    let cvNum = document.querySelector('#cvv').value;

   if (dat() && validatecreditNo(cNum)  && cvv(cvNum)) {
    document.querySelector('#res').innerHTML = "credit card verified successfully..!";
   } else {
    document.querySelector('#res').innerHTML = "sorry some details are wrong..!";
   }
}

// validatecreditNo(78004523764529);

function validatecreditNo(params) {

    var re16digit = /^\d{15,16}$/
    if (re16digit.test(params))
        return true;
    else
        return false;
}

function cvv(params) {

    var num = /^\d{3,3}$/
    if (num.test(params)) {
        return true;
    } else 
        return false;
    
}


function dat() {
    let d = document.querySelector('#exp').value;
    // console.log(d);
    let date = new Date(d);
    // console.log(date);
    if (!isNaN(date)) {
        return true;
    } else {
        return false;
    }
}
// dat();