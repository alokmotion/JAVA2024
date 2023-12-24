import java.util.Scanner;

public class AdultApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age ");
		int age = scan.nextInt();
		Adult.printAdult(age);
		

	}

}
