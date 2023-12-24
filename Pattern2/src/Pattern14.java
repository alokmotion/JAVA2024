
public class Pattern14 {

	public static void main(String[] args) {
		for(int i=1; i<=5 ; i++) {
			for (int j=1; j<=6-i ;j++) {
				if(i==1 || j==1 ||j==6-i || i==5) {
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
