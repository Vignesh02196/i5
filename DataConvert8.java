package i5Program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataConvert8 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Date : ");
        String dateString = sc.next();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = format.parse(dateString);
        System.out.println(date);
    }
}
