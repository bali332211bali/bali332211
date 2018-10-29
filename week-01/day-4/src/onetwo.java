import java.util.Scanner;

public class onetwo {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        if (user <= 0) {
            System.out.println("not enough");
        } else if  (user == 1) {
            System.out.println("One");
        } else if  (user == 2) {
            System.out.println("Two");
        } else {
            System.out.println("a lot");
        }


    }

}
