
public class NonStaticAndStaticMethodCall {
	void display() {
		System.out.println("Inside the Display");
	}

	public static void main(String[] args) {
		NonStaticAndStaticMethodCall call = new NonStaticAndStaticMethodCall();
		call.display();

	}

}
