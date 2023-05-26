package i5Program;

public class printStringTotalNumberValue11 {
	public static void main(String[] args) {
		String values = "2-1+3";

        // Split the string into an array of values
        String[] operands = values.split("[+-]");

        // Split the string into an array of operators
        String[] operators = values.split("\\d+");

        // Evaluate the expression
        int result = Integer.parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            if (operators[i].equals("+")) {
                result += Integer.parseInt(operands[i]);
            } else {
                result -= Integer.parseInt(operands[i]);
            }
        }

        System.out.println("Original string: " + values);
        System.out.println("Result: " + result);
    }
}




