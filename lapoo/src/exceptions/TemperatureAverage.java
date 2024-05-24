package exceptions;

import java.util.List;

public class TemperatureAverage {
	public static int temperatureAverage(List<Integer> temperatures) {
		return SimpleMaths.calculateAverage(temperatures);
	}
}
