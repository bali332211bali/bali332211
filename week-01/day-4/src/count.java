import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("number2");
        Scanner scanner2 = new Scanner(System.in);
        int user2 = scanner.nextInt();

        if (user > user2) {
            System.out.println("second should be bigger");
        } else {
            while (user < user2) {
                user++;
                System.out.println(user-1);
            }
        }


    }
}
