package i5Program;

public class howToGetSumOfElementsinAnArrayUsingForLoop21 {
public static void main(String[] args) {
	int[] arr = {2, 4, 6, 8, 10};
	int sum = 0;

	for (int i = 0; i < arr.length; i++) {
	    sum += arr[i];
	}

	System.out.println("The sum of the elements in the array is: " + sum);
}
}
