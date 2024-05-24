package lapoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Brand samsung = new Brand("Samsung");
		Telephone myPhone = new Telephone(40000, "Galaxy Z600", samsung);
		System.out.println(myPhone.brand.name);
		System.out.println(myPhone.pixels);
		myPhone.pixels = 60000;
		System.out.println(myPhone.pixels);

		Car myCar = new Car();
		myCar.start();

		Boat myBoat = new Boat();
		myBoat.start();

		Dog ralph = new Dog();
		ralph.move();

		String[] myArray = new String[10];
		myArray[3] = "hey";
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		int[] cupOfCoffeePerDayOfTheWeek = new int[] { 1, 2, 6, 5, 8, 1, 2 };
		System.out.println(cupOfCoffeePerDayOfTheWeek[2]);

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(12);
		myList.add(5);
		System.out.println(myList);
		myList.add(1, 8);
		System.out.println(myList);
		myList.set(0, 81);
		System.out.println(myList);
		myList.remove(1);
		System.out.println(myList);

		System.out.println(myList.size());

		Set<String> myRecipe = new HashSet<String>();
		myRecipe.add("chocolate");
		myRecipe.add("sugar");
		myRecipe.add("milk");

		System.out.println(myRecipe.size());
		System.out.println(myRecipe);

		myRecipe.remove("milk");
		System.out.println(myRecipe);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jean", 42);
		map.put("Anais", 25);
		map.put("Jean", 89);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println(map.get("Jean"));

		final String KPAUL = "Paul";
		final String KJOHN = "John";

		map.put(KJOHN, 32);
		map.put(KPAUL, 38);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		map.put(KJOHN, 73);
		System.out.println(map.get(KJOHN));
		map.remove(KJOHN);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println(map.size());

		int perimeter = DisplayPerimeter.calculatePerimeter(2, 4);
		System.out.println(perimeter);

		String nom1 = "José";
		String nom2 = nom1;
		nom1 = "Jesus";
		DisplayName.displayName(nom1);
		DisplayName.displayName(nom2);

		People guy = new People("Guy");
		People marcus = guy;
		guy.name = "Pas Guy";
		DisplayName.displayName(guy.name);
		DisplayName.displayName(marcus.name);

		Countdown.countdown(60);

		Animal bird = new Animal() {
			@Override
			public
			void move() {
				System.out.println("I fly!");
			}
		};

		bird.move();
		Locomotion pigeon = () -> {System.out.println("I plane");};
		pigeon.move();
		
		GivingName name1 = (theName) -> {
			System.out.println("My name is " +theName+ ".");
		};
		name1.givingName("John");
	}

}