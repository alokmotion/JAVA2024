
public class Fib {
	public static void main(String[] args) {
		
		
		int x =0;
		int y = 1;
		
		int fib;
		
		for(int i =0; i<= 6; i++) {
			fib = x + y;
			x = y;
			y  = fib ;
			
			System.out.println(x);
			
			
			
			
			
		}
		
		
	}

}
