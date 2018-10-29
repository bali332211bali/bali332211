import java.util.Scanner;

public class mileconverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("distance in km");


        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        double miles = user*0.621371;

        System.out.println("it's " + miles + " miles");



    }

}
