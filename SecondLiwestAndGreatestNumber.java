package JavaBasics;

public class SecondLiwestAndGreatestNumber {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 8, 1, 7, 3, 4, 6 };

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < lowest) {
                secondLowest = lowest;
                lowest = number;
            } else if (number < secondLowest && number != lowest) {
                secondLowest = number;
            }

            if (number > greatest) {
                secondGreatest = greatest;
                greatest = number;
            } else if (number > secondGreatest && number != greatest) {
                secondGreatest = number;
            }
        }

        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Greatest: " + secondGreatest);
    }
}


