package i5Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSumOfFloatNumber30 {
	public static void main(String[] args) {
		List<Double> k=Arrays.asList(100.0,127.2,500.0,23.0);
		Double sum = k.stream().collect(Collectors.summingDouble(Double::doubleValue));
		System.out.println(sum);
      }	
}