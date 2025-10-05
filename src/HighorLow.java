import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        // establish scanner and random

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int userGuess = 0;
        int randomNumber = rand.nextInt(10) + 1;
        // keeps randomNumber range between 1 and 10


        System.out.println("Guess a number between 1 and 10: " );
        userGuess = in.nextInt();
        if(randomNumber == userGuess) {

            System.out.println("Your on the money!");
        }
        else if(randomNumber < userGuess) {
            System.out.println("The number you entered is too high!");




        }
        else if(randomNumber > userGuess) {
            System.out.println("The number you entered is too low!");
        }

    }
}

