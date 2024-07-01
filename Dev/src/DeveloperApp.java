
public class DeveloperApp {

	public static void main(String[] args) {
		Developer dev;
		BackendDeveloper bd = new BackendDeveloper();
//		upcasting 
		dev = bd;
		dev.attendMeeting();
		dev.project();
//		downcasting
		((BackendDeveloper)(dev)).learnJava();

	}

}
