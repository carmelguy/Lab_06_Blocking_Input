import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        boolean doneGallons = false;
        boolean doneMPG = false;
        boolean donePrice = false;
        String trash;

        // Input for gallons
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                doneGallons = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (!doneGallons);

        // Input for MPG
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                doneMPG = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (!doneMPG);

        // Input for price per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                donePrice = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        } while (!donePrice);

        double cost100Miles = (100 / mpg) * pricePerGallon;
        double distanceWithFullTank = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance car can go with a full tank: " + distanceWithFullTank + " miles");
        in.close();
    }
}
