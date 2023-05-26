package i5Program;

public class SixthQuestions6 {
	public static void main(String[] args) {
        String s = "a1b2c3";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Get the number of times the letter should appear
                int count = Character.getNumericValue(s.charAt(i + 1));

                // Append the letter to the result string count number of times
                for (int j = 0; j < count; j++) {
                    result.append(c);
                }
            }
        }

        System.out.println("Original string: " + s);
        System.out.println("Extracted string: " + result.toString());
    }
}
