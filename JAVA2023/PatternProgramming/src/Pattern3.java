import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = scan.next().charAt(0);
		for (int i =1 ; i<=5 ; i++) {
		System.out.println(ch);
		}
	}

}
