
package i5Program;

public class PrimeNumber17 {
	public static void main(String[]args) {
		int num = 12;
		int temp = 0;
		//divisible by 1 and itself only
		/*So we have to check divisibility with numbers 
		 * in between 1 and the number
		 * So here we are iterating from 2 and up to n-1*/
		for (int i = 2; i<=num-1 ; i++){
			if(num%i==0) {
				temp = temp+1;
			}
		}
		if (temp>0) {
			System.out.println(num+" is notPrime");
		}
		else {
			System.out.println(num+" is Prime");
		    }
		}
}
