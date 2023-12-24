import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fahrenheit Temp: ");
		double fTemp = scan.nextDouble();
		
		TemperatureConverter temperatureConverter =  new TemperatureConverter(fTemp);
		System.out.printf("Temperature  in Celsius : " + "%.2f%n",temperatureConverter.convertFahrenheitToCelsius());

	}

}
