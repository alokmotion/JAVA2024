import java.util.Scanner;

public class VoteEligibilityChacker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Nationality");
		String nationality = scan.nextLine();
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		
		VoteEligibilityChackerApp.vote(age, nationality);
	}

}
