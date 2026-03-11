import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}