import java.util.Arrays;

public class BinarySearchProgram {
	public static void sortArray(int arr[]) {
		Arrays.sort(arr);
	}
	
	public static boolean binarySearch(int arr[],int key) {
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key == arr[mid]) {
				return true;
			} else if(key < arr[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
				
		} 
		return false;
		
	}

}
