public class Main {
    public static void main(String[] args) {

        System.out.println(fahrenheitToCelsius(212));
        System.out.println(inchesToMeters(1000));
    }

    //converting temperature from Fahrenheit to Celsius degrees.
    public static float fahrenheitToCelsius(float temp) {
        return ((temp-32)*5/9);
    }

    //converting inches to meters
    public static double inchesToMeters(double inches) {
        return inches*0.0254;
    }
}