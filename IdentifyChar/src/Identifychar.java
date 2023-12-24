
public class Identifychar {
	public static void identifycharcter(char ch) {
		if(ch>='A' && ch <='Z') {
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' ||  ch=='U' ) {
				System.out.println("Capital Letter Vowel");
			} else {
				System.out.println("Capital Letter Consonent");
			}
		} else if (ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' ) {
				System.out.println("Small Letter Vowel");
			} else {
				System.out.println("Small Letter Consonent");
			}
			
		} else if (ch>='0' && ch<='9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Charcter");
		}
			
	}

}
