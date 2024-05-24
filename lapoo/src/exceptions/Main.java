package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);

		System.out.println(SimpleMaths.calculateAverage(myList));

		List<Integer> temperatures = new ArrayList<Integer>();
		try {
			System.out.println(TemperatureAverage.temperatureAverage(temperatures));
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
