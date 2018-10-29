import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        int i, j, k, l;

        for (i = 0; i < user/2 + 1; i++) {
            System.out.println();
            for (j = user; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
        }

        for (l = user/2 + 1; l < user; l++) {
            System.out.println();
            for (j = user; j > i; j--) {
                System.out.print(" ");
            }
            for (k = user/2; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

        }



    }
}