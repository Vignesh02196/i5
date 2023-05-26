package i5Program;

import java.util.Arrays;

public class HowRemoveDuplicateAndPrintAscendingOrder27 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {6,2,3,5};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c= new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));
        for(int i = 0; i<c1; i++) {  
            for(int j = i + 1; j <c1; j++) {  
                if(c[i] == c[j])  
                    System.out.println("Duplicate value is: " + c[i]);
	}
		}
}
}