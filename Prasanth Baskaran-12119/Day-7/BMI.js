function calculateBMI() {
    var height= parseFloat(document.getElementById("f1").value);
    var weight= parseFloat(document.getElementById("f2").value);
    var result=document.getElementById("f3");
    
    if (isNaN(height) || isNaN(weight)) {
      result.innerHTML = "Please enter valid height and weight.";
      return;
    }
  
    var bmi =(weight / ((height / 100) ** 2));
    var category = "";
  
    if (bmi < 18.5) {
      category = "Underweight";
    } else if (bmi < 25) {
      category = "Normal weight";
    } else if (bmi < 30) {
      category = "Overweight";
    } else {
      category = "Obese";
    }
  
    result.innerHTML = "Your BMI is " + bmi.toFixed(2) + " (" + category + ")";
  }
  