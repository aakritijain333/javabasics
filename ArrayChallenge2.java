package JavaBasics;

import java.util.Arrays;

public class ArrayChallenge2 {

	 public static int ArrayChallenge(int[] arr) {
	        // Sort the array in descending order
	        Arrays.sort(arr);
	        int n = arr.length;

	        // Calculate the sum of the four largest elements or all elements if less than four
	        int sum = 0;
	        for (int i = n - 1; i >= Math.max(0, n - 4); i--) {
	            sum += arr[i];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(ArrayChallenge(new int[]{4, 5, -2, 3, 1, 2, 6, 6}));  // Output: 21
	        System.out.println(ArrayChallenge(new int[]{1, 1, 1, -5}));  // Output: -2
	        System.out.println(ArrayChallenge(new int[]{0, 0, 2, 3, 7, 1}));  // Output: 13
	    }

}
