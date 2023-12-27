function cal(){
    var weight = parseFloat(document.getElementById("weight").value);
    var height = parseFloat(document.getElementById("height").value)/100;               //Converting into meter
    if(weight==0)
    alert("Weight cannot be Zero");
    else if(height==0)
    alert("height cannot be Zero");
    else{
    var bmi =(weight/Math.pow(height,2));
    document.getElementById("result").innerHTML="BMI Value : "+bmi.toFixed(2)+"<br><br>"+"<img src=\"https://img.freepik.com/premium-vector/man-body-mass-index-fitness-bmi-chart-with-male-silhouettes-scale_53562-7067.jpg?w=2000\" width =600px height= 400px>";
    }
} 