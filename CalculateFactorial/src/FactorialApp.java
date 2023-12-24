import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		System.out.println(Factorial.calculateFactorial(n));

	}

}
