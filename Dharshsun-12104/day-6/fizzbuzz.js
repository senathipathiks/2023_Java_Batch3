function fizzBuzz(input) {
	// Declare an array
	let output = [];


	// Loop from 1 to n (inclusive)
	for (let i = 1; i <= input; ++i) {
	
		// Check if i is divisible by both 2 and 3
		if (i % 2 === 0 && i % 3 === 0) {
		
			// Add "FizzBuzz" to the result array
			console.log("FizzBuzz");
		} 
		
		// Check if i is divisible by 2
		else if (i % 2 === 0) {
		
			// Add "Fizz" to the result array
			console.log("Fizz");
		} 
		
		// Check if i is divisible by 3
		else if (i % 3 === 0) {
		
			// Add "Buzz" to the result array
			console.log("Buzz");
		} 
		else {
		
			// Add the current number as a string to the
			// result array
			console.log(i.toString());
		}
	}

	// Return the result array
	return output;
}
let n = 10;
// Call the fizzBuzz function to get the result
let output = fizzBuzz(n);
// Print the result
console.log(output.join(' '));