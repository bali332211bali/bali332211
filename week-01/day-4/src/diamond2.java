import java.util.Scanner;

public class diamond2 {
    public diamond2() {
    }

    public static void main(String[] args) {
        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        int i, j, k;

        for(i = 0; i < user / 2 + 1; ++i) {
            System.out.println();

            for(j = user; j > i; --j) {
                System.out.print(" ");
            }

            for(k = 0; k < 2 * i - 1; ++k) {
                System.out.print("*");
            }
        }

        for(int l = user / 2 + 1; l < user; ++l) {
            System.out.println();

            for(j = user; j > i; --j) {
                System.out.print(" ");
            }

            for(k = 0; k < 2 * i - 1; ++k) {
                System.out.print("*");
            }
        }

    }
}