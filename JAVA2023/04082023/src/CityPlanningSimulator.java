import java.util.Scanner;
public class CityPlanningSimulator {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(calculatePlotArea(6));
		System.out.println(calculatePlotArea(6.5));

		

	}
	
	public static int calculatePlotArea(int sideLength) {
		return sideLength*sideLength;
		
	}
	
	public static double calculatePlotArea(double sideLength) {
		return sideLength*sideLength;
	}

}
