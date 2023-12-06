package JavaBasics;

import java.util.Arrays;

public class ArrayChallenge {

	public static String ArrayChallenge(int[] arr) {
		// Remove duplicates by converting the array to a set and back to an array.
	    arr = Arrays.stream(arr).distinct().toArray();

	    // Check if there are at least two unique numbers in the array.
	    if (arr.length < 2) {
	      return "EMPTY";
	    }

	    // Sort the array to find the second lowest and second greatest numbers.
	    Arrays.sort(arr);

	    int secondLowest = arr[1];
	    int secondGreatest = arr[arr.length - 2];

	    // Convert the result to a formatted string.
	    String result = String.format("%d %d", secondLowest, secondGreatest);

	    // Define the ChallengeToken.
	    String challengeToken = "kvph3ti6c8";

	    // Remove characters from the result that appear in the ChallengeToken.
	    result = result.replaceAll("[" + challengeToken + "]", "");

	    return result;
	  }

	  public static void main(String[] args) {
	    // Example usage:
	    int[] arr = { 7, 7, 12, 98, 106 };
	    System.out.println(ArrayChallenge(arr)); // Output: "12 98"
	  }
}
