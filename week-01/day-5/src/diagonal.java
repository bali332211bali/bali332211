import java.util.Scanner;

public class diagonal {



    public static void main(String[] args) {

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();


        for (int i = 0; i < user; i++) {
            if ((i % 4 != 0) && (i != 0)) {
                System.out.print("%");
            } else {
                System.out.print(" %");
            }
        }
        System.out.println();


        for (int i = 0; i < user; i++) {
            int nothing = 0;
            while (nothing < i && nothing <= user) {
                System.out.print(" ");
                nothing++;
            }
            if(user >= 2 && i <= user) {
                for (int count = 0; count <= i; count++) {
                    System.out.print(" %");
                    break;
                }

            }

            System.out.println();
        }
        for (int i = 0; i < user; i++) {
            if (i % 4 != 0 && i != 0){
                System.out.print("%");
            } else {
                System.out.print(" %");
            }

        }



    }



    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
}
