
public class EvenSum {
	
	
	public static int calculateEvenSum(int n) {
		int sum = 0;
		for(int i =1; i<= n; i++ ) {
			if(i%2 ==0) {
				sum = sum + i;
			} else {
				System.out.println("this odd number is not included for sum " + i);
			}
			
		}
		
		return sum;

			
		
	}
	

}
