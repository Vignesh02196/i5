package i5Program;

import java.util.Scanner;

public class FindMissingNumber26 {
	public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int missingNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
        int userInput = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == userInput) {
                missingNumber = 0;
                break;
            } else {
                missingNumber = userInput;
            }
        }

        System.out.println("The missing number in the array is: " + missingNumber);
    }
}
