const form = document.getElementById('bmi-form');
    const result = document.getElementById('result');

    form.addEventListener('submit', function(event) {
      event.preventDefault();

      const weight = Number(document.getElementById('weight').value);
      const height = Number(document.getElementById('height').value) / 100;

      if (weight > 0 && height > 0) {
        const bmi = weight / (height * height);
        result.innerHTML = `Your BMI is <strong>${bmi.toFixed(1)}</strong>.`;
      } else {
        result.innerHTML = 'Please enter valid values.';
      }