import java.util.Scanner;

public class GraterNumber3Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		
		System.out.println("Enter Second Number");
		int b = scan.nextInt();
		
		System.out.println("Enter Third Number");
		int c = scan.nextInt();
		
		graterNumber(a,b,c);
		
		
		
	}
	
	
	static void graterNumber(int a , int b, int c ) {
		if(a>b && a> c) {
			System.out.println(a);
		} else if(b>a && b>c ) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
