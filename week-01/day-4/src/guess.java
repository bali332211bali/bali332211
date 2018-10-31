import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        int a = 4;

        boolean win = false;

        while (win == false) {
            System.out.println("number");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();

            if (user < a) {
                System.out.println("higher");
            } else if (user > a) {
                System.out.println("lower");
            } else {
                System.out.println("found");
                win = true;
            }
        }




    }
}
