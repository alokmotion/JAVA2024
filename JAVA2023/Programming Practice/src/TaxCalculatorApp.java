import java.util.Scanner;
public class TaxCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		double purchase = scan.nextDouble();
		System.out.print("Enter the tax rate (in decimal form): ");
		double taxRate = scan.nextDouble();
		
		System.out.println("Total cost including Tax: " + CalculateTotalWithTax(purchase,taxRate));
		

	}
	
	
	public static double CalculateTotalWithTax(double purchase, double taxRate) {
		double taxAmount = purchase*taxRate;
		double totalCost = purchase +taxAmount;
				
		return totalCost;
	}

}
