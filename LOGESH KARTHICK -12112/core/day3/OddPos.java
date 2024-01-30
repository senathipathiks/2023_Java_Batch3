package core.day3;

public class OddPos {
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
        System.out.println("Elements of given array present on odd position:");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}



