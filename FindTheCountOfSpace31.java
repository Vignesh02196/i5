package i5Program;

import java.util.Arrays;

public class FindTheCountOfSpace31 {
	public static void main(String[] args) {
        String[] num = {"George", " ", "Madhan", " "};
        long total=Arrays.stream(num).filter(x->x.equals(" ")).count();
        System.out.println(total);
	}
}
	
