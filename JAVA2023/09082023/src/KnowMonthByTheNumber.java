import java.util.Scanner;

public class KnowMonthByTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number To Know Month Name (1-12)");
		int num = scan.nextInt();
		KnowMonthByTheNumberApp.printMonth(num);

	}

}
