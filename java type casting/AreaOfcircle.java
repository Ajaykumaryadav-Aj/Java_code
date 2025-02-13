
import java.util.Scanner;

public class AreaOfcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area and perimeter
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        // Print results
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Perimeter of the circle: %.2f\n", perimeter);
    }
}
