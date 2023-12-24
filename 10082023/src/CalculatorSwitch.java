import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Taking the First Number From User
		System.out.println("Enter First Number");
		int num1 = scan.nextInt();
//		Taking the First Number From User
		System.out.println("Enter Second Number");
		int num2 = scan.nextInt();
		
//		Taking the operation to be performed
		System.out.println("Enter Operation (+,-,*,/,%)");
		char op = scan.next().charAt(0);
//		Applying the switch Operation
		switch (op) {
//		checking if operation is + then perform addition
		case '+':
			System.out.println("Addition " + (num1 + num2));
			break;
//		checking if operation is - then perform Substraction	
		case '-':
			if (num1 > num2)
				System.out.println("Multi " + (num1 - num2));
			else
				System.out.println("Multi " + (num2 - num1));

			break;
//			checking if operation is * then perform multiplication
		case '*':
			System.out.println("Multi " + (num1 * num2));
			break;
//			checking if operation is / then perform division
		case '/':
			System.out.println("Div " + (num1 / num2));
			break;
//			checking if operation is % then perform remainder
		case '%':
			System.out.println("rem" + (num1 % num2));
			break;
		default:
			System.out.println("invalid Operation");

		}

	}

}
