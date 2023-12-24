import java.util.Scanner;

public class FibonacciSeriesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nth Number for Fibonacci Series");
		int n = scan.nextInt();
		FibonacciSeries.printSeries(n);

	}

}
