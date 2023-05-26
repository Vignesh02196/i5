package i5Program;

public class FindRepeatedValueInArray25 {
public static void main(String[] args) {
	int[] array = {1, 2, 2, 3, 4, 5};
    int repeatedValue = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] == array[j]) {
                repeatedValue = array[i];
                break;
            }
        }
    }

    System.out.println("The repeated value is: " + repeatedValue);
}
}
