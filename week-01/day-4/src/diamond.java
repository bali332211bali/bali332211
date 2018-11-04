import java.util.Scanner;

public class diamond {


    private static void add(int n, String m) {

        for (int l = 0; l < n; l++) {
            System.out.print(m);
        }
    }


    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("number");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();


        int half = user/2;

        for (int i = 0; i < half;i++ ) {
            add(half-i," ");
            add(i*2+1,"*");
            System.out.println();
        }

        add(user,"*");
        System.out.println();

        for (int i = 0; i < half;i++ ) {
            add(i+1," ");
            add(user-2*(i+1),"*");
            System.out.println();
        }

//        for (int i = 0; i < user;i++ ) {
//            if (i <= half) {
//                addStr(half-i," ");
//                addStr(i*2-1,"*");
//            } else {
//                addStr(i-half," ");
//                addStr((user-((i-half+1)*2)),"*");
//            }
//            System.out.println();
//
//        }




//        for (l = 0; l < i*2 -1; l++) {
//            System.out.print("*");
//        }






//        int i, j, k, l;
//
//        for (i = 0; i < user/2 + 1; i++) {
//            System.out.println();
//            for (j = user; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (k = 0; k < (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//        }




    }
}