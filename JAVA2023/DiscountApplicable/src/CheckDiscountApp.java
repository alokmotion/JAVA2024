import java.util.Scanner;

public class CheckDiscountApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase price");
		int price = scan.nextInt();
		CheckDiscount.checkDiscount(price);
		

	}

}
