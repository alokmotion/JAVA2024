import java.util.Scanner;

public class EvenSumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter   number ");
		int n = scan.nextInt();
		System.out.println("Sum of n even Number " + EvenSum.calculateEvenSum(n));

	}

}
