import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();


        //    for (int b = user; b > user; b--) {
         //       System.out.print("*");
          //  }
        //}

        int i, j;

        for (i = 0; i < user + 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();


          //  for (k = 0; k < (2 * i - 1); k++) {
          //      System.out.print("*");
           // }

        }


    }
}
