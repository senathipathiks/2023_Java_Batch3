// let sub = document.getElementById("btn");

function numValidation() {
  let number = document.getElementById("num").value;
  let res = "valid";
  if (isNaN(number) || number.length == 0 || number.length < 10) {
    res = "enter a valid number";
    alert("not a valid number");
  }
  let con = document.getElementById("con");
  con.innerHTML = res;
}
