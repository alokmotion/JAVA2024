
public class ContinueControlConstructUsingDOWhileLoop {

	public static void main(String[] args) {
		int i =1;
		do{
			if(i==8) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		while(i<=10);

	}

}
