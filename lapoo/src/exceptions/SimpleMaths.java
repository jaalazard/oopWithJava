package exceptions;

import java.util.List;

public class SimpleMaths {
	public static int calculateAverage(List<Integer> values) {
		int count = values.size();
		int total = 0;
		for (int value: values) {
		total += value;
		}
		return total / count;
	}
}
