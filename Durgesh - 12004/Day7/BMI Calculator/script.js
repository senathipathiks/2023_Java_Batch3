const zeroText = document.getElementById('zero');
const descText = document.getElementById('desc');
const form = document.querySelector('form');

form.addEvenListener('calculate', onFormCalculate)

function onFormCalculate(e) {
    e.preventDefault();

    const weight = parseFloat(form.weight.value);
    const height = parseFloat(form.height.value);

    if (isNaN(weight) || isNaN(height) || weight<= 0 || height<=0)
    {
        alert("Please enter the valid weight and height");
        return;
    }

    const heightInMeters = height/100;
    const zero = weight/Math.pow(heightInMeters, 2);

    zeroText.textContent = zero.toFixed(2);


}