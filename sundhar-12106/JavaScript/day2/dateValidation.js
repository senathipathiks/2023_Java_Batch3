let dateInput = "12-20-2023"; // YYYY/MM/DD format

let dateObj = new Date(dateInput);

console.log(dateObj); // Invalid Date

if (!isNaN(dateObj)) {
    console.log("valid");
} else {
    console.log("not a valid");
}