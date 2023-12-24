import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = scan.next().charAt(0);
		
		for(int i =1 ; i<= 5; i++) {
			
			for (int j = 1; j<= 5 ; j++) {
				
				System.out.print(ch);
				
			}
			System.out.println();
			
		}

	}

}
