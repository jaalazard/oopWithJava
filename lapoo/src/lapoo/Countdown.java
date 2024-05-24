package lapoo;
// Recursion 
public class Countdown {
	public static void countdown(int number) {
		if (number == 0) {
			System.out.println("Finito!");
		}
		else {
			System.out.println("-> " +number);
			number--;
			countdown(number);
		}
	}
}
