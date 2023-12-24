import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = scan.nextInt();
		
		System.out.println("Enter another Number");
		int b = scan.nextInt();
		
		if(a>=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
