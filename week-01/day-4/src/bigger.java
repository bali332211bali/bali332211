import java.util.Scanner;

public class bigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("number");
        Scanner scanner2 = new Scanner(System.in);
        int user2 = scanner.nextInt();

        if (user > user2) {
            System.out.println(user);
        } else {
            System.out.println(user2);
        }






    }
}
