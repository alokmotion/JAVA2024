
public class GradeCheckApp {
	static void gradeChecker(int marks){
		if (marks >=90 && marks <=100) {
			System.out.println("Grade A");
			
		} else if(marks >= 70 && marks <= 89) {
			System.out.println("Grade B");
		} else if( marks >=50 && marks <= 69) {
			System.out.println("Grade C");
		} else if (marks <= 49 && marks >=0) {
			System.out.println("Grade D");
		}else {
			System.out.println("Invailed Marks");
		}
		
	}

}
