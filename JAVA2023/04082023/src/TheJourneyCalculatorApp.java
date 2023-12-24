public class TheJourneyCalculatorApp {
    public static void main(String[] args) {
        TheJourneyCalculator js = new TheJourneyCalculator(60.0, 15);

        double distance = js.calculateDistance(); 
        System.out.printf("Distance: " + "%.2f%n", distance);
    }
}