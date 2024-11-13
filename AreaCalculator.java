//set 3
import java.util.Scanner;

public class AreaCalculator {
    
    // Method to calculate the area of a cube (Area = 6 * a^2)
    public double calculateArea(double side) {
        return 6 * side * side;
    }

    // Method to calculate the area of a parallelogram (Area = b * h)
    public double calculateArea(double base, double height) {
        return base * height;
    }

    // Method to calculate the area of a trapezoid (Area = ½ * (a + b) * h)
    public double calculateArea(double a, double b, double height) {
        return 0.5 * (a + b) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a cube
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        double cubeArea = calculator.calculateArea(side);
        System.out.println("The area of the cube is: " + cubeArea);

        // Calculate area of a parallelogram
        System.out.print("\nEnter the base length of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double heightParallelogram = scanner.nextDouble();
        double parallelogramArea = calculator.calculateArea(base, heightParallelogram);
        System.out.println("The area of the parallelogram is: " + parallelogramArea);

        // Calculate area of a trapezoid
        System.out.print("\nEnter the first base length of the trapezoid: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter the second base length of the trapezoid: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter the height of the trapezoid: ");
        double heightTrapezoid = scanner.nextDouble();
        double trapezoidArea = calculator.calculateArea(base1, base2, heightTrapezoid);
        System.out.println("The area of the trapezoid is: " + trapezoidArea);

    }
}
