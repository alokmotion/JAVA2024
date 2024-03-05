import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int arr [] = new int [scan.nextInt()];
		
		System.out.println("Enter the " + arr.length + " Element");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : arr) {
			System.out.print(x + " ");
			
		}
		
		
		System.out.println("Press 1 to check whether array sorted or not.");
		System.out.println("Press 2 to perform linear search.");
		System.out.println("Press 3 to perform binary search");
		System.out.println("Press 4 to sort an array using bubble sort");
		System.out.println("Press 5 to sort an array using insersion sort");
		System.out.println("Press 6 to sort an array using selection sort");
		System.out.println("Press 7 to print minmum number");
		System.out.println("Press 8 to print maximum number");
		
		int btn = scan.nextInt();
		
		
		
		
	}

}
