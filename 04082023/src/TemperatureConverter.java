
public class TemperatureConverter {
	double fahrenheit;
	
	double convertFahrenheitToCelsius() {
		double celsius = (fahrenheit - 32) * 5 / 9;		
		return celsius;
				
	} 
	
	public TemperatureConverter(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		
	}


}
