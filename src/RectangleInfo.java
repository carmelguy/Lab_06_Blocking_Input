import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean doneWidth = false;
        boolean doneHeight = false;
        String trash;

        // Input for width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                doneWidth = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (!doneWidth);

        // Input for height
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                doneHeight = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (!doneHeight);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
        in.close();
    }
}
