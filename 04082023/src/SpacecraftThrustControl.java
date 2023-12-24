import java.util.Scanner;

public class SpacecraftThrustControl {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int throttleSetting = scan.nextInt();
		
		
		System.out.println(calculateThrust(throttleSetting));
	}
	
	
	public static long calculateThrust(int throttleSetting) {
		return (long)Math.pow(throttleSetting, 5);
		
	}

}
