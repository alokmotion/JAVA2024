
public class App {
	
	// check array sorted or not
	public static boolean checkSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	//search element in the array
	
//	public static int searchElementLeaniar(int arr[],int key) {
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]==key) {
//				return i;
//			}
//		}
//	}
	
	//bubble sort
	
	public static int [] bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1]= temp;
			}
		}
		
		return arr;
	}
	
	// selectionSort
	public static int [] selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			int pos = i;
			int min = arr[i];
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]>min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
		
		
	}
	
	
	// insersion sort
	
	public static int[] insertionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = item;
		}
		return arr;
	}
	
	// min number 
	
	public static int minNumber(int arr[]) {
		return arr[0];
	}
	
	public static int maxNumber(int arr[]) {
		return arr[arr.length-1];
	}

	

}
