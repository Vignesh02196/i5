package i5Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStringAndArrangeDecendingOrder7 {
public static void main(String[] args) {
	String val="1,2,3,1,2,3";
	String []a=val.split(",");
	Set<Integer> s=new HashSet<>();
	for(String x:a) {
		s.add(Integer.parseInt(x));
	}
	Integer []array=s.toArray(new Integer[0]);
	 Arrays.sort(array, Collections.reverseOrder());
System.out.println(Arrays.toString(array));
}
}
