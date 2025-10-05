import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean done = false;
        // fahrenheit = clesius + 9/5 + 32;

        do {


            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine(); // clear buffer
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temp in Fahrenheit: " + fahrenheit);
                System.out.printf("Temp in Fahrenheit: %.2f\n", fahrenheit);
                done = true;

            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid fahrenheit, not: " + trash);
            }
        } while (!done);

    }
}