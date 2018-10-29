import java.util.Scanner;

public class animalsandlegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("number of chickens");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("number of pigs");
        Scanner scanner2 = new Scanner(System.in);
        int user2 = scanner.nextInt();


        System.out.println(user + " chickens and " + user2 + " pigs");





    }
}
