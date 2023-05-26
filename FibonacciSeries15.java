package i5Program;

public class FibonacciSeries15 {
	public static void main(String[]args) {
		int a=0,b=1,c,count=10;
		for(int i=2;i<=count;i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
		
	}

}
