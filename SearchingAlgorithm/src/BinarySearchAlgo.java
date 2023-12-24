import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
//		Creating new array
		int [] arr = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " elements ");
		
//		storing the elements in the array
		
		for (int i =0 ;i<=arr.length-1 ; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		
//		asking for the key to be searched
		
		System.out.println("Enter the key to be searched in the array");
		int key = scan.nextInt();
		
		
//		low = 0th index , high = last index 	
		
		int low = 0, high = arr.length-1;
		
		
//		searching for the key untill low <= high 
		
		while(low<= high) {
//			calculating the mid for every iteration 
			
			int mid = (low +high)/2 ;
//			checking if key is present at mid index 
			
			if(key == arr[mid]) {
				System.out.println("Key found at index : " + mid);
				return;
 
			} 
//			if key not present , checking whether key is greater than arr[mid]
			else if(key >arr[mid]) {
				low = mid+1;
				
			}
			
//			if key not present and key is not greater than arr[mid],
//			means it is lessar than arr[mid]
			
			else {
				high = mid - 1;
			}
		}
		
//		printing " key not found " if key not present in array 
		
		System.out.println("Key not found ");


	}

}
