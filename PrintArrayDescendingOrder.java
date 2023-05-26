package i5Program;

import java.util.Arrays;

public class PrintArrayDescendingOrder {
public static void main(String[] args) {
	int []array= {2,3,5,1,6,8};
	Arrays.sort(array);
//	int temp=0;
	System.out.println(Arrays.toString(array));
	for(int i=array.length-1;i>=0;i--) {
//		temp=array[i];
		System.out.print(array[i]+",");
	}
//	System.out.print(temp+",");
}
}
