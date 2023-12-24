import java.util.Scanner;

public class PrintEnglishWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number in range 0-9 ");
		int num = scan.nextInt();
		PrintEnglishWordApp.convert(num);
		

	}

}
