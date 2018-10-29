import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        if ((user % 2) == 0) {

            System.out.println("even");
        } else {
            System.out.println("odd");
        }




    }

}
