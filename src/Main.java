import java.text.DecimalFormat;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {


        System.out.println(fahrenheitToCelsius(212));
        System.out.println(inchesToMeters(1000));
        System.out.println(sumOfDigits(1000));
        minutesToYearsAndDays(3456789);
        System.out.println(calculateBMI(75,1.75));
        System.out.println(calculateSpeed(2500,5,56,23));

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

    //calculating BMI index based on given weight and height
    public static String calculateBMI(int weight, double height) {
        return df.format((weight / Math.pow(height,2)));
    }

    //calculating average speed based od covered distance, and total time it took to beat
    public static double calculateSpeed(double distanceInMeters, int hours, double minutes, double seconds) {
        double distanceInKm = distanceInMeters / 1000;
        double totalTime = (hours + (minutes/60) + (seconds/60/60));
        double speedCalculate = distanceInKm / totalTime;
        System.out.println("You beat " + distanceInKm + "kms in " + df.format(totalTime) + " hours. Average speed equals: ");
        return speedCalculate;
    }
}