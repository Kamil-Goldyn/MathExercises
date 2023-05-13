import java.text.DecimalFormat;
import java.util.*;

public class Main {

    static int n1 = 0;
    static int n2 = 1;
    static int n3;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        /*
            YOU CAN JUST UNCOMMENT THESE METHODS, WHICH YOU WANT TO CHECK

        System.out.println(fahrenheitToCelsius(212));
        System.out.println(inchesToMeters(1000));
        System.out.println(sumOfDigits(1000));
        minutesToYearsAndDays(3456789);
        System.out.println(calculateBMI(75,1.75));
        System.out.println(calculateSpeed(2500,5,56,23));
        breakIntegerIntoDigits(new Scanner(System.in));
        quadraticEquation(1,5,1);
        fibonacciSequence(10);

        double result = greatestNumber(3,4,2);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        Double greatest = greatestFromCollection(scanner);
        System.out.println("Greatest number equals: " + greatest);
        scanner.close();

        int i = factorialNumber(5);
        System.out.println(i);
         */



    }

    //converting temperature from Fahrenheit to Celsius degrees.
    public static float fahrenheitToCelsius(float temp) {
        return ((temp - 32) * 5 / 9);
    }


    //converting inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }


    //adding all the digits from given integer between 0 and 1000
    public static int sumOfDigits(int number) {
        int sum = 0;

        if (number > 0 && number <= 1000) {
            for (int i = number; i > 0; i = i / 10) {
                sum += i % 10;
            }
        } else {
            System.out.println("Given number must be bigger than 0 and smaller than 1001!");
        }
        return sum;
    }


    //converting minutes to years and days
    public static void minutesToYearsAndDays(int minutes) {
        long years = minutes / 60 / 24 / 365;
        long days = ((minutes / 60 / 24) % 365);
        System.out.println(minutes + " minutes equals about " + years + " years, and " + days + " days.");
    }


    //calculating BMI index based on given weight and height
    public static String calculateBMI(int weight, double height) {
        return df.format((weight / Math.pow(height, 2)));
    }


    //calculating average speed based od covered distance, and total time it took to beat
    public static double calculateSpeed(double distanceInMeters, int hours, double minutes, double seconds) {
        double distanceInKm = distanceInMeters / 1000;
        double totalTime = (hours + (minutes / 60) + (seconds / 60 / 60));
        double speedCalculate = distanceInKm / totalTime;
        System.out.println("You beat " + distanceInKm + "kms in " + df.format(totalTime) + " hours. Average speed equals: ");
        return speedCalculate;
    }


    //breaking given integer into separated digits
    public static void breakIntegerIntoDigits(Scanner scanner) {
        String input = scanner.nextLine();
        List<Character> digits = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            digits.add(input.charAt(i));
        }
        digits.forEach(System.out::println);
    }

    //solving quadratic equations
    public static void quadraticEquation(float a, float b, float c) {
        double delta = (Math.pow(b, 2) - 4 * a * c);
        double firstResult = 0;
        double secondResult = 0;
        if (delta > 0) {
            firstResult = ((-b - Math.sqrt(delta)) / 2 * a);
            secondResult = ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("Equation has two results: " + firstResult + " and: " + secondResult);
        } else if (delta == 0) {
            firstResult = -b / 2 * a;
            System.out.println("Equation has only one result: " + firstResult);
        } else {
            System.out.println("This equation doesn't have any results.");
        }
    }

    //returning greatest number from three given
    public static double greatestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double highestNumber = 0;
        System.out.println("Enter three numbers, to check which one is the greatest one:");
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            highestNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            highestNumber = secondNumber;
        } else {
            highestNumber = thirdNumber;
        }
        return highestNumber;
    }

    //returning greatest number from numbers added do collection
    public static Double greatestFromCollection(Scanner scanner) {
        LinkedList<Double> storage = new LinkedList<>();

        System.out.println("Enter the numbers that you want to add to the collection. Enter '0' to end.");

        while (true) {
            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }
            storage.add(number);
        }

        Double greatest = storage.get(0);

        for (Double number : storage) {
            if (number > greatest) {
                greatest = number;
            }
        }
        return greatest;
    }

    //calculating the factorial
    public static int factorialNumber(int number) {
        if (number != 0) {
            return number * factorialNumber(number - 1);
        } else {
            return 1;
        }
    }

    //calculating Fibonacci Sequence
    public static void fibonacciSequence(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibonacciSequence(count-1);
        }
    }
}