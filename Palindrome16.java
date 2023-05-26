package i5Program;

public class Palindrome16 {
	public static void main(String[]args) {
		String word="Madam";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
		//System.out.println(temp);
		if(word.equalsIgnoreCase(temp)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is Not a Palindrome");
		}
	}

}
