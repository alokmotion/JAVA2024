import java.util.Scanner;

public class MobileCost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float [][]arr = new float[n][n];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ;j++) {
				arr[i][j] = scan.nextFloat();
			}
		}
		
		System.out.println("Mobile Costs:");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ;j++) {
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
