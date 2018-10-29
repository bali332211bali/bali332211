import java.util.Scanner;

public class parametric {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        int b = 0;
        for (int a = 0; a < 4; a++) {
            System.out.println("number");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();

            b = b + user;

            if (a == 3) {
                System.out.println("sum " + b);
                System.out.println("average " + b/4);
            }

        }







    }
}
