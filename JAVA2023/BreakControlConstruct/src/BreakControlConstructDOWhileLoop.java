
public class BreakControlConstructDOWhileLoop {

	public static void main(String[] args) {
		int i=1;
		 do {
			if(i==6) {
				break;
			}
			System.out.println(i);
			i++;
		}
		 while( i<=10);

	}

}
