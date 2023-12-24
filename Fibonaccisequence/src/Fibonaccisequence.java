
public class Fibonaccisequence {
	public static void printseries(int n) {
		int f1,f2;
		f1 = 0;
		f2 = 1;
		
		for(int i = 2 ; i <= n ; i++) {
			int f = f1 + f2 ;
			f2 = f + i;
			System.out.println(f2);
		}
		
	}

}
