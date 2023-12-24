import java.util.Scanner;
public class MethodOverloadingCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		Double num1 = scan.nextDouble();
		System.out.print("Enter the secound number: ");
		Double num2  = scan.nextDouble();
		
		System.out.print("Enter the operator: ");
		String op  = scan.nextLine();
		
		System.out.println("Result: " + Calculate(num1,num2,op));
		

	}
	
	public static double Calculate(double num1, double num2, String op) {
		double add = num1 + num2;
		return add;
	}
	
	public static double Calculate(double num1, double num2, String op) {
		double sub = num1 - num2;
		return sub;
	}
	
	
	public static double Calculate(double num1, double num2, String op) {
		double multi = num1 * num2;
		return multi;
	}
	
	public static double Calculate(double num1, double num2, String op) {
		double div = num1 / num2;
		return div;
	}
	
	
}











// here we have to use switch cases
