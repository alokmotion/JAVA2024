import java.util.Scanner;

public class TheStringJoiner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		String fristStr = scan.nextLine();
		System.out.println("Enter Second String");
		String SecondStr = scan.nextLine();
		
		
		System.out.println(joinStrings(fristStr, SecondStr ));
		
	}
	
	public static String joinStrings(String str1, String str2) {
		return str1+ str2;
	}

}
