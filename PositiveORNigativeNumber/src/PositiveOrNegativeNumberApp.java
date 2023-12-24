import java.util.Scanner;

public class PositiveOrNegativeNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		
		PositiveOrNegativeNumber.checkNumber(num);
		

	}

}
