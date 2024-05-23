package lapoo;

public class Car extends Vehicle {
	
	@Override
	void start() {
		super.start();
		lightsOn();
	}
	void lightsOn() {
		System.out.println("Lights On !");
	}
}
