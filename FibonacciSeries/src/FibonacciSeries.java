
public class FibonacciSeries {
	public static void printSeries(int n) {
		int a = 0, b =1 , c;
		
		if(n==1) {
			System.out.println(a);
			
		} else if (n==2) {
			System.out.println(a + " " +b);
		} else {
			System.out.print(a + " " + b + " ");
			for (int i = 3; i<=n ; i++) {
				c = a+b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
		
		
	}

}
