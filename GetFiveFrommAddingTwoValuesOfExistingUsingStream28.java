package i5Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFiveFrommAddingTwoValuesOfExistingUsingStream28 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(0);
		list.add(5);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == 5) {
					System.out.println(list.get(i) + "" + list.get(j));

				}
			}
		}
	}
}
