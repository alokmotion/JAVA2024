
public class FinanceCalculator {
	public double calculateSimpleInterest(double principal, double rate, double time) {
//		I = P * R * T
		double I = principal * rate * time;
		return I;
		
		
	}
	
	public static void main (String [] args) {
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f", calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));

	}

}
