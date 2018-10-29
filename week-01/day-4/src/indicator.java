import java.util.Scanner;

public class indicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        System.out.println("number2");
        Scanner scanner2 = new Scanner(System.in);
        int user2 = scanner.nextInt();


        if (user == 0) {
            System.out.println("sausage");
        } else if (((user + user2) > 20) && (user == user2)) {
            System.out.println("excellent");
        } else if ((user + user2) > 20) {
            System.out.println("cool");
        } else  {
            System.out.println("average");
        }











    }


}
