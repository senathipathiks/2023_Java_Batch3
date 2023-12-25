var n = prompt("enter the string to find palindrome or not")
// var n = "madam";

palindrome(n);


function palindrome(n) {
    // console.log("hello");
    var n1 = n.split("");
    var arr = n1.reverse();
    var rev = arr.join("");
    console.log(arr);

    if(n == rev) {
        document.write("<h1>the given string is palindrome</h1>");
    } else {
        document.write("<h1>the given string is not palindrome</h1>");
    }
}