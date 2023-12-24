import java.util.Scanner;

public class StudentGradeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student marks");
		int marks = scan.nextInt();
		
		StudentGrade.checkGrade(marks);
	}

}
