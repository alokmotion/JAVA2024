import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = scan.nextInt();
		System.out.println("Enter second number");
		int y = scan.nextInt();
		
		System.out.println(GCD.findGCD(x, y));
	
				
	}

}
