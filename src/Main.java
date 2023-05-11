public class Main {
    public static void main(String[] args) {

        System.out.println(fahrenheitToCelsius(212));

    }
    //converting temperature from Fahrenheit to Celsius degrees.
    public static float fahrenheitToCelsius(float temp) {
        return ((temp-32)*5/9);
    }
}