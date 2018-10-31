import java.util.Scanner;

public class palindrome {



    public static void main(String[] args) {

        System.out.println("String");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();



        System.out.print(user);
        for (int i = user.length()-1; i > 0; i--) {
            System.out.print(user.charAt(i));
        }
        System.out.print(user.charAt(0));


    }
}
