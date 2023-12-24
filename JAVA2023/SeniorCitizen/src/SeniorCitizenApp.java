import java.util.Scanner;

public class SeniorCitizenApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age ");
		int age = scan.nextInt();
		SeniorCitizen.checkAgeToKnowPerson(age);

	}

}
