import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        int i;

        for (i = 0; i < 6; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (i = 0; i < user; i++) {
            System.out.print("% "+" "+" "+""+" %");
            System.out.println();
        }

        for (i = 0; i < 6; i++) {
            System.out.print("%");
        }

    }
}
