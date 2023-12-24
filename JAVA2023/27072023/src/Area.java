import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of square");
		int side = scan.nextInt();
		System.out.println("the side of square " + calculateArea(side));
		
		System.out.println("Enter the length of rectangle");
		int length = scan.nextInt();
		
		System.out.println("Enter the breadth  of rectangle");
		int breadth = scan.nextInt();
		
		System.out.println("the side of rectangle " + calculateArea(length,breadth));
		
		
		System.out.println("Enter the radius  of circle");
		Float radius = scan.nextFloat();

		System.out.println("the side of circle " + calculateArea(radius));

		
	}
	
	public static int calculateArea(int side) {
		int areaOfSquare = side*side;
		return areaOfSquare;  
		
	}
	
	public static int calculateArea(int length,int breadth) {
		int areaOfRactangle = length*breadth;
		return areaOfRactangle;  
		
	}
	
	public static float calculateArea(float radius) {
		float areaOfcircle = 3.14F*radius*radius;
		return areaOfcircle;  
		
	}

}
