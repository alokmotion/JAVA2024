
public class Laptop {
	String processor;
	int ram;
	String brand, os;
	float cost;
	
	void switchOn() {
		System.out.println("Laptop has Switch ON");
		
	}
	void switchOff() {
		System.out.println("Laptop has Switch OFF");
		
	}
	
	void details() {
		System.out.println("Laptop Details");
		System.out.println("Processor " + processor);
		System.out.println("Ram " + ram +" GB");
		System.out.println("Brand " + brand);
		System.out.println("OS " + os);
		System.out.println("Cost " + cost);
		
		
	}
	

}


