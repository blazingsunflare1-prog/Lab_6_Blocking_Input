import java.util.Scanner;

public class RectangleInfo {
    public static void  main(String args[]) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double width = 0.0;
        double height = 0.0;
        boolean done = false;
// establish variables
        do {


            System.out.print("Enter the width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid width, not: " + trash);
            }
        } while (!done);
        done = false;
// resets done for next do while loop
        do {


            System.out.print("Enter the height: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;


            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid height, not: " + trash);
            }
        } while (!done);

        System.out.println("The area equals = " + width * height);
        System.out.println("The perimeter equals = " + 2*(width + height));
        System.out.println("The length of the diagonal equals = " + Math.sqrt(width*width + height*height));
// math.sqrt is function for squaring in java


    }
}
