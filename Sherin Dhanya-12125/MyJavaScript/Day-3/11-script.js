function calculateBMI() {
    var height = parseFloat(document.getElementById("height").value);
    var weight = parseFloat(document.getElementById("weight").value);
        var bmi = weight/((height/100)*(height/100));
        alert("Your BMI is"+bmi.toFixed(2));
        if(weight==""){
            alert("weight can not be empty or 0");
        }
        else if(height ==""){
            alert("height can not be empty or 0");
        }
    }