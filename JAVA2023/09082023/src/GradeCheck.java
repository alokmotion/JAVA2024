import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		int mark = scan.nextInt();
		GradeCheckApp.gradeChecker(mark);
		
	}
	
	

}
