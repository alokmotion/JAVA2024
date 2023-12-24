
public class VoteEligibilityChackerApp {
	static void vote(int age, String nationality) {
		if (nationality.equals("india")) {
			if(age >= 18) {
				System.out.println("You are Elegible to Vote");
			} else {
				System.out.println("Focus on studies");
			}
			
			
			
		}
		else {
			System.out.println("Only Indian are allowed");
		}

	}

}
