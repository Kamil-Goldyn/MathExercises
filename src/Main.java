public class Main {
    public static void main(String[] args) {

        System.out.println(fahrenheitToCelsius(212));
        System.out.println(inchesToMeters(1000));
        System.out.println(sumOfDigits(1000));
        minutesToYearsAndDays(3456789);

    }

    //converting temperature from Fahrenheit to Celsius degrees.
    public static float fahrenheitToCelsius(float temp) {
        return ((temp-32)*5/9);
    }

    //converting inches to meters
    public static double inchesToMeters(double inches) {
        return inches*0.0254;
    }

    //adding all the digits from given integer between 0 and 1000
    public static int sumOfDigits(int number) {
        int sum = 0;

        if(number > 0 && number <= 1000) {
            for(int i = number; i > 0; i = i/10) {
            sum += i%10;
            }
        } else {
            System.out.println("Given number must be bigger than 0 and smaller than 1001!");
        }
        return sum;
    }

    //converting minutes to years and days
    public static void minutesToYearsAndDays(int minutes) {
        long years = minutes/60/24/365;
        long days = ((minutes/60/24) % 365);
        System.out.println(minutes + " minutes equals about " + years + " years, and " + days + " days.");
    }
}