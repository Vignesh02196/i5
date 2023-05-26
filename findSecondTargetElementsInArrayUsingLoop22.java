package i5Program;

public class findSecondTargetElementsInArrayUsingLoop22 {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5};
	int target = 5;
	int count = 0;
	int secondIndex = -1;

	for(int i = 0; i < arr.length; i++){
	    if(arr[i] == target){
	        count++;
	        if(count == 2){
	            secondIndex = i;
	            break;
	        }
	    }
	}

	if(secondIndex != -1){
	    System.out.println("The second occurrence of " + target + " is at index " + secondIndex);
	} else {
	    System.out.println(target + " does not occur twice in the array");
	}
}
}
