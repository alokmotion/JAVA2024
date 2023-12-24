
public class LaptopApp {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.processor = "2.5 GH";
		l1.ram = 8;
		l1.brand = "HP";
		l1.os = "Windows";
		l1.cost = 57000.00F;
		l1.switchOn();
		l1.switchOff();
		l1.details();
		
		new Laptop().details();

	}
	
	

}
