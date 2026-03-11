import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double area_cm = 0.5 * base * height;

        double area_in = area_cm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);
    }
}