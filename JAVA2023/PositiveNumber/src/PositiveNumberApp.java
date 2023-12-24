import java.util.Scanner;

public class PositiveNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		PositiveNumber.printpositive(num);
		

	}

}
