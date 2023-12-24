import java.util.Scanner;

public class AdditionApp {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1: ");
		long num1 = scan.nextLong();
		
		System.out.println("Enter num 2: ");
		long num2 = scan.nextLong();
		
		System.out.println(galacticAddition(num1,num2));
		
		
		
	}
	
	public static long galacticAddition(long num1, long num2) {
		long result = num1 +  num2;
		return result;
	}
	
	
	
	
	
	
	

}
