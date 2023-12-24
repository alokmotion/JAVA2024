
public class HeightConverter {
	public double convertInchesToFeet(double inches) {
		return inches/12;
		
	}
	
	public static void main(String[]args) {
		HeightConverter converter = new HeightConverter();
		System.out.println( converter.convertInchesToFeet(72.0));

	}

}
