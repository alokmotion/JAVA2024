
public class Pattern8 {

	public static void main(String[] args) {
		
		
//		TO GET 5 ROWS
		for (int i = 1; i<= 5 ; i++) {
			
//			TO PRINT 5 SPACES  IN EACH ROW 
			for (int j= 1 ; j<=(i);j++) {
				System.out.print(" ");
			}
			
//			TO PRINT 5 STARS  IN ECAH ROW 
			for (int j =1 ; j<=10-(2*i)+1; j++) {
				System.out.print("*");
			}
			
//			TO SEND THE CURSOR TO NEXT LINE 
			System.out.println();
			
			
			
		}

	}

}
