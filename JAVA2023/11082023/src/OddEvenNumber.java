import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the Ending Number");
		int num2 = scan.nextInt();
		
		for (int i = num1 ; i <= num2 ; i++ ) {
			if((i%2) == 0) {
				System.out.println("Even Number = " + i);
			} else {
				System.out.println("odd Number = " + i);
			}
		}

		}

}
