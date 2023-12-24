import java.util.Scanner;

public class KnowPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name (in small Letter) ");
		String name = scan.next();
		KnowPositionApp.position(name);

	}

}
