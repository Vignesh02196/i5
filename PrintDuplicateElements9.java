package i5Program;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElements9 {
	public static void main(String[] args) {
        String paragraph = "I am wirtting as java developer";
        
        // Remove spaces from the string
        String stringWithoutSpaces = paragraph.replaceAll("\\s", "");

        // Convert the string to an array of characters
        char[] characters = stringWithoutSpaces.toCharArray();

        // Use a Set to find and print duplicate characters
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char c : characters) {
            if (!set.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println("Original string: " + paragraph);
        System.out.println("String without spaces: " + stringWithoutSpaces);
        System.out.println("Duplicate characters: " + duplicates);
    }
}
