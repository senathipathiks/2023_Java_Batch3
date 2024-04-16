package junit;

public class TestMe {
//
//	public String makeUpper(String input) {
//		return input.toUpperCase();
//	}
//
//	public int findSum(int num1, int num2) {
//
//		return num1 + num2;
//	}

	
	//WAP to accept an array as input,divide the first element by last element
	//If the last element is zero return -1 else the result
	public int divideNums(int[] arr) {
		if (arr[arr.length - 1] == 0) {
			return -1;   //code with business logic implementation
		} else {
			return arr[0] / arr[arr.length - 1];
		}
	}
}
