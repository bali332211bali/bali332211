import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("another");
        Scanner scanner2 = new Scanner(System.in);
        int user2 = scanner.nextInt();

        System.out.println("another");
        Scanner scanner3 = new Scanner(System.in);
        int user3 = scanner.nextInt();

        System.out.println("another");
        Scanner scanner4 = new Scanner(System.in);
        int user4 = scanner.nextInt();

        System.out.println("another");
        Scanner scanner5 = new Scanner(System.in);
        int user5 = scanner.nextInt();

        int sum = user + user2 + user3 + user4 + user5;
        int average = sum / 5;
        System.out.println("sum is " + sum + " average is " + average);

    }

}
