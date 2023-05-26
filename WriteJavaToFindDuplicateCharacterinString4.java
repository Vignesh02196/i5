package i5Program;

public class WriteJavaToFindDuplicateCharacterinString4 {
public static void main(String[] args) {
	String str = "hello world";
    int count;

    // Convert the string to lowercase to ignore case
    str = str.toLowerCase();

    // Convert the string to char array for easy iteration
    char[] chars = str.toCharArray();

    System.out.println("Duplicate characters in the string \"" + str + "\":");

    // Iterate over each character in the array
    for (int i = 0; i < chars.length; i++) {
        count = 1;

        // If the character has already been counted, skip it
        if (chars[i] == ' ') {
            continue;
        }

        // Count the occurrences of the character in the rest of the string
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
                count++;
                // Mark the character as counted by replacing it with a space
                chars[j] = ' ';
            }
        }

        // If the character occurred more than once, print it
        if (count > 1) {
            System.out.println(chars[i] + " - " + count);
        }
    }
}
}
