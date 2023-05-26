package i5Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Maximum32 {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(1,4,5,77,8,444);
	int max=a.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(max);
}
}
