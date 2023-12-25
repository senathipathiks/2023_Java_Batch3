//! 8. Write a javascript function to calculate the nth fibonacci number.

function fibonacci() {
  let n = document.getElementById("num").value-1;
  let a = 0;
  let b = 1;

  if (n === 0) {
    let con = document.getElementById("con");
    con.innerHTML = b;
  } else {
    for (let i = 2; i <= n; i++) {
      let c = a + b;
      a = b;
      b = c;
    }    
    let con = document.getElementById("con");
    con.innerHTML = b;
  }
}


