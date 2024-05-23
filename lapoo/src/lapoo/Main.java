package lapoo;

public class Main {

	public static void main(String[] args) {
		Brand samsung = new Brand("Samsung");
		Telephone myPhone = new Telephone(40000, "Galaxy Z600", samsung);
		System.out.println(myPhone.brand.name);
		System.out.println(myPhone.pixels);
		myPhone.pixels = 60000;
		System.out.println(myPhone.pixels);

	}

}