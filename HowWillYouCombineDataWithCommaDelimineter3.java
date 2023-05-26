package i5Program;
public class HowWillYouCombineDataWithCommaDelimineter3 {
public static void main(String[] args) {
	String[] data = {"apple", "banana", "orange"};
	String combined = String.join(",", data);
	System.out.println(combined); 
}
}
