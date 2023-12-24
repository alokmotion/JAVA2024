import java.util.Scanner;

public class PolygonTypeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of side of polygon");
		int side = scan.nextInt();
		PolygonType.checkPolygon(side);
		
		
	}

}
