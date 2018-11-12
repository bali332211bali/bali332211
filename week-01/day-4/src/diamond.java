import java.util.Scanner;

public class diamond {


    private static void add(int n, String m) {

        for (int i = 0; i < n; i++) {
            System.out.print(m);
        }
    }


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



        int half = user/2;

        for (int i = 0; i < half; i++) {
            add(half-i," ");
            add((i*2)+1,"*");
            System.out.println();
        }

        add(user,"*");
        System.out.println();

        for (int i = 0; i < half; i++ ) {
            add(i+1," ");
            add(user-(i+1)*2,"*");
            System.out.println();
        }


    }
}