import java.util.Scanner;

public class divide {



    public static void main(String[] args) {

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();



        try {
            System.out.println(10/user);

        } catch ( ArithmeticException a) {
            System.out.println("can't");
        }



    }
}
