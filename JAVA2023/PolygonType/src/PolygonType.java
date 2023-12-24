
public class PolygonType {
	public static void checkPolygon(int side) {
		if(side == 3) {
			System.out.println("Triangle");
		} else if (side == 4) {
			System.out.println("Quadrilateral");
		} else if (side == 5) {
			System.out.println("Pentagon");
		} else if (side == 6) {
			System.out.println("Hexagon");
		} else if (side == 7) {
			System.out.println("Heptagon	");
		}
	}

}
