import java.util.Scanner;

public class guess {

    private static int number(int user) {
        int number = (int)(Math.random()*user);
        return number;
    }



    public static void main(String[] args) {

        System.out.println("end");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();



        int k = number(user);


        boolean not = true;
        while (not) {

            System.out.println();
            System.out.println("number");
            int user2 = scanner.nextInt();

            if (user2 < k) {

                System.out.println("more");
            } else if (user2 > k) {
                System.out.println("less");
            } else {
                System.out.println("win");
                break;
            }
        }





//        Write a program where the program chooses a number between 1 and 100.
//        The player is then asked to enter a guess. If the player guesses wrong,
//        then the program gives feedback and ask to enter an other guess until the guess is correct.
//        Make the range customizable (ask for it before starting the guessing).
//        You can add lives. (optional)

//        Example
//        I've the number between 1-100. You have 5 lives.
//        20
//        Too high. You have 4 lives left.
//        10
//        Too low. You have 3 lives left.
//        15
//        Congratulations. You won!
    }
}
