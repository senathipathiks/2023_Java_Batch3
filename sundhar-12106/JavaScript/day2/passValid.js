let pass = "Sundharrajvcusgvipuojip@123";

function validPass(pass) {

    let pattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\-+.]).{6,20}$/ ;

    console.log(pattern.test(pass));
}

validPass(pass);


