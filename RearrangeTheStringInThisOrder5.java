package i5Program;

import java.util.Arrays;

public class RearrangeTheStringInThisOrder5 {
	public static void main(String[] args) {
        String word = "a b c f e d";

        // Convert the string to an array of words
        String[] words = word.split(" ");

        // Sort the array using Arrays.sort()
        Arrays.sort(words);

        // Concatenate the words back into a string
        String sorted = String.join(" ", words);

        System.out.println("Original string: " + word);
        System.out.println("Sorted string: " + sorted);
    }
}
