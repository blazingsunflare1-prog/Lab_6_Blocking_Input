import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {
//new scanner class
        Scanner in = new Scanner(System.in);
        double miles = 0.0;
        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        boolean done = false;

        // establish variables
        do {
            System.out.println("Enter number of gallons in tank: " );
            if (in.hasNextDouble()){
                gallons = in.nextDouble();
                in.nextLine();
                done = true;

            }
        }

        while (!done);
        done = false;
        do {
            System.out.println("Enter Fuel Efficiency in MPG: " );
            if (in.hasNextDouble()){
                mpg = in.nextDouble();
                in.nextLine();
                done = true;

            }
        }

        while (!done);
        done = false;
        do {
            System.out.println("Price of Gas per Gallon: " );
            if (in.hasNextDouble()){
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;

            }
        }
        while (!done);
        // 3 do while loops that establish prompts,

        System.out.println("The cost to drive 100 miles is: " + (100 * mpg)*pricePerGallon + "dollars");
        System.out.println("On your current tank you can go " + mpg*gallons + " miles");
        // print out and final calculations from user inputs








    }
}
