package i5Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondMaximum33 {
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,4,5,77,8,444);
		int sec=a.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(sec);
	}

}
