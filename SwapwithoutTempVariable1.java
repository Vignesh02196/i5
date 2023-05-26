package i5Program;

public class SwapwithoutTempVariable1 {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
