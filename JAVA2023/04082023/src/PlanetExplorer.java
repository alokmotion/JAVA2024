
public class PlanetExplorer {
	public double calculateSurfaceArea(double radius) {
		double A = 4*3.14*radius*radius;
		return A;
	}
	
	
	public static void main(String []args) {
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.println(explorer.calculateSurfaceArea(3.0));

	}


}
