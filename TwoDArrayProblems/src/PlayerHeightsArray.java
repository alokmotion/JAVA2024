import java.util.Scanner;

public class PlayerHeightsArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		float [][][]arr = new float[n][m][n];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ;j++) {
				for(int k=0; k<arr.length; k++) {
					arr[i][j][k] = scan.nextFloat();
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ;j++) {
				for(int k=0; k<arr.length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
		
		
		

	}

}
