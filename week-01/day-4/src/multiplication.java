import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        for (int a = 1; a <= 10; a++) {
            System.out.println(a + " * 15 = " + a*user);
        }



    }
}
