public class tempConverter {
    public static void main(String[] args) {
        double fahrenheitTemperature = 36.5;
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5/9;

        System.out.println("Temp in Fahrenheit: " + fahrenheitTemperature + ", Temp in Celsius: " + celsiusTemperature);
    }
}
