import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = scan.next().charAt(0);
		
		for(int i =1 ; i<= 6; i++) {
			
			for (int j = 1; j<= 7-i ; j++) {
				
				System.out.print(ch);
				
			}
			System.out.println();
			
		}
	}

}



//	i(row)  = no of star
//	1			5 => 5-1+1
//	2			4 => 5-2+1
//	3			3 => 5-3+1
//	4			2 => 5-4+1
//	5			1 => 5-5+1
//					 5-i+1 => 6-i