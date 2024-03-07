import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row and col");
		int row = scan.nextInt();
		int col = scan.nextInt();
		int [][]arr = new int[row][col];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The element in matrix");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1) {
					System.out.print(arr[i][j]+" ");
				} else {
					System.out.print("  ");
				}
				
			}
			
			// will update soon
			System.out.println();
		}

	}

}
