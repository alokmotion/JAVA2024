import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[] = new int[scan.nextInt()];
		
		
		//taking the element of array from user
		System.out.println("Enter the " + arr.length + "Elements");
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		// ask the key from user which have to be searched 
		System.out.println("Enter the key to be searched");
		int key = scan.nextInt();
		
		BinarySearchProgram.sortArray(arr); // Sort the array first;
		boolean found = BinarySearchProgram.binarySearch(arr, key);
		if(found) {
			System.out.println("Key found");
		} else {
			System.out.println("Key not found");
		}
		
		

	}

}
