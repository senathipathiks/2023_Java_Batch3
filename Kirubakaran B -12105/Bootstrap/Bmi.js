function calculateBMI() {
    var height = document.getElementById("height").value;
    var weight = document.getElementById("weight").value;

    if (height && weight) {
        var bmi = (weight / ((height / 100) * (height / 100))).toFixed(2);
        var result = "";

         console.log(bmi);

        if (bmi < 18.5) {
            result = "Less weight " + bmi;
        } else if (bmi >= 18.5 && bmi < 25) {
            result = "Normal weight "+bmi;
        } else if (bmi >= 25 && bmi < 30) {
            result = "Over weight "+bmi;
        } 

        document.getElementById("result").innerHTML = result;
    } else {
    
        document.getElementById("result").innerHTML = "Please enter both height and weight.";
    }
}