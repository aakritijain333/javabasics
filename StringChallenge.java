package JavaBasics;

public class StringChallenge {

	public static String StringChallenge(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the reversed character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(StringChallenge("coderbyte"));  // Output: etybredoc
        System.out.println(StringChallenge("I Love Code"));  // Output: edoC evoL I
    }

}
