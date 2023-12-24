import java.util.Scanner;

public class ArithmeticOperationsApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter num 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter num 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Sub Result "+subtractNumbers(num1,num2));
		System.out.println("Multi Result "+multiplyNumbers(num1,num2));
		System.out.printf("Div Result "+"%.2f%n",divideNumbers(num1,num2));
		System.out.println("Remainder Result "+findRemainder(num1,num2));
		

	}
	
	
	public static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		
	}
	
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}
