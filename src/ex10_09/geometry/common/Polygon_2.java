package ex10_09.geometry.common;
import java.util.Scanner;

public class Polygon_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the polygon
        System.out.print("Enter the size of the polygon: ");
        int size = scanner.nextInt();

        // Create a Polygon object
        Polygon polygon = new Polygon(size);

        // Use a loop to set the points for the polygon
        for (int i = 0; i < size; i++) {
            System.out.print("Enter x coordinate for point " + (i + 1) + ": ");
            int xCoordinate = scanner.nextInt();

            System.out.print("Enter y coordinate for point " + (i + 1) + ": ");
            int yCoordinate = scanner.nextInt();

            // Set the point in the polygon
            polygon.setPoint(i, xCoordinate, yCoordinate);
        }

        // Display the points of the polygon
        System.out.println("Polygon points:");
        for (int i = 0; i < size; i++) {
            System.out.println("Point " + (i + 1) + ": (" + polygon.x[i] + ", " + polygon.y[i] + ")");
        }

        // Close the scanner
        scanner.close();
    }
}
