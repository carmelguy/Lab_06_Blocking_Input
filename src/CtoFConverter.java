import java.util.Scanner;
public class CtoFConverter
{
     public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                double celsius = 0;
                double fahrenheit;
                boolean done = false;
                String trash;

                do {
                    System.out.print("Enter the temperature in Celsius: ");
                    if (in.hasNextDouble())
                    {
                        celsius = in.nextDouble();
                        in.nextLine(); // Consume the newline
                        done = true;
                    } else {
                        trash = in.nextLine();
                        System.out.println("Invalid input. Please enter a numeric value.");
                    }
                } while (!done);

                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                in.close();
            }
}

